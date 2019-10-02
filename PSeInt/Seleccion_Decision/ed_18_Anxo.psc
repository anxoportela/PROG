Algoritmo sin_titulo
	
	Definir n1,n2,n3 Como Entero;
	
	Escribir "Introduzca el valor a comprobar";
	Leer n1;
	Escribir "Introduzca el primer valor del intervalo";
	Leer n2;
	Escribir "Introduzca el segundo valor del intervalo";
	Leer n3;
	
	Si (n1 < n2 y n1 > n3) o (n1 < n3 y n1 > n2) Entonces
		Escribir "El valor está en el intervalo establecido";
	SiNo
		Escribir "El valor no está en el intervalo establecido";
	FinSi
	
FinAlgoritmo
