Algoritmo operaciones
	
	Definir A,B Como Entero;
	Definir signo Como Caracter;
	
	Escribir "Introduzca dos n�meros";
	Leer A;
	Leer B;
	Escribir "Introduzca la operaci�n a realizar (+|-|*|/)";
	Leer signo;
	
	Si signo == "+" Entonces
		Escribir "El resultado es: " A+B;
	Sino Si signo == "-" Entonces 
			Escribir "El resultado es: " A-B;
		Sino Si signo == "*" Entonces 
				Escribir "El resultado es: " A*B;
			Sino Si signo == "/" Entonces 
					Escribir "El resultado es: " A/B;
				SiNo
					Escribir "Error en el s�mbolo introducido";
				Fin Si;
			Fin Si;
		Fin Si;
	Fin Si;
	
FinAlgoritmo
