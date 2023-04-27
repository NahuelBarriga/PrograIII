package modelo;

public abstract class DecoratorPagos implements IAbonado{
	protected IAbonado encapsulado;

	public DecoratorPagos(IAbonado encapsulado) {
		this.encapsulado = encapsulado;
	}
}
