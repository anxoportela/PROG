Proceso sin_titulo
	
	Definir tiro,portero,cont Como Entero;
	Definir gol,dcha,centro,izqda,errDcha,errCentro,errIzqda Como Entero;
	
	cont <- 0;
	gol <- 0;
	izqda <- 0;
	dcha <- 0;
	centro <- 0;
	errIzqda <- 0;
	errDcha <- 0;
	errCentro <- 0;
	
	Repetir
		Escribir "Introduzca un número entre 1-6: ";
		Leer tiro;
		Mientras tiro < 1 | tiro > 6 Hacer
			Escribir "Introduzca un número entre 1-6: ";
			Leer tiro;
		FinMientras
		portero <- Azar(6) + 1;
		
		Si tiro <> portero Entonces
			gol <- gol + 1;
			Escribir "Gol";
			Si tiro == 3 || tiro == 4 Entonces
				izqda <- izqda + 1;
			SiNo Si tiro == 2 || tiro == 5 Entonces
					centro <- centro + 1;
				SiNo
					dcha <- dcha + 1;
				FinSi
			FinSi
		SiNo
			Escribir "Parada";
			Si tiro == 3 || tiro == 4 Entonces
				errIzqda <- errIzqda + 1;
			SiNo Si tiro == 2 || tiro == 5 Entonces
					errCentro <- errCentro + 1;
				SiNo
					errDcha <- errDcha + 1;
				FinSi
			FinSi
		FinSi
		cont <- cont + 1;
	Hasta Que cont == 5
	
	Escribir "Goles acertados: ", gol;
	Escribir "Goles fallados: ", cont - gol;
	
	Si izqda<>0 y izqda>centro y izqda>dcha Entonces
		Escribir "Mayoría de goles por la izquierda";
	SiNo Si izqda>0 Entonces
			Escribir "Has metido ", izqda, " gol(es) por la izquierda";
		SiNo
			Escribir "Sin goles por la izquierda";
		FinSi
	FinSi
	
	Si dcha<>0 y dcha>centro y dcha>izqda Entonces
		Escribir "Mayoría de goles por la derecha";
	SiNo Si dcha>0 Entonces
			Escribir "Has metido ", dcha, " gol(es) por la derecha";
		SiNo
			Escribir "Sin goles por la derecha";
		FinSi
	FinSi
	
	Si centro<>0 y centro>izqda y centro>dcha Entonces
		Escribir "Mayoría de goles por el centro";
	SiNo Si centro>0 Entonces
			Escribir "Has metido ", centro, " gol(es) por la izquierda";
		SiNo
			Escribir "Sin goles por el centro";
		FinSi
	FinSi
	
FinProceso
