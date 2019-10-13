Proceso sin_titulo
	
	Definir temp Como Real;
	Definir estado Como Caracter;
	
	estado<-"";
	
	Escribir "Introduzca la temperatura del agua en grados celsius";
	Leer temp;
	
	Si temp<=0 Entonces
		estado<-"solido";
	FinSi
	Si temp>0 y temp<=100 Entonces
		estado<-"liquido";
	FinSi
	Si temp>100 Entonces
		estado<-"gaseoso";
	FinSi
	
	Escribir "El estado físico del agua es ", estado;
	
FinProceso
