package modelo;

public abstract class Servicio {
	private float precioBase;
	private int cantCamaras;
	private int cantBotonAP;
	private boolean movilAcomp;
	private static int sigNumId = 0;
	private int numId;	//Identificacion de servicio (unica)
	
	public Servicio(float precioBase, int cantCamaras, int cantBotonAP, boolean movilAcomp) {
		this.precioBase = precioBase;
		this.cantCamaras = cantCamaras;
		this.cantBotonAP = cantBotonAP;
		this.movilAcomp = movilAcomp;
		sigNumId++;
		this.numId = sigNumId;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public int getCantCamaras() {
		return cantCamaras;
	}

	public int getCantBotonAP() {
		return cantBotonAP;
	}

	public boolean isMovilAcomp() {
		return movilAcomp;
	}

	public int getNumId() {
		return numId;
	}
	
	public double getCostoBruto() {
		if (this.movilAcomp)
			return this.precioBase+3000*this.cantCamaras+2000*this.cantBotonAP+7500;
		else
			return this.precioBase+3000*this.cantCamaras+2000*this.cantBotonAP;
	}
	
	public abstract double getCostoNeto(IPromocion promo);//Double dispatch

}
