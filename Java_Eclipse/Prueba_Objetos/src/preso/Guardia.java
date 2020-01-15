package preso;

public class Guardia extends Persona {
	
	private String nip;

	public Guardia(String nombre, String nip) {
		super(nombre);
		this.nip = nip;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	/*
	 * @Override public String toString() { return "Guardia [" + (nip != null ?
	 * "nip=" + nip + ", " : "") + (nombre != null ? "nombre=" + nombre : "") + "]";
	 * }
	 */
	
	@Override
	public String toString() {
		return String.format("Guardia: %s%nNip: %s%n", getNombre(), getNip());
	}	

}
