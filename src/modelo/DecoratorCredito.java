package modelo;

import interfaces.IAbonado;

/**
 * @author
 * Clase del patron Decorator que representa un abonado que paga con credito
 *
 */
public class DecoratorCredito extends DecoratorPagos{

	/**
	 * Constructor de la clase DecoratorCredito
	 * @param encapsulado: Encapsulado de la clase
	 */
	public DecoratorCredito(IAbonado encapsulado) {
		super(encapsulado);
	}

	/**
	 *Devuelve el costo de todos los servicios del encapsulado con un recargo del 5%
	 */
	@Override
	public double getCostoServicios() {
		return this.encapsulado.getCostoServicios()*1.05;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}

	/**
	 *Devuelve un clon de la clase DecoratorCredito
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		DecoratorCredito clonado= (DecoratorCredito) super.clone();
		clonado.encapsulado=(IAbonado) encapsulado.clone();
		return clonado;
	}
	
}
