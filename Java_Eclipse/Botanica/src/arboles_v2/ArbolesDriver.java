package arboles_v2;

public class ArbolesDriver {
	
	public static void main(String[] args) {
		
		Arbol pino = new Arbol(23.00, 2000, "Ramir�s", "Pino", "Pinus Pinaster", Hojas.PERENNE);
		Arbol abeto = new Arbol(23.00, 2000, "Ramir�s", "Pino", "Pinus Pinaster", Hojas.PERENNE);
		Arbol roble = new Arbol(23.00, 2000, "Ramir�s", "Pino", "Pinus Pinaster", Hojas.PERENNE);
		Arbol sauce = new Arbol(23.00, 2000, "Ramir�s", "Pino", "Pinus Pinaster", Hojas.PERENNE);
		
		System.out.println(pino);
		System.out.println(abeto);
		System.out.println(roble);
		System.out.println(sauce);
		
		System.out.println("El n�mero total de �rboles es: " + Arbol.getNumArboles());
	}
}
