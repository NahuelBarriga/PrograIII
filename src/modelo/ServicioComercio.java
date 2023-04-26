package modelo;

public class ServicioComercio extends Servicio {

	public ServicioComercio(int cantCamaras, int cantBotonAP, boolean movilAcomp) {
		super(10000, cantCamaras, cantBotonAP, movilAcomp);
	}

	@Override
	public double getCostoNeto(IPromocion promo) {
		return promo.getPromoComercio(this.getCostoBruto());
	}

}
