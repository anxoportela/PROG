Proceso sin_titulo
	
	Definir a, b Como Entero;
	Definir opcion Como Caracter;
	
	opcion <- "";
	
	Mientras opcion <> "S" Hacer
		Escribir "Seleccione la opci�n que desee";
		Escribir "1.- Suma";
		Escribir "2.- Resta";
		Escribir "3.- Producto";
		Escribir "4.- Divisi�n";
		Escribir "S.- Salir";
		Leer opcion;
		opcion <- Mayusculas(opcion);
		
		Si (opcion < "0" || opcion > "4") Entonces
			Escribir "Opci�n no v�lida";
		SiNo Si (opcion = "1") Entonces
				Escribir "Introduzca el valor para A";
				Leer a;
				Escribir "Introduzca el valor para B";
				Leer b;
				Escribir "El resultado es: ",a + b;
			SiNo Si (opcion = "2") Entonces
					Escribir "Introduzca el valor para A";
					Leer a;
					Escribir "Introduzca el valor para B";
					Leer b;
					Escribir "El resultado es: ",a - b;
				SiNo Si (opcion = "3") Entonces
						Escribir "Introduzca el valor para A";
						Leer a;
						Escribir "Introduzca el valor para B";
						Leer b;
						Escribir "El resultado es: ",a * b;
					SiNo Si (opcion = "4") Entonces
							Escribir "Introduzca el valor para A";
							Leer a;
							Escribir "Introduzca el valor para B";
							Leer b;
							Mientras b == 0 Hacer
								Escribir "Introduzca un valor diferente a 0";
								Leer b;
							FinMientras
							Escribir "El resultado es: ",a / b;
						FinSi
					FinSi
				FinSi	
			FinSi
		FinSi
		
	FinMientras
	
	
FinProceso
