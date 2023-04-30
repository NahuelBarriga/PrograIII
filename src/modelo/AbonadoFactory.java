package modelo;

import interfaces.IAbonado;

public class AbonadoFactory {
	
	public AbonadoFactory() {
		super();
	}
	
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
