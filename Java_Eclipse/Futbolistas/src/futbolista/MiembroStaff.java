package futbolista;

public abstract class MiembroStaff {
	
	protected String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void viaja() {
		System.out.println("Viajando");
	}
	
	public void concentrarse() {
		System.out.println("Concentrado");
	}
	
	public abstract void entrenar();

}
