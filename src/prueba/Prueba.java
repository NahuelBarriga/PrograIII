package prueba;

import interfaces.IAbonado;
import modelo.AbonadoFactory;

public class Prueba {
	public static void main(String[] args) {
		IAbonado a1= AbonadoFactory.getAbonado("Fisico","Cheque","Gregorio","43509237");
		a1.a
	}
}
