package gatos;

public class GatoSimple {

	String color,raza,sexo;
	int edad;
	double peso;
	
	GatoSimple(String s){
		this.sexo=s;
	}

	String getSexo() {
		return this.sexo;
	}

	void maulla() {
		System.out.println("Miauuuu");
	}
	
	void ronronea() {
		System.out.println("Mrrrrrr");
	}
	
	void come(String comida) {
		if(comida.equals("pescado")){
			System.out.println("Hmmm, gracias");
		} else {
			System.out.println("Lo siento, yo solo como pescado");
		}
	}
	
	void peleaCon(GatoSimple contrincante) {
		if(this.sexo.equals("hembra")){
			System.out.println("no me gusta pelear");
		} else {
			if(contrincante.getSexo().equals("hembra")) {
				System.out.println("no peleo contra gatitas");
			} else {
				System.out.println("ven aquí que te vas a enterar");
			}
		}
	}

}
