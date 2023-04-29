package modelo;

import interfaces.IPromocion;

public class PromoPlatino implements IPromocion {

	@Override
	public double getPromoVivienda(double costoBruto) {
		return costoBruto*0.7;
	}

	@Override
	public double getPromoComercio(double costoBruto) {
		return costoBruto*0.65;
	}

}
