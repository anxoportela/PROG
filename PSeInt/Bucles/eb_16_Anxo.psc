Proceso sin_titulo
		
		Definir num1, dividendo, digitos, resto Como Entero;
		Definir numeroSuelto, sumaResto Como Entero;

		digitos <- 0;

		Escribir "Introduzca un número";
		Leer num1;
		
		dividendo <- num1;
		Repetir
			sumaResto <- 0;
			Mientras dividendo > 0 Hacer
				resto <- dividendo % 10;
				dividendo <- trunc(dividendo / 10);
				numeroSuelto <- resto;
				sumaResto <- numeroSuelto + sumaResto;
				digitos <- digitos + 1;
			FinMientras
			dividendo <- sumaResto;
		Hasta Que sumaResto <= 9;

		Si sumaResto == 9 Entonces
			Escribir "Como ", sumaResto, " es divisible por 9, ", num1, " es divisible por 9";
		SiNo
			Escribir "Como ", sumaResto, " no es divisible por 9, ", num1, " no es divisible por 9";
		FinSi

FinProceso
