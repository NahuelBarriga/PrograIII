package modelo;

import interfaces.IPromocion;

public class ServicioComercio extends Servicio {

	public ServicioComercio(int cantCamaras, int cantBotonAP, boolean movilAcomp,IPromocion promo) {
		super(10000, cantCamaras, cantBotonAP, movilAcomp,promo);
	}

	@Override
	public double getCostoNeto() {
		if (this.promo != null)			
			return promo.getPromoComercio(this.getCostoBruto());
		else
			return this.getCostoBruto();
	}

	@Override
	public String toString() {
		return "Servicio a Comercio : Precio base:" + precioBase + "$, Cantidad de camaras:" + cantCamaras + ", Cantidad de"
				+" botones antipanico:"+ cantBotonAP + ", Movil de acompanamiento:" + movilAcomp + ", Id del servicio="
				+ numId + ", Promo:" + promo;
	}
	
	

}
