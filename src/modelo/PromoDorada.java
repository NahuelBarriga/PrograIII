package modelo;

import interfaces.IPromocion;

/**
 * @author 
 * clase que representa la promocion dorada dentro del sistema
 *
 */
public class PromoDorada implements IPromocion {


	/**
	 *aplica la pomocion dorada a un domicilio de tipo vivienda 
	 *<b> pre: </> costoBruto debe ser positivo y no nulo 
	 *<b> post: </> retorna el costo bruto despues de la promocion
	 */
	@Override
	public double getPromoVivienda(double costoBruto) {
		return costoBruto-1500;
	}

	/**
	 *aplica la pomocion dorada a un domicionio de tipo comercio 
	 *<b> pre: </> costoBruto debe ser positivo y no nulo 
	 *<b> post: </> retorna el costo bruto despues de la promocion
	 */
	@Override
	public double getPromoComercio(double costoBruto) {
		return costoBruto-2500;
	}

}
