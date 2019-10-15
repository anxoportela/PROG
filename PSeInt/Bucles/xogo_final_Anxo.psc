Algoritmo sin_titulo
	
	Definir adivina Como Entero;
	Definir resultado, vueltas Como Entero;
	Definir nmax, noper, intentos Como Entero;
	Definir operacion Como caracter;
	
	nmax <- 101;
	noper <- 2;
	
	Repetir
		resultado <- 1; 
		para vueltas <- 1 hasta noper con paso 1 hacer
			resultado <- resultado * azar(nmax);
		FinPara
		
		Escribir "El numero anterior al correcto es: ", resultado -1;
		
		intentos <- 5;
		Repetir
			Escribir "Introduzca un número entero, te quedan: ", intentos, " intentos";
			Leer adivina;
			intentos <- intentos - 1;
		Hasta Que adivina == resultado | intentos == 0;
		
		Si adivina == resultado Entonces
			Escribir "Has introducido el número correcto";
		SiNo
			Escribir "Vuelve a intentarlo";
		FinSi
		
		Escribir "Quieres volver a jugar? s/n";
		Leer operacion;
		
		Segun operacion Hacer
			"s":
				escribir "Volver a empezar";
			"n":
				Escribir "Gracias por jugar";
		FinSegun
		
	Hasta Que operacion == "n" | intentos < 0; 
	
FinAlgoritmo