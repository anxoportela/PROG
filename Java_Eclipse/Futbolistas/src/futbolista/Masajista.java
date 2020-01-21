package futbolista;

public class Masajista extends MiembroStaff {
	
	private String titulacion;
	
	protected Masajista(String nombre, String titulacion) {
		super();
		this.nombre = nombre;
		this.titulacion = titulacion;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	public void daMasaje() {
		System.out.println("El masajista da masaje");
	}
	
	@Override
	public void entrenar() {
		System.out.println("Masajeando");
	}

	@Override
	public String toString() {
		return "Masajista [" + (titulacion != null ? "titulacion=" + titulacion + ", " : "")
				+ (nombre != null ? "nombre=" + nombre : "") + "]";
	}
	
	
}
