Algoritmo sin_titulo
	
	Definir distancia,precio,peso Como Real;
	Definir	ano,categoria,tarifa Como Entero;
	
	Escribir "Introduzca la distancia recorrida";
	Leer distancia;	
	
	Escribir "Introduzca el peso del automóvil";
	Leer peso;
	Escribir "Introduzca el año de fabricación del automóvil"
	Leer ano;
	
	Si distancia<=300 Entonces
		precio<-30;
	SiNo Si distancia>300 y distancia<=1000 Entonces
			precio<-30+(distancia-300)*0.15;
		SiNo Si distancia>1000 Entonces
				precio<-30+(distancia-1000)*0.10;
			FinSi
		FinSi
	FinSi
	
	Si peso<2700 Entonces
		Si ano<=1970 Entonces
			categoria<-1;
			tarifa<-11600;
		Sino Si ano>1970 y ano<1980 Entonces
				categoria<-4;
				tarifa<-13000;
			SiNo Si ano>=1980 Entonces
					categoria<-7;
					tarifa<-12000;
				FinSi
			FinSi
		FinSi
	SiNo Si peso>=2700 y peso<3500 Entonces
			Si ano<=1970 Entonces
				categoria<-2;
				tarifa<-23200;
			Sino Si ano>1970 y ano<1980 Entonces
					categoria<-5;
					tarifa<-26000;
				SiNo Si ano>=1980 Entonces
						categoria<-7;
						tarifa<-12000;
					FinSi
				FinSi
			FinSi	
		SiNo Si peso>=3500 y peso<3800 Entonces
				Si ano<=1970 Entonces
					categoria<-2;
					tarifa<-23200;
				Sino Si ano>1970 y ano<1980 Entonces
						categoria<-5;
						tarifa<-26000;
					SiNo Si ano>=1980 Entonces
							categoria<-8;
							tarifa<-46000;
						FinSi
					FinSi
				FinSi	
			SiNo Si peso>=3800 Entonces
					Si ano<=1970 Entonces
						categoria<-3;
						tarifa<-34800;
					Sino Si ano>1970 y ano<1980 Entonces
							categoria<-6;
							tarifa<-39000;
						SiNo Si ano>=1980 Entonces
								categoria<-8;
								tarifa<-46000;
							FinSi
						FinSi
					FinSi			
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	Escribir "El total a pagar es ", precio, "€";
	Escribir "La categoría del vehículo es ", categoria, " y su tarifa de registro es ", tarifa, "€"
	
	
FinAlgoritmo
