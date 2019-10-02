Algoritmo areas
	
	Definir base,altura,radio Como Real;
	Definir arearec,areacirc Como Real;
	
	Escribir "Introduzca la base del rectángulo:"
	Leer base;
	Escribir "Introduzca la altura del rectángulo:"
	Leer altura;
	Escribir "Introduzla el radio de la circunferencia:"
	Leer radio;
	
	arearec <- base * altura;
	areacirc <- PI * radio^2;
	
	Si arearec=areacirc Entonces
		Escribir "Las áreas de las figuras son iguales";
	SiNo
		Escribir "Las áreas de las figuras son distintas";
	FinSi
	
FinAlgoritmo
