Proceso sin_titulo
	
	Definir A,B,C Como Real;
	Definir X Como Real;
	Definir resultado Como Real;
	
	Escribir "Introduzca el valor A:";
	Leer A;
	Escribir "Introduzca el valor B:";
	Leer B;
	Escribir "Introduzca el valor C:";
	Leer C;
	Escribir "Introduzca el valor X:";
	Leer X;
	
	resultado<-0;
	
	Mientras X<>99 Hacer
		resultado<-(A*X^2)+(B*X)+C;
		Escribir "El resultado de la ecuación es: ", resultado;
		Escribir "Introduzca el valor X:";
		Leer X;
	FinMientras
	
FinProceso
