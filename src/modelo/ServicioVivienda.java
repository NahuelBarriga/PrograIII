package modelo;

import interfaces.IPromocion;

public class ServicioVivienda extends Servicio{

	public ServicioVivienda(int cantCamaras, int cantBotonAP, boolean movilAcomp,IPromocion promo) {
		super(8500, cantCamaras, cantBotonAP, movilAcomp, promo); 
	}

	@Override
	public double getCostoNeto() {
		if (this.promo != null)
			return promo.getPromoVivienda(this.getCostoBruto());
		else
			return this.getCostoBruto();
	}
	
	@Override
	public String toString() {
		return "Servicio a Vivienda : Precio base:" + precioBase + "$, Cantidad de camaras:" + cantCamaras + ", Cantidad de"
				+" botones antipanico:"+ cantBotonAP + ", Movil de acompanamiento:" + movilAcomp + ", Id del servicio="
				+ numId + ", Promo:" + promo;
	}

}
