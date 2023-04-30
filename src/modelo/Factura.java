package modelo;

/**
 * @author 
 *Clase que representa una factura dentro del sistema
 */
public class Factura implements Cloneable{ 
	private DecoratorPagos decorator;

	/**
	 * Constructor de la clase
	 * @param decorator: decorator para realizar la factura
	 * <b> pre: </b> decorator no debe ser nulo 
	 * <b> post: </b> crea un objeto de tipo factura
	 */
	public Factura(DecoratorPagos decorator) {
		super();
		this.decorator = decorator;
	}
	
	/**
	 * metodo void que imprime la informacion de la factura de un abonado  
	 */
	public void getFactura() {
		System.out.println(this.decorator.getNombre() + "     " + this.decorator.getDNI() + "/n");
		this.decorator.imprimeServicios();
		this.decorator.getCostoServicios();
	}

	/**
	 *meotdo que clona la factura <b> 
	 * puede retornar una excepcion 
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		Factura clonada= (Factura) super.clone();
		clonada.decorator= (DecoratorPagos) decorator.clone();
		return clonada;
	}
	
	
}
