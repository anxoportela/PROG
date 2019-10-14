Proceso sin_titulo
	
	Definir A,B,C Como Entero;
	
	Escribir "Introduzca tres números enteros";
	Leer A;
	Leer B;
	Leer C;
	
	Si A<>B y B<>C y A<>C Entonces
		Si A>B y A>C Entonces
			Si B>C Entonces
				Escribir "El número central es ", B;
			SiNo	
				Escribir "El número central es ", C;
			FinSi
		SiNo Si B>A y B>C Entonces
				Si A>C Entonces
					Escribir "El número central es ", A;
				SiNo
					Escribir "El número central es ", C;
				FinSi
			SiNo Si C>A y C>B Entonces
					Si A>B Entonces
						Escribir "El número central es ", A;
					SiNo
						Escribir "El número central es ", B;
					FinSi
				FinSi
			FinSi
		FinSi
	SiNo
		Escribir "Los tres números deben ser distintos";
	FinSi
	
FinProceso
