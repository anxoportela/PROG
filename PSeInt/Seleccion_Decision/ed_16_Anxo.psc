Algoritmo sin_titulo
	
	Definir n1,n2,n3,n4 Como Real;
	Definir v1,v2,v3 Como Real;
	
	Escribir "Introduzca el primer valor";
	Leer n1;
	Escribir "Introduzca el segundo valor";
	Leer n2;
	Escribir "Introduzca el tercer valor";
	Leer n3;
	Escribir "Introduzca el cuarto valor";
	Leer n4;
	
	
	Si (n1<0 o n1>10) o (n2<0 o n2>10) o (n3<0 o n3>10) o (n4<0 o n4>10) Entonces
		Escribir "Introduzca notas correctas";
	SiNo Si n1 <= n2 y n1 <= n3 y n1 <= n4 Entonces
			v1 = n2;
			v2 = n3;
			v3 = n4;
		SiNo Si n2 <= n3 y n2 <= n4 Entonces
				v1 = n1;
				v2 = n3;
				v3 = n4;
			SiNo Si n3 <= n4 Entonces
					v1 = n2;
					v2 = n1;
					v3 = n4;
				SiNo
					v1 = n2;
					v2 = n3;
					v3 = n1;
				FinSi
			FinSi
		FinSi
	FinSi
	
	Escribir "El promedio de las prácticas es: ", (v1+v2+v3)/3;
	
FinAlgoritmo
