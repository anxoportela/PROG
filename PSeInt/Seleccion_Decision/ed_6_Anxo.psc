Algoritmo maxdetres
	
	Definir R,S,T Como Entero;
	
	Escribir "Introduzca tres n�meros";
	Leer R;
	Leer S;
	Leer T;
	
	Si R>=S y R>=T Entonces
		Escribir "El m�ximo de los tres n�meros es ", R;
	SiNo Si S>=R y S>=T Entonces
			Escribir "El m�ximo de los tres n�meros es ", S;
		SiNo Si T>=S y T>=R Entonces
				Escribir "El m�ximo de los tres n�meros es ", T;
			FinSi;
		FinSi;
	FinSi;
	
FinAlgoritmo
