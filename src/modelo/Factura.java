package modelo;

public class Factura implements Cloneable{ 
	private DecoratorPagos decorator;

	public Factura(DecoratorPagos abonado) {
		super();
		this.decorator = abonado;
	}
	
	public void getFactura() {
		System.out.println(this.decorator.getNombre() + "     " + this.decorator.getDNI() + "/n");
		this.decorator.imprimeServicios();
		this.decorator.getCostoServicios();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Factura clonada= (Factura) super.clone();
		clonada.decorator= (DecoratorPagos) decorator.clone();
		return clonada;
	}
	
	
}
