Algoritmo sin_titulo
	
	Definir n1,n2,n3 Como Entero;
	
	Escribir "Introduzca el primer valor";
	Leer n1;
	Escribir "Introduzca el segundo valor";
	Leer n2;
	Escribir "Introduzca el tercer valor";
	Leer n3;
	
	Si (n1+n2>n3 o n1+n3>n2 o n2+n3>n1) Entonces
		Si n1==n2 y n1==n3 Entonces
			Escribir "Es un triangulo equilatero"
		Sino Si (n1==n2 y n1<>n3) o (n1==n3 y n1<>n2) o (n2==n3 y n2<>n1) Entonces
				Escribir "Es un triángulo isósceles"
			SiNo
				Escribir "Es un triángulo escaleno"
			FinSi			
		FinSi
	SiNo
		Escribir "Con eses valores no puedes formar un triángulo"
	FinSi
	
FinAlgoritmo
