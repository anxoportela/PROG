package preso;

import java.util.Arrays;

public class Celdas {

	private String nombreCelda;
	private boolean abierta;
	private Preso[] presos;
	private final static int MAX_PRESOS = 5;
	private int numPresos = 0;

	public Celdas(String nombreCelda, boolean abierta) {
		super();
		this.nombreCelda = nombreCelda;
		this.abierta = abierta;
		presos = new Preso[MAX_PRESOS];
	}

	public String getNombreCelda() {
		return nombreCelda;
	}

	public void setNombreCelda(String nombreCelda) {
		this.nombreCelda = nombreCelda;
	}

	public boolean isAbierta() {
		return abierta;
	}

	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}

	public Preso[] getPresos() {
		return presos;
	}

	public void setPresos(Preso[] presos) {
		this.presos = presos;
	}

	public int getNumPresos() {
		return numPresos;
	}

	public void setNumPresos(int numPresos) {
		this.numPresos = numPresos;
	}

	public static int getMaxPresos() {
		return MAX_PRESOS;
	}

	public void anadirPreso(Preso p) {
		if (this.numPresos == MAX_PRESOS) {
			System.out.println("No se pueden añadir más presos");
		} else {
			this.presos[this.numPresos++] = p;
		}
	}

	@Override
	public String toString() {
		return "Celdas [" + (nombreCelda != null ? "nombreCelda=" + nombreCelda + ", " : "") + "abierta=" + abierta
				+ ", " + (presos != null ? "presos=" + Arrays.toString(presos) + ", " : "") + "numPresos=" + numPresos
				+ "]";
	}




	
	
	
	

}
