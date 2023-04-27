package modelo;

public class DecoratorEfectivo extends DecoratorPagos {

	
	
	public DecoratorEfectivo(IAbonado encapsulado) {
		super(encapsulado);
	}

	@Override
	public double getCostoServicio() { 
		return this.encapsulado.getCostoServicio()*0.8;//Aplica promo sobre el TOTAL que debe pagar un abonado por todos sus servicios
	}

}
