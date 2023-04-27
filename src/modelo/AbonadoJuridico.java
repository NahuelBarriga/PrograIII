package modelo;

import java.util.Iterator;
import java.util.Map.Entry;

public class AbonadoJuridico extends Abonado{

	public AbonadoJuridico(String nombre, String DNI) {
		super(nombre, DNI);
	}

	@Override
	public double getCostoServicios(IPromocion promo) {//Chequear esto, no se si esta bien
		Iterator<Entry<String,Servicio>> it = this.servicios.entrySet().iterator();		
		double resultado = 0;
		
		if (this.servicios.size() > 3)
			for (int i=0;i<3;i++) {				
				resultado += it.next().getValue().getCostoNeto(promo);
			}
		while (it.hasNext())
			resultado += it.next().getValue().getCostoNeto(promo)*0.5;
		return resultado;
	}

}
