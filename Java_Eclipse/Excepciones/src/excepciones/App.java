package excepciones;

import java.io.IOException;

/**
 *
 * @author dual108
 * @date 14 feb. 2020
 * @version 1.0
 *
 */

public class App {
	
	public static void main(String[] args) throws IOException, ExcepcionPropia {		
		//int res = PruebaExcepciones.calculo();
		//System.out.println(res);
		PruebaExcepciones.fallo(125);		
	}

}
