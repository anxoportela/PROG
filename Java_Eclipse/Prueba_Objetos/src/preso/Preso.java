package preso;

public class Preso extends Persona{
	
	private String apodo;
	private String codigo;
	private int anosSentencia;
	public static int numPresos = 0;
	private Celdas celda;
	
	public Preso() {
		super();
		this.nombre="";
		numPresos++;
		Preso.numPresos++;
	}
	
	public Preso(String nombre, String apodo, String codigo, int anosSentencia, Celdas celda) {
		super(nombre);
		this.apodo = apodo;
		this.codigo = codigo;
		this.anosSentencia = anosSentencia;
		this.celda= celda;
	}
	
	public String getApodo() {
		return apodo;
	}
	
	public void setApodo(String a) {
		apodo = a;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String c) {
		codigo = c;
	}
	
	public int getAnosSentencia() {
		return anosSentencia;
	}
	
	public void setAnosSentencia(int an) {
		anosSentencia = an;
	}
	
	public static int getNumPresos() {
		return numPresos;
	}

	public static void setNumPresos(int numPresos) {
		Preso.numPresos = numPresos;
	}

	public Celdas getCelda() {
		return celda;
	}

	public void setCelda(Celdas celda) {
		this.celda = celda;
	}

	@Override
	public String toString() {
		return "Preso [" + (apodo != null ? "apodo=" + apodo + ", " : "")
				+ (codigo != null ? "codigo=" + codigo + ", " : "") + "anosSentencia=" + anosSentencia + ", "
				+ (celda != null ? "celda=" + celda + ", " : "") + (nombre != null ? "nombre=" + nombre : "") + "]";
	}








	

}
