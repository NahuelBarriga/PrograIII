package modelo;

public class DecoratorCheque extends DecoratorPagos {

	public DecoratorCheque(IAbonado encapsulado) {
		super(encapsulado);
	}

	@Override
	public double getCostoServicio(IPromocion promo) {
		return this.encapsulado.getCostoServicio(promo)*0.9;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}

	
	
}
