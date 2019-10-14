Proceso sin_titulo
	
	Definir A,B,C Como Entero;
	Definir num,suma Como Entero;
	
	suma<-0;
	num<-0;
	
	Escribir "Introduzca el primer valor:";
	Leer A;
	Escribir "Introduzca el segundo valor:";
	Leer B;
	
	Si A>B Entonces
		C<-A;
		A<-B;
		B<-A;
	FinSi
	
	Mientras num<>99 Hacer
		Escribir "Introduzca un valor entero:";
		Leer num;
		Si num>=A y num<=B Entonces
			suma<-suma+num;
		FinSi
	FinMientras
	
	Escribir "El valor de la suma es: ", suma;
	
FinProceso
