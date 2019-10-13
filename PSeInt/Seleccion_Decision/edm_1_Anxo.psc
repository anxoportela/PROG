Proceso sin_titulo
	
	Definir dia Como Entero;
	Definir diaTexto Como Caracter;
	
	Escribir "Introduzca un número de día de semana válido";
	Leer dia;
	
	diaTexto<-"";
	
	Segun dia Hacer
		1:
			diaTexto<-"Lunes";
		2:
			diaTexto<-"Martes";
		3:
			diaTexto<-"Miércoles";
		4:
			diaTexto<-"Jueves";
		5:
			diaTexto<-"Viernes";
		6:
			diaTexto<-"Sábado";
		7:
			diaTexto<-"Domingo";
		De Otro Modo:
			Escribir "Introduzca un valor válido";
	FinSegun
	
	Si diaTexto<>"" Entonces
		Escribir "El día de la semana es ", diaTexto;
	FinSi
	
FinProceso
