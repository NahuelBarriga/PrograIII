package modelo;

public abstract class DecoratorPagos implements IAbonado{
	protected IAbonado encapsulado;

	public DecoratorPagos(IAbonado encapsulado) {
		this.encapsulado = encapsulado;
	}
	
	public String getNombre() {
		return this.encapsulado.getNombre();
	}
	
	public String getDNI(){
		return this.encapsulado.getDNI();
	}
	
	
}
