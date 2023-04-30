package modelo;

import interfaces.IAbonado;

public class DecoratorCredito extends DecoratorPagos{

	public DecoratorCredito(IAbonado encapsulado) {
		super(encapsulado);
	}

	@Override
	public double getCostoServicios() {
		return this.encapsulado.getCostoServicios()*1.05;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		DecoratorCredito clonado= (DecoratorCredito) super.clone();
		clonado.encapsulado=(IAbonado) encapsulado.clone();
		return clonado;
	}
	
	@Override
	public void agregaServicio(String domicilio, Servicio servicio) {
		encapsulado.agregaServicio(domicilio, servicio);
		
	}

}
