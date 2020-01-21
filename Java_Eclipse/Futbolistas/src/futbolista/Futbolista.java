package futbolista;

public class Futbolista extends MiembroStaff {
	
	private int dorsal;
	private Demarcacion posicion;
	
	protected Futbolista(String nombre, int dorsal, Demarcacion posicion) {
		super();
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.posicion = posicion;
	}

	public int getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	public Demarcacion getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Demarcacion posicion) {
		this.posicion = posicion;
	}
	
	public void juegaPartido() {
		System.out.println("Vamos a jugar el partido");
	}
	
	@Override
	public void entrenar() {
		System.out.println("Entrenando");
	}

	@Override
	public String toString() {
		return "Futbolista [dorsal=" + dorsal + ", " + (posicion != null ? "posicion=" + posicion + ", " : "")
				+ (nombre != null ? "nombre=" + nombre : "") + "]";
	}
	
	
}
