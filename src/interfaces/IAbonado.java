package interfaces;

import modelo.Servicio;

public interface IAbonado extends Cloneable {
	double getCostoServicios();
	String getNombre();
	String getDNI();
	String getTipo();
	void imprimeServicios();
	Object clone() throws CloneNotSupportedException;
	void agregaServicio(String domicilio, Servicio servicio);
}
