package interfaces;

public interface IAbonado extends Cloneable {
	double getCostoServicios();
	String getNombre();
	String getDNI();
	void imprimeServicios();
	Object clone() throws CloneNotSupportedException;
}
