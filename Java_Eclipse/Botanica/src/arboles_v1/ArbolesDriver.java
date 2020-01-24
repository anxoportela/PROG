package arboles_v1;

import arboles_v1.Arbol;
import arboles_v1.Hojas;

/**
 *
 * @author dual108
 * @date 24 ene. 2020
 * @version 1.0
 *
 */

public class ArbolesDriver {
	
	public static void main(String[] args) {
		
		Arbol pino = new Arbol();
		
		pino.nombreLatino = "Pinus Pinaster";
		pino.nombreComun = "Pino";
		pino.hojas = Hojas.PERENNE;
		pino.concello ="Ramirás";
		pino.ano = 1998;
		pino.altura = 23.25;
		
		System.out.println(pino);
		
	}

}
