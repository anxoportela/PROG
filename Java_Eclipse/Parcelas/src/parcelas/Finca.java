package parcelas;


/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class Finca extends Parcela {
	
	private Parcela parcela;
	private String toponimo;
	private TipoCultivo cultivo;
	private boolean regadio;
	private double metrosLimpios;
	


	public Finca(double metros, Coordenada puntoRef1, Coordenada puntoRef2) {
		super(metros, puntoRef1, puntoRef2);
	}

	public Finca(double metros, Coordenada puntoRef1, Coordenada puntoRef2, Parcela parcela, String toponimo,
			TipoCultivo cultivo, boolean regadio) {
		super(metros, puntoRef1, puntoRef2);
		this.parcela = parcela;
		this.toponimo = toponimo;
		this.cultivo = cultivo;
		this.regadio = regadio;
	}


	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}

	public String getToponimo() {
		return toponimo;
	}

	public void setToponimo(String toponimo) {
		this.toponimo = toponimo;
	}

	public TipoCultivo getCultivo() {
		return cultivo;
	}

	public void setCultivo(TipoCultivo cultivo) {
		this.cultivo = cultivo;
	}

	public boolean isRegadio() {
		return regadio;
	}

	public void setRegadio(boolean regadio) {
		this.regadio = regadio;
	}

	public double getMetrosLimpios() {
		return metrosLimpios;
	}

	public void setMetrosLimpios(double metrosLimpios) {
		this.metrosLimpios = metrosLimpios;
	}
	
	public void incrementarSupALimpar(double supLimpiarInc) {
		if((metrosLimpios-supLimpiarInc)>this.getMetros()||(metrosLimpios-supLimpiarInc)<0) {
			System.out.println("Has introducido una superficie errónea");
		} else {
			System.out.println(metrosLimpios-=supLimpiarInc);			
		}
	}
	
	public void decrementarSupALimpar(double supLimpiarDec) {
		if((metrosLimpios+supLimpiarDec)>this.getMetros()||(metrosLimpios+supLimpiarDec)<0) {
			System.out.println("Has introducido una superficie errónea");
		} else {
			System.out.println(metrosLimpios+=supLimpiarDec);			
		}
	}

	@Override
	public String toString() {
		return "Finca [" + (parcela != null ? "parcela=" + parcela + ", " : "")
				+ (toponimo != null ? "toponimo=" + toponimo + ", " : "")
				+ (cultivo != null ? "cultivo=" + cultivo + ", " : "") + "regadio=" + regadio + ", metrosLimpios="
				+ metrosLimpios + "]";
	}	
	
}
