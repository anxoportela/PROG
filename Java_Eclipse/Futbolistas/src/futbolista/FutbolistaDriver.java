package futbolista;

public class FutbolistaDriver {
	
	public static void main(String[] args) {
		
		Futbolista aspas = new Futbolista("Iago Aspas", 10, Demarcacion.DELANTERO);
		Futbolista carvalho = new Futbolista("Ricardo Carvalho", 2, Demarcacion.DEFENSA);
		
		Masajista piti = new Masajista("Piti", "Ingeniero de los tobillos");
		
		
		//System.out.println(aspas);
		//System.out.println(carvalho);
		//System.out.println(piti);
		
		aspas.viaja();
		carvalho.concentrarse();
		piti.concentrarse();
		
	}

}
