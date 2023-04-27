package modelo;

public class DecoratorEfectivo extends DecoratorPagos {

	
	
	public DecoratorEfectivo(IAbonado encapsulado) {
		super(encapsulado);
	}

	@Override
	public double getCostoServicio(IPromocion promo) { 
		return this.encapsulado.getCostoServicio(promo)*0.8;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}

}
