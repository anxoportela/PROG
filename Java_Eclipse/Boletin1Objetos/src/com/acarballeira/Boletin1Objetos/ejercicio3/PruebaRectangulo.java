package com.acarballeira.Boletin1Objetos.ejercicio3;

public class PruebaRectangulo {
	
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(10, 5);
		
		System.out.println(r1);
		
		System.out.println("El área es: " + r1.calculaArea());
		System.out.println("El perímetro es: " + r1.calculaPeri());
		
		System.out.println(r1.pintaCuadrado());
				
	}

}
