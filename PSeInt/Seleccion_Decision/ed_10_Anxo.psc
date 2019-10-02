Algoritmo sumahora
	
	Definir h1,h2,m1,m2,s1,s2 Como Entero;
	Definir dia,hr,mr,sr Como Entero;
	
	Escribir "Introduzca una hora: ";
	Leer h1;
	Escribir "Introduzca los minutos: ";
	Leer m1;
	Escribir "Introduza los segundos: ";
	Leer s1;
	
	Escribir "Introduzca la hora a sumar: ";
	Leer h2;
	Escribir "Introduzca los minutos a sumar: ";
	Leer m2;
	Escribir "Introduza los segundos a sumar: ";
	Leer s2;
	
	Si (s1+s2)<60 Entonces
		sr<-s1+s2;
	SiNo
		sr<-(s1+s2)-60;
		m1<-m1+1;		
	FinSi
	
	Si (m1+m2)<60 Entonces
		mr<-m1+m2;
	SiNo
		mr<-(m1+m2)-60;
		h1<-h1+1;
	FinSi
	
	Si (h1+h2)<24 Entonces
		hr<-h1+h2;
	SiNo
		hr<-(h1+h2)-24;
		dia=1;
	FinSi
	
	Si dia<1 Entonces
		Escribir "La suma de las horas es: ", hr, ":", mr, ":", sr
	SiNo
		Escribir "La suma de las horas es: ", dia, ":", hr, ":", mr, ":", sr
	FinSi
	
FinAlgoritmo
