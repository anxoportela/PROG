package figuras;

public class PruebaRectangulo {
	
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(10, 5);
		
		System.out.println(r1);
		
		System.out.println("El �rea es: " + r1.calculaArea());
		System.out.println("El per�metro es: " +r1.calculaPeri());
		
		System.out.println(r1.pintaCuadrado());
				
	}

}
