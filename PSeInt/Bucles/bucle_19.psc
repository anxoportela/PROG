Proceso sin_titulo
	Definir num0,num1,num2,contador,antcontador Como Entero;
	num0<-1;
	num2<--1;
	contador<-0;
	antcontador<-0;
	
	Mientras num0<>0 Hacer
		Escribir "Introduzca un número entero:";
		Leer num1;
		num0<-num1;
		contador<-contador+1;
		Si num1<>0 Entonces
			Si num1>num2 Entonces
				num2<-num1;
				antcontador<-contador;
			FinSi
		FinSi
	FinMientras
	
	Si num2<>-1 Entonces
		Escribir "El número es ", num2, " y su posición es ", antcontador;
	FinSi
	
FinProceso
