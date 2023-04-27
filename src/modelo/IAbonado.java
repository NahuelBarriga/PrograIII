package modelo;

public interface IAbonado {
	double getCostoServicio(IPromocion promo);
	String getNombre();
	String getDNI();
	void imprimeServicios();
}
