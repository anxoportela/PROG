package arboles;

public class Arbol {
	
	public double altura;
	public int ano;
	public String concello;
	public String nombreComun;
	public String nombreLatino;
	public Hojas hojas;
	private static int numArboles = 0;	

	protected Arbol(double altura, int ano, String concello, String nombreComun, String nombreLatino, Hojas hojas) {
		super();
		this.altura = altura;
		this.ano = ano;
		this.concello = concello;
		this.nombreComun = nombreComun;
		this.nombreLatino = nombreLatino;
		this.hojas = hojas;
		numArboles++;
	}

	public static int getNumArboles() {
		return numArboles;
	}

	public static void setNumArboles(int numArboles) {
		Arbol.numArboles = numArboles;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getConcello() {
		return concello;
	}

	public void setConcello(String concello) {
		this.concello = concello;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreLatino() {
		return nombreLatino;
	}

	public void setNombreLatino(String nombreLatino) {
		this.nombreLatino = nombreLatino;
	}

	public Hojas getHojas() {
		return hojas;
	}

	public void setHojas(Hojas hojas) {
		this.hojas = hojas;
	}

	public String toString() {
		return String.format("------------------------------%n|Nombre: %s%n|Nombre Latino: %s%n|Tipo de Hoja: %s%n|Altura: %f%n|Ayuntamiento: %s%n|Año nacimiento: %d%n------------------------------", this.nombreComun, this.nombreLatino,this.hojas,this.altura,this.concello,this.ano);
	}	
	
}
