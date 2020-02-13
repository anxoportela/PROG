package com.acarballeira.clases.ejercicio6;

import java.util.ArrayList;
import java.util.Comparator;

public class PersoaDriver {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<Persoa> vector1 = new ArrayList<Persoa>();
		ArrayList<Persoa> vector2 = new ArrayList<Persoa>();
		
		vector1.add(new Persoa("Luis", 19));
		vector1.add(new Persoa("Luis", 11));
		vector1.add(new Persoa("Luis", 14));
		vector1.add(new Persoa("María", 15));
		vector1.add(new Persoa("Rosa", 16));
		vector1.add(new Persoa("Luisa", 17));
		vector1.add(new Persoa("Marcos", 18));
		vector1.add(new Persoa("Ivan", 19));
		vector1.add(new Persoa("Roberto", 20));
		vector1.add(new Persoa("Diego", 21));
		
		vector2 = (ArrayList<Persoa>) vector1.clone();
		vector2.forEach(lista->System.out.println(lista));
		
		vector1.sort(new Comparator<Persoa>() {
			@Override
			public int compare(Persoa o1, Persoa o2) {
				if (o1.getNombre().compareTo(o2.getNombre())>0) {
					return 1;
				} else if (o1.getNombre().compareTo(o2.getNombre())<0) {
					return -1;
				} else {
					if (o1.getEdad()>o2.getEdad()) {
						return 1;
					} else if (o1.getEdad()<o2.getEdad()) {
						return -1;
					} else {
						return 0;
					}
				}
			}
		});
		vector1.forEach(lista->System.out.println(lista));
		

	}

}
