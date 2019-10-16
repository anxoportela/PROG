Proceso sin_titulo

	Definir cont,tiradas,dado Como Entero;
	
	Escribir "Introduzca el número de tiradas: ";
	Leer tiradas;
	Escribir "Tiradas:";
	
	Para cont <- 1 Hasta tiradas Con Paso 1 Hacer
		dado <- Azar(6)+1;
		Escribir dado;
	FinPara

FinProceso
