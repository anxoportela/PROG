package com.acarballeira.clases.ejemplos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dual108
 * @date 11 feb. 2020
 * @version 1.0
 *
 */

public class EjemplosConjuntos {
	
	public static void main(String[] args) {
		
		Set<Integer> conjunto = new HashSet<Integer>();
		
		conjunto.add(5);
		conjunto.add(3);
		conjunto.add(3);
		conjunto.add(5);
		
		for (Integer integer : conjunto) {
			System.out.println(integer);
		}
		
	}

}
