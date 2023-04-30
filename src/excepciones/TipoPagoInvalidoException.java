package excepciones;

public class TipoPagoInvalidoException extends Exception {
	private String tipoPago; 
	
	public TipoPagoInvalidoException(String tipoPago) {
		super(tipoPago);
	}


	@Override
	public String getMessage() {
		return "El tipo de pago: " + this.tipoPago + " no es valido";
	}
}
