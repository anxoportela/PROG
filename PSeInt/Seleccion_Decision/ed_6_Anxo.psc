Algoritmo maxdetres
	
	Definir R,S,T Como Entero;
	
	Escribir "Introduzca tres números";
	Leer R;
	Leer S;
	Leer T;
	
	Si R>=S y R>=T Entonces
		Escribir "El máximo de los tres números es ", R;
	SiNo Si S>=R y S>=T Entonces
			Escribir "El máximo de los tres números es ", S;
		SiNo Si T>=S y T>=R Entonces
				Escribir "El máximo de los tres números es ", T;
			FinSi;
		FinSi;
	FinSi;
	
FinAlgoritmo
