Algoritmo restahora
	
	Definir h,m,s Como Entero;
	Definir rh,rm,rs Como Entero;
	
	Escribir "Introduzca la hora actual: ";
	Leer h;
	Escribir "Introduzca los minutos actuales: ";
	Leer m;
	Escribir "Introduza los segundos actuales: ";
	Leer s;
	
	rh <- 23-h;
	rm <- 58-m;
	rs <- 59-s;
	
	Si rs <= 0 Entonces
		rs = abs(rs);
		rm = rm-1;
	FinSi
	
	Si rm <= 0 Entonces
		rm = abs(rm);
		rh = rh-1;
	FinSi
	
	Escribir "Restan ", rh, " horas, ", rm, " minutos y ", rs, " segundos hasta las 23:59:00"
	
FinAlgoritmo
