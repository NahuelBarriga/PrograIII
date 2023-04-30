package excepciones;

public class DomicilioInvalidoException extends Exception{
	private String domicilio;
	
	
	public DomicilioInvalidoException(String domicilio) {
		super(domicilio);
	}


	@Override
	public String getMessage() {
		return "El domicilio "+this.domicilio+" es invalido";
	}

	
}
