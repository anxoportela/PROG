Proceso sin_titulo

	Definir dias, precio, cont, rango Como Entero;
	Definir diaBarato, precioBarato Como Entero;
	Definir suma, promedio Como Real;
	
	cont <- 1;
	rango <- (150 - 130) + 1;
	precioBarato <- 150;
	suma <- 0;
	
	Escribir "Introduzca la cantidad de días del mes: ";
	Leer dias;
	
	Mientras cont <= dias Hacer
		precio <- 130 + Azar(20) + 1;
		Escribir "Precio del día ", cont, " : ", precio;
		Si precio < precioBarato Entonces
			precioBarato <- precio;
			diaBarato <- cont;
		FinSi
		suma <- suma + precio;
		cont <- cont + 1;
	FinMientras
	
	promedio <- suma / dias;
	
	Escribir "Promedio mensual: ", promedio;
	Escribir "Mejor precio mensual: ", precioBarato;
	Escribir "Día precio más bajo: ", diaBarato;

FinProceso
