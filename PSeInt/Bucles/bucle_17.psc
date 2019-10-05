Proceso sin_titulo
	Definir num0,num1,num2 Como Entero;
	num0<-1;
	num2<-999999999;
	
	Mientras num0<>0 Hacer
		Escribir "Introduzca un número entero:";
		Leer num1;
		num0<-num1;
		Si num1<>0 Entonces
			Si num1<num2 Entonces
				num2<-num1;
			FinSi
		FinSi
	FinMientras
	
	Si num2<>999999999 Entonces
		Escribir num2;
	FinSi
	
FinProceso
