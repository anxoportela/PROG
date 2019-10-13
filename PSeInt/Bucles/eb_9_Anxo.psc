Proceso sin_titulo
	Definir num1,num2 Como Entero;
	Definir ascendente Como Logico;
	
	Escribir "Introduzca un valor";
	Leer num1;
	num2<-num1;
	ascendente<-Verdadero;
	Mientras num1>=0 Hacer
		Si num1>num2 Entonces
			ascendente<-Verdadero;
		SiNo
			ascendente<-Falso;
		FinSi
		num2<-num1;
		Escribir "Introduzca un valor";
		Leer num1;
	FinMientras
	
	Si ascendente Entonces
		Escribir "Ascendente";
	SiNo
		Escribir "Descendente";
	FinSi
	
	
FinProceso
