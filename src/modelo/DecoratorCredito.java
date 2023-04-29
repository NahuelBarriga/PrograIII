package modelo;

import interfaces.IAbonado;

public class DecoratorCredito extends DecoratorPagos{

	public DecoratorCredito(IAbonado encapsulado) {
		super(encapsulado);
	}

	@Override
	public double getCostoServicios() {
		return this.encapsulado.getCostoServicios()*0.95;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		DecoratorCredito clonado= (DecoratorCredito) super.clone();
		clonado.encapsulado=(IAbonado) encapsulado.clone();
		return clonado;
	}
}
