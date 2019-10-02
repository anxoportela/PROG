Algoritmo bisiesto
	
	Definir ano Como Entero
	
	Escribir "Introduzca año a comprobar";
	Leer ano;
	
	Si ((ano%4==0 y ano%100<>0) o ano%400==0) Entonces
		Escribir "El año es bisiesto";
	SiNo
		Escribir "El año no es bisiesto";
	FinSi
	
FinAlgoritmo
