Proceso diaMesAno
	
	Definir mes, ano Como Entero;
	Definir diasMes, diasAno Como Entero;
	Definir bisiesto Como Logico;
	
	Escribir "Introduzca un mes";
	Leer mes;
	Escribir "Introduzca un a�o";
	Leer ano;
	
	Si mes > 12 Entonces
		Escribir "Fecha erronea";
	SiNo
		Si (ano%4 == 0 & ano%100 <> 0) | (ano%400 == 0) Entonces
			bisiesto <- Verdadero;
		SiNo
			bisiesto <- Falso;
		FinSi;
		Si mes == 1 | mes == 3 | mes == 5 | mes == 7 | mes == 8 | mes == 10 | mes == 12 Entonces
			diasMes <- 31;
		SiNo Si (mes == 4 | mes == 6 | mes == 9 | mes == 11) Entonces
				diasMes <- 30;
			SiNo Si mes == 2 & bisiesto Entonces
					diasMes <- 29;
				SiNo
					diasMes <- 28;
				FinSi;
			FinSi;
		FinSi;
		Si bisiesto == Verdadero Entonces
			diasAno <- 366;
		SiNo
			diasAno <- 365;
		FinSi;
		Escribir "El mes que ha introducido tiene: ", diasMes, " d�as y el a�o tiene: ", diasAno, " d�as";
	FinSi;
	
FinProceso
