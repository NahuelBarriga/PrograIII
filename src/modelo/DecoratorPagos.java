package modelo;


public abstract class DecoratorPagos implements IAbonado, Cloneable{
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
	
	public void imprimeServicios() {
		encapsulado.imprimeServicios();
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
