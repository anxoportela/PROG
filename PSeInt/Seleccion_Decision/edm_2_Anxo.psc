Proceso sin_titulo
	
	Definir mes Como Entero;
	Definir mesTexto Como Caracter;
	
	Escribir "Introduzca un número de mes válido";
	Leer mes;
	
	mesTexto<-"";
	
	Segun mes Hacer
		1:
			mesTexto<-"Enero";
		2:
			mesTexto<-"Febrero";
		3:
			mesTexto<-"Marzo";
		4:
			mesTexto<-"Abril";
		5:
			mesTexto<-"Mayo";
		6:
			mesTexto<-"Junio";
		7:
			mesTexto<-"Julio";
		8:
			mesTexto<-"Agosto";
		9:
			mesTexto<-"Septiembre";
		10:
			mesTexto<-"Octubre";
		11:
			mesTexto<-"Noviembre";
		12:
			mesTexto<-"Diciembre";
		De Otro Modo:
			Escribir "Introduzca un valor válido";
	FinSegun
	
	Si mesTexto<>"" Entonces
		Escribir "El mes introducido es ", mesTexto;
	FinSi
	
FinProceso
