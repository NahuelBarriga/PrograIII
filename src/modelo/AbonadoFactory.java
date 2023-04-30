package modelo;

import interfaces.IAbonado;

/**
 * @author
 *Clase del patron factory para crear nuevos objetos de instancia IAbonado
 */
public class AbonadoFactory {
	
	/**
	 * Constructor de la clase AbonadoFactory
	 */
	public AbonadoFactory() {
		super();
	}
	
	/**
	 * Metodo que devuelve una nueva instancia segun los parametros dados
	 * @param tipoAbonado: Tipo de abonado de la nueva instancia
	 * @param formaPago: Forma de pago del abonado
	 * @param nombre: Nombre del abonado
	 * @param DNI: DNI del abonado
	 * @return: Devuelve una nueva instancia del tipo IAbonado
	 * <b>Pre:</b> nombre debe ser distinto de null y no vacio<br>
	 * <b>Pre:</b> DNI debe ser distinto de null y no vacio
	 */
	public static IAbonado getAbonado(String tipoAbonado, String formaPago, String nombre, String DNI) {
		IAbonado encapsulado = null;
		IAbonado respuesta = null;
		
		if (tipoAbonado.equalsIgnoreCase("Fisico"))
			encapsulado = new AbonadoFisico(nombre, DNI);
		else if (tipoAbonado.equalsIgnoreCase("Juridico"))
			encapsulado = new AbonadoJuridico(nombre, DNI);
		
		if (encapsulado != null) {
			if (formaPago.equalsIgnoreCase("Cheque"))
				respuesta = new DecoratorCheque(encapsulado);
			else if (formaPago.equalsIgnoreCase("Credito"))
				respuesta = new DecoratorCredito(encapsulado);
			else if (formaPago.equalsIgnoreCase("Efectivo"))
				respuesta = new DecoratorEfectivo(encapsulado);
		}
		return respuesta;
	}
}
