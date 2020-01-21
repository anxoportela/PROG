package cubos;

public class Cubo {
	
	int capacidad;
	int contenido;
	
	
	
	
	Cubo(int capacidad) {
		super();
		this.capacidad = capacidad;
	}
	
	int getCapacidad() {
		return capacidad;
	}

	int getContenido() {
		return contenido;
	}
	void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	void vacia() {
		this.contenido=0;
	}
	
	void llena() {
		this.contenido = this.capacidad;
	}
	
	void pinta() {
		for (int nivel = this.capacidad; nivel > 0; nivel--) {
			if(this.contenido>=nivel) {
				System.out.println("#~~~~#");
			} else {
				System.out.println("#    #");
			}
		}
		System.out.println("######");
	}
	
	void vuelcaEn(Cubo destino) {
		
	}

}
