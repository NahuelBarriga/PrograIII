package prueba;

import interfaces.IAbonado;
import interfaces.IPromocion;
import modelo.AbonadoFactory;
import modelo.Factura;
import modelo.PromoDorada;
import modelo.PromoPlatino;
import modelo.Servicio;
import modelo.ServicioComercio;
import modelo.ServicioVivienda;

public class Prueba {
	public static void main(String[] args) {
		final IPromocion dorada= new PromoDorada();
		final IPromocion platino= new PromoPlatino();
		IAbonado a1= AbonadoFactory.getAbonado("Fisico","Cheque","Gregorio","43509237");
		Servicio s1= new ServicioComercio(2,1,true,null);
		a1.agregaServicio("Santiago del Estero 2200", s1);
		Servicio s2= new ServicioVivienda(2,1,true,dorada);
		a1.agregaServicio("La quiaca", s2);
		Factura f1= new Factura(a1);
		f1.getFactura();
		Servicio s3= new ServicioVivienda(2,1,true,platino);
		try {
			Factura f2= (Factura) f1.clone();
			f2.getFactura();
			f2.agregarServicio("Paso 2200", s3);
			f2.getFactura();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
