Algoritmo notas
	
	Definir nota Como Real;
	
	Escribir "Introduzca la nota del alumno: ";
	Leer nota;
	
	Si (nota<0 o nota>10) Entonces
		Escribir "Introduzca una nota correcta";
	SiNo Si nota<5 Entonces
			Escribir "El alumno ha suspendido";	
		SiNo Si (nota>=5 y nota<7) Entonces
				Escribir "El alumno ha aprobado";
			SiNo Si (nota>=7 y nota<9) Entonces
					Escribir "El alumno ha sacado bien";
				SiNo Si (nota>=9 y nota<10) Entonces
						Escribir "El alumno ha sacado notable";
					SiNo
						Escribir "El alumno ha sacado sobresaliente";
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi

FinAlgoritmo
