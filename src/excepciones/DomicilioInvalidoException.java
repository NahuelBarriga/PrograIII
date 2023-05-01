package excepciones;

public class DomicilioInvalidoException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String domicilio;
	
	
	public DomicilioInvalidoException(String domicilio) {
		super(domicilio);
	}


	@Override
	public String getMessage() {
		return "El domicilio "+this.domicilio+" es invalido";
	}

	
}
