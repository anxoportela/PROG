Proceso sin_titulo
	
	Definir a,b,simboloNum Como Entero;
	Definir simbolo Como Caracter;
	Definir operacion Como Real;
	
	Escribir "Introduzca dos valores enteros";
	Leer a;
	Leer b;
	
	Escribir "Introduzca la operación a realizar (+,-.*,/)";
	Leer simbolo;
	
	Si simbolo <> "+" o simbolo <> "-" o simbolo <> "*" o simbolo <> "/" Entonces
		Escribir "Error de símbolo";
	SiNo
		Si simbolo=="+" Entonces
			simboloNum<-1;
		FinSi
		Si simbolo=="-" Entonces
			simboloNum<-2;
		FinSi
		Si simbolo=="*" Entonces
			simboloNum<-3;
		FinSi
		Si simbolo=="/" Entonces
			simboloNum<-4;
		FinSi
		Segun simboloNum Hacer
			1:
				operacion<-a+b;
			2:
				operacion<-a-b;
			3:
				operacion<-a*b;
			4:
				operacion<-a/b;
		FinSegun
	FinSi
	
	Si simbolo=="+" o simbolo=="+" o simbolo=="+" o simbolo=="+" Entonces
		Escribir "El resultado de la operación es ", operacion;
	FinSi

	
FinProceso
