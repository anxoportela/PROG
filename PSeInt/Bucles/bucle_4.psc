Algoritmo sin_titulo
	
	Definir codigo,codigoyo,clave,contrasena Como Caracter;
	
	contrasena <- "1234";
	codigo <- "1";
	error<-0;
	
	Repetir
		Si error>0 Entonces
			Escribir "Introduzca un nuevo c�digo entre 0-9";
			Leer codigoyo;
			Escribir "Introduzca una nueva contrase�a";
			Leer clave;
		SiNo
			Escribir "Introduzca un c�digo entre 0-9";
			Leer codigoyo;
			Escribir "Introduzca una contrase�a";
			Leer clave;
			error <- error+1;
		FinSi
	Hasta Que contrasena==clave y codigo==codigoyo
	
	Escribir "Los valores introducidos son correctos"
	
FinAlgoritmo
