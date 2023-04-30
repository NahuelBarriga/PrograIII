package modelo;

import interfaces.IAbonado;

public class DecoratorCheque extends DecoratorPagos {

	public DecoratorCheque(IAbonado encapsulado) {
		super(encapsulado);
	}

	@Override
	public double getCostoServicios() {
		return this.encapsulado.getCostoServicios()*0.9;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		DecoratorCheque clonado= (DecoratorCheque) super.clone();
		clonado.encapsulado=(IAbonado) encapsulado.clone();
		return clonado;
	}

	@Override
	public void agregaServicio(String domicilio, Servicio servicio) {
		encapsulado.agregaServicio(domicilio, servicio);
		
	}
	
}
