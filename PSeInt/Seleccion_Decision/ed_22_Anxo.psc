Proceso sin_titulo
	Definir n1,n2,n3,n4 Como Real;
	
	Escribir "Introduzca el primer valor";
	Leer n1;
	Escribir "Introduzca el segundo valor";
	Leer n2;
	Escribir "Introduzca el tercer valor";
	Leer n3;
	Escribir "Introduzca el cuarto valor";
	Leer n4;
	
	Si n1>=n2 y n1>=n3 y n1>=n4 Entonces
		Escribir "El mayor de los cuatro números es ", n1;
	SiNo Si n2>=n3 y n2>=n4 Entonces
			Escribir "El mayor de los cuatro números es ", n2;
		SiNo Si n3>=n4 Entonces
				Escribir "El mayor de los cuatro números es ", n3;
			SiNo
				Escribir "El mayor de los cuatro números es ", n4;
			FinSi;
		FinSi;
	FinSi;	

FinProceso
