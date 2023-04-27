package modelo;

public abstract class Servicio implements Cloneable{
	protected float precioBase;
	protected int cantCamaras;
	protected int cantBotonAP;
	protected boolean movilAcomp;
	protected static int sigNumId = 0;
	protected int numId;	//Identificacion de servicio (unica)
	protected IPromocion promo;
	
	public Servicio(float precioBase, int cantCamaras, int cantBotonAP, boolean movilAcomp, IPromocion promo) {
		this.precioBase = precioBase;
		this.cantCamaras = cantCamaras;
		this.cantBotonAP = cantBotonAP;
		this.movilAcomp = movilAcomp;
		sigNumId++;
		this.numId = sigNumId;
		this.promo = promo;
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
	
	public IPromocion getPromo() {
		return promo;
	}

	public double getCostoBruto() {
		if (this.movilAcomp)
			return this.precioBase+3000*this.cantCamaras+2000*this.cantBotonAP+7500;
		else
			return this.precioBase+3000*this.cantCamaras+2000*this.cantBotonAP;
	}
	
	public abstract double getCostoNeto();//Double dispatch
	
	public Object clone()throws CloneNotSupportedException {
		Servicio clonado;
		
		clonado = (Servicio)super.clone();//Superficial
		return clonado;
	}

}
