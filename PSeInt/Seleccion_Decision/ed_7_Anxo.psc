Algoritmo ordenar
	
	Definir A,B,C Como Entero;
	
	Escribir "Introduzca tres n�meros";
	Leer A;
	Leer B;
	Leer C;
	
	Si A>=B y A>=C Entonces
		Si B>=C Entonces
			Escribir "Los n�meros ordenados de mayor a menor son: ", A "-", B "-", C;
			Escribir "Los n�meros ordenados de menor a mayor son: ", C "-", B "-", A;
		SiNo
			Escribir "Los n�meros ordenados de mayor a menor son: ", A "-", C "-", B;
			Escribir "Los n�meros ordenados de menor a mayor son: ", B "-", C "-", A;
		FinSi;
	SiNo Si B>=A y B>=C Entonces
			Si A>=C Entonces
				Escribir "Los n�meros ordenados de mayor a menor son: ", B "-", A "-", C;
				Escribir "Los n�meros ordenados de menor a mayor son: ", C "-", A "-", B;
			SiNo
				Escribir "Los n�meros ordenados de mayor a menor son: ", B "-", C "-", A;
				Escribir "Los n�meros ordenados de menor a mayor son: ", A "-", C "-", B;
			FinSi;
		SiNo Si C>=A y C>=B Entonces
				Si A>=B Entonces
					Escribir "Los n�meros ordenados de mayor a menor son: ", C "-", A "-", B;
					Escribir "Los n�meros ordenados de menor a mayor son: ", B "-", A "-", C;
				SiNo
					Escribir "Los n�meros ordenados de mayor a menor son: ", C "-", B "-", A;
					Escribir "Los n�meros ordenados de menor a mayor son: ", A "-", B "-", C;
				FinSi;
			FinSi;
		FinSi;
	FinSi;
	
FinAlgoritmo