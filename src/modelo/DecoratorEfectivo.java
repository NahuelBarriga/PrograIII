package modelo;

import interfaces.IAbonado;

public class DecoratorEfectivo extends DecoratorPagos {

	
	
	public DecoratorEfectivo(IAbonado encapsulado) {
		super(encapsulado);
	}

	@Override
	public double getCostoServicios() { 
		return this.encapsulado.getCostoServicios()*0.8;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		DecoratorEfectivo clonado= (DecoratorEfectivo) super.clone();
		clonado.encapsulado=(IAbonado) encapsulado.clone();
		return clonado;
	}
}
