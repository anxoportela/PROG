Proceso sin_titulo
	
	Definir nota Como Entero;
	Definir notaTexto Como Caracter;
	
	Escribir "Introduzca una nota numérica válida";
	Leer nota;
	
	notaTexto<-"";
	
	Segun nota Hacer
		0,1,2,3,4:
			notaTexto<-"Suspenso";
		5:
			notaTexto<-"Regular";
		6:
			notaTexto<-"Bien";
		7,8:
			notaTexto<-"Notable";
		9:
			notaTexto<-"Excelente";
		10:
			notaTexto<-"Sobresaliente";
		De Otro Modo:
			Escribir "Introduzca un valor válido";
	FinSegun
	
	Si notaTexto<>"" Entonces
		Escribir "La nora es ", notaTexto;
	FinSi
	
FinProceso