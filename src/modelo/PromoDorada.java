package modelo;

import interfaces.IPromocion;

public class PromoDorada implements IPromocion {


	@Override
	public double getPromoVivienda(double costoBruto) {
		return costoBruto-1500;
	}

	@Override
	public double getPromoComercio(double costoBruto) {
		return costoBruto-2500;
	}

}
