package modelo;

import java.util.Iterator;
import java.util.Map.Entry;

public class AbonadoFisico extends Abonado {

	public AbonadoFisico(String nombre, String DNI) {
		super(nombre, DNI);
	}

	@Override
	public double getCostoServicios(IPromocion promo) {
		Iterator<Entry<String,Servicio>> it = this.servicios.entrySet().iterator();//Iterator del Set del HashMap
		double resultado = 0;
		
		while (it.hasNext())
			resultado += it.next().getValue().
		return resultado;
	}

}
