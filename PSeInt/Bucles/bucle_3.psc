Algoritmo sin_titulo
	
	Definir n1,n2 como entero;
	Definir suma,sumares como entero;
	
	n1<-azar(101);
	n2<-azar(101);
	
	Escribir "Los números al azar son ", n1, " y ", n2, " y el resultado de su suma es: ", n1+n2;
	suma<-n1+n2;
	Escribir "Introduza el resultado de la suma";
	Leer sumares;
	
	Mientras suma<>sumares Hacer
		Escribir "Introduza el resultado de la suma";
		Leer sumares;
	Fin Mientras
	
	Escribir "El resultado de la suma es el mismo";
	
FinAlgoritmo
