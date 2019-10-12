Proceso sin_titulo
	
	Definir tamano,i,j,k Como Entero;
	
	Escribir "Introduzca el tamaño del triángulo";
	Leer tamano;
	
	Para i<-1 Hasta tamano Con Paso 1 Hacer
		Para j<-(tamano-i) Hasta 1 Con Paso -1 Hacer
			Escribir Sin Saltar " ";
		FinPara
		Para k<-1 hasta i Con Paso 1 Hacer
			Escribir Sin Saltar "* ";
		FinPara
		Escribir " ";
	FinPara
	
	
//  Se invierte para crear un rombo
//	Para i<-(tamano-1) Hasta 1 Con Paso -1 Hacer
//		Para j<-(tamano-i) Hasta 1 Con Paso -1 Hacer
//			Escribir Sin Saltar " ";
//		FinPara
//		Para k<-1 hasta i Con Paso 1 Hacer
//			Escribir Sin Saltar "* ";
//		FinPara
//		Escribir " ";
//	FinPara

FinProceso
