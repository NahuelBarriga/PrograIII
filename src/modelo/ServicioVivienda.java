package modelo;

public class ServicioVivienda extends Servicio{

	public ServicioVivienda(int cantCamaras, int cantBotonAP, boolean movilAcomp) {
		super(8500, cantCamaras, cantBotonAP, movilAcomp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getCostoBruto() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getCostoNeto(IPromocion promo) {
		return promo.getPromoVivienda(this.getCostoBruto());
	}

}
