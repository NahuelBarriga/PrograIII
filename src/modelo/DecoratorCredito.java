package modelo;

public class DecoratorCredito extends DecoratorPagos{

	public DecoratorCredito(IAbonado encapsulado) {
		super(encapsulado);
	}

	@Override
	public double getCostoServicio(IPromocion promo) {
		return this.encapsulado.getCostoServicio(promo)*0.95;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}

}
