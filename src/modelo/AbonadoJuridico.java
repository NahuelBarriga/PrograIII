package modelo;

import java.util.Iterator;
import java.util.Map.Entry;

public class AbonadoJuridico extends Abonado{

	public AbonadoJuridico(String nombre, String DNI) {
		super(nombre, DNI);
	}

	@Override
	public double getCostoServicios() {//Chequear esto, no se si esta bien????????????????????
		Iterator<Entry<String,Servicio>> it = this.servicios.entrySet().iterator();	//Iterator del Set de HashMap
		double resultado = 0;
		
		if (this.servicios.size() > 3)
			for (int i=0;i<3;i++) {				
				resultado += it.next().getValue().getCostoNeto();
			}
		while (it.hasNext())
			resultado += it.next().getValue().getCostoNeto()*0.5;	//Descuento del 50% a partir del tercero
		return resultado;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException("Imposible clonar una persona juridica");
	}
	
	

}
