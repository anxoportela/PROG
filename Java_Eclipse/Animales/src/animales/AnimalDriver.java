package animales;

public class AnimalDriver {
	
	public static void main(String[] args) {
		Gato conBotas = new Gato(Sexo.MACHO, "12345" );
		Gato sinBotas = new Gato(Sexo.HEMBRA, "54321" );
		Gato unaBota = new Gato(Sexo.MACHO, "67890" );
		
		conBotas.come("pescado");
		sinBotas.peleaCon(conBotas);
		unaBota.peleaCon(conBotas);
		
	}

}
