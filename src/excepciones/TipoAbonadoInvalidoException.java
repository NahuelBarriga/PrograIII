package excepciones;

public class TipoAbonadoInvalidoException extends Exception {
	private String tipoAbonado;
		
		
	public TipoAbonadoInvalidoException(String tipoAbonado) {
		super(tipoAbonado);
	}


	@Override
	public String getMessage() {
		return "El tipo de abonado: " + this.tipoAbonado + " no es valido";
	}
	
}
