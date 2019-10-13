Proceso sin_titulo
	
	Definir num,resultado,antresultado Como Entero;
		
	Escribir "Introduzca un número entero:";
	Leer num;
	resultado<-0;
	antresultado<-0;
	
	Mientras resultado<=100 Hacer
		resultado<-resultado+num;
		Si resultado<=100 Entonces
			antresultado<-resultado;
			Escribir "Introduzca un número entero:";
			Leer num;
		FinSi
	FinMientras
	
	Escribir antresultado;
	
FinProceso
