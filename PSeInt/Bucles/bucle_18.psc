Proceso sin_titulo
	Definir num0,num1,num2 Como Entero;
	num0<-1;
	num2<--1;
	
	Mientras num0<>0 Hacer
		Escribir "Introduzca un n�mero entero:";
		Leer num1;
		num0<-num1;
		Si num1<>0 Entonces
			Si num1>num2 Entonces
				num2<-num1;
			FinSi
		FinSi
	FinMientras
	
	Si num2<>-1 Entonces
		Escribir num2;
	FinSi
	
FinProceso