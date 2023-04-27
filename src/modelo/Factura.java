package modelo;

import java.util.Iterator;
import java.util.Map.Entry;

public class Factura{ 
	private DecoratorPagos decorator;

	public Factura(DecoratorPagos abonado) {
		super();
		this.decorator = abonado;
	}
	
	public void getFactura() {
		System.out.println(this.decorator.getNombre() + "     " + this.decorator.getDNI() + "/n");
		this.decorator.imprimeServicios();
		this.decorator.getCostoServicio();
	}
}
