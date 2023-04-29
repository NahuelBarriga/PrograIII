	package modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public abstract class Abonado implements IAbonado{
	protected String nombre;
	protected String DNI;
	protected HashMap<String,Servicio> servicios;	//Hashmap asi no hay domicilios repetidos
	
	public Abonado(String nombre, String DNI) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.servicios = new HashMap<String,Servicio>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public HashMap<String, Servicio> getSevicios() {
		return servicios;
	}
	
	public void agregaServicio(String domicilio, Servicio servicio) {
		servicios.put(domicilio, servicio);
	}
	
	public void quitaServicio(String domicilio) {
		servicios.remove(domicilio);
	}
	
	@Override
	public void imprimeServicios() {
		Iterator<Entry<String,Servicio>> it = this.servicios.entrySet().iterator();
		while (it.hasNext()) {
			it.next().toString();
		}
	}

	public abstract double getCostoServicios();
	
	public Object clone() throws CloneNotSupportedException{
		Abonado clonado;
		Iterator<Entry<String,Servicio>> it = this.servicios.entrySet().iterator();		
		
		clonado = (Abonado)super.clone();
		clonado.servicios = (HashMap<String,Servicio>) servicios.clone();
		while (it.hasNext()) {
			clonado.servicios.putAll(servicios);
		}
		return clonado;
	}
}
