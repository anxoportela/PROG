package futbolista;

public class Entrenador extends MiembroStaff {
	
	private String numFederado;

	protected Entrenador(String nombre, String numFederado) {
		super();
		this.nombre = nombre;
		this.numFederado = numFederado;
	}

	public String getNumFederadoString() {
		return numFederado;
	}

	public void setNumFederadoString(String numFederado) {
		this.numFederado = numFederado;
	}
	
	public void dirigeEquipo() {
		System.out.println("El mister dirige el equipo");
	}
	
	@Override
	public void entrenar() {
		System.out.println("Mandando");
	}

	@Override
	public String toString() {
		return "Entrenador [" + (numFederado != null ? "numFederado=" + numFederado + ", " : "")
				+ (nombre != null ? "nombre=" + nombre : "") + "]";
	}

}
