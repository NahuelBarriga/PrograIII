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

}
