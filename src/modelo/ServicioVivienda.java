package modelo;

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

}
