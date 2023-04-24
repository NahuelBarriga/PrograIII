package modelo;

import java.util.HashMap;

public abstract class Abonado {
	private String nombre;
	private String DNI;
	private HashMap<String,Servicio> servicios;
	
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
}
