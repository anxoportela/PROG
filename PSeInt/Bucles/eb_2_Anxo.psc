Proceso sin_titulo
	
	Definir num0,num1,num2,num3,num4 Como Entero;
	Definir prom Como Real;
	num0<-1;
	
	Mientras num0<>0 Hacer
		Escribir "Introduzca el primer valor:";
		Leer num1;
		num0<-num1;
		Si num1<>0 Entonces
			Escribir "Introduzca el segundo valor:";
			Leer num2;
			Escribir "Introduzca el tercer valor:";
			Leer num3;
			Escribir "Introduzca el cuarto valor:";
			Leer num4;
			prom<-(num1+num2+num3+num4)/4;
			Escribir "El promedio es: ", prom;
		FinSi
	FinMientras
	
FinProceso
