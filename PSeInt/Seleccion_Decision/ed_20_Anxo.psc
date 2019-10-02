Algoritmo sin_titulo
	
	Definir angulo Como Entero
	Definir cuadrante Como Caracter
	
	
	Si angulo<0 o angulo>360 Entonces
		Escribir "Introduzca un valor correcto";
	SiNo Si angulo==0 o angulo==180 o angulo ==360 Entonces
		Escribir "Se encuentra en el eje de las X";
	SiNo Si angulo==90 o angulo==270 Entonces
			Escribir "Se encuentra en el eje de las Y";
		SiNo Si angulo>0 y angulo<90 Entonces
				cuadrante<-"I";
			SiNo Si angulo>90 y angulo<180 Entonces
					cuadrante<-"II";
			FinSi
	FinSi
FinAlgoritmo
