Proceso sin_titulo
	
	Definir dia Como Entero;
	Definir diaTexto Como Caracter;
	
	Escribir "Introduzca un n�mero de d�a de semana v�lido";
	Leer dia;
	
	diaTexto<-"";
	
	Segun dia Hacer
		1:
			diaTexto<-"Lunes";
		2:
			diaTexto<-"Martes";
		3:
			diaTexto<-"Mi�rcoles";
		4:
			diaTexto<-"Jueves";
		5:
			diaTexto<-"Viernes";
		6:
			diaTexto<-"S�bado";
		7:
			diaTexto<-"Domingo";
		De Otro Modo:
			Escribir "Introduzca un valor v�lido";
	FinSegun
	
	Si diaTexto<>"" Entonces
		Escribir "El d�a de la semana es ", diaTexto;
	FinSi
	
FinProceso
