package interfaces;

import excepciones.DomicilioInvalidoException;
import modelo.Servicio;

public interface IAbonado extends Cloneable {
	double getCostoServicios();
	String getNombre();
	String getDNI();
	void imprimeServicios();
	Object clone() throws CloneNotSupportedException;
	void agregaServicio(String domicilio, Servicio servicio);
	void quitaServicio(String domicilio) throws DomicilioInvalidoException;
}
