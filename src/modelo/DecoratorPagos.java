package modelo;

import java.util.Iterator;
import java.util.Map.Entry;

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
	
	public void imprimeServicios() {
		encapsulado.imprimeServicios();
	}
	
}
