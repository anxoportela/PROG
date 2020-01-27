package com.acarballeira.clases.driver;

import com.acarballeira.clases.ejercicio1.Cubotes;

public class PruebaCubo {

	public static void main(String[] args) {
		
		Cubotes c1 = new Cubotes(2);
		Cubotes c2 = new Cubotes(7);

		System.out.println("Cubito: \n");
		c1.pinta();
		
		System.out.println("\nCubote: \n");
		c2.pinta();
		
		System.out.println("\nLleno el Cubito: \n");
		c1.llena();
		c1.pinta();
		
		System.out.println("\nLleno el Cubote: \n");
		c2.llena();
		c2.pinta();
		
		System.out.println("\n" + c1.toString());
//		System.out.println("\n" + c2.toString());
		
		
	}

}
