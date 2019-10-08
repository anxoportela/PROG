Proceso sin_titulo
	
	Definir num,i,dividendo,resto,digitos,reves Como Entero;
	Definir esPrimo Como Logico;
	Definir revescaracter,revesresto Como Caracter;
	
	esPrimo<-Verdadero;
	digitos<-0;
	revescaracter<-"";
	
	Escribir Sin Saltar "Introduzca un número: ";
	Leer num;
	
	Para i<-2 Hasta trunc(num/2) Con Paso 1 Hacer
		Si num%i == 0 Entonces
			esPrimo<-Falso;
		FinSi
	FinPara
	
	Si esPrimo Entonces
		dividendo<-num;
		Mientras dividendo > 0 Hacer
			resto <- dividendo%10;
			dividendo <- trunc(dividendo/10);
			revesresto <- ConvertirATexto(resto);
			revescaracter <- Concatenar(revescaracter,revesresto);
			digitos <- digitos+1;
		FinMientras
		Escribir revescaracter;
		Escribir digitos;
	FinSi
	
FinProceso
