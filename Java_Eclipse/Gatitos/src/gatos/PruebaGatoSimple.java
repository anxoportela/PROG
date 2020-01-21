package gatos;

public class PruebaGatoSimple {
	public static void main(String[] args) {
		
		GatoSimple garfield= new GatoSimple("macho");
		System.out.println("hola gatito");
		garfield.maulla();
		System.out.println("toma tarta");
		garfield.come("tarta selva negra");
		System.out.println("tom pescado, a ver si te gusta");
		garfield.come("pescado");
		
		GatoSimple tom = new GatoSimple("macho");
		
		System.out.println("Tom, toma sopita de verduras");
		tom.come("sopa de verduras");
		
		GatoSimple lisa = new GatoSimple("hembra");
		
		System.out.println("A ver como maullais gatitos");
		garfield.maulla();
		tom.maulla();
		lisa.maulla();
		
		garfield.peleaCon(lisa);
		garfield.peleaCon(tom);
		tom.peleaCon(garfield);
		

	}
}
