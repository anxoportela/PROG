Algoritmo bisiesto
	
	Definir ano Como Entero
	
	Escribir "Introduzca a�o a comprobar";
	Leer ano;
	
	Si ((ano%4==0 y ano%100<>0) o ano%400==0) Entonces
		Escribir "El a�o es bisiesto";
	SiNo
		Escribir "El a�o no es bisiesto";
	FinSi
	
FinAlgoritmo
