package excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.sun.javadoc.ThrowsTag;

/**
 *
 * @author dual108
 * @date 14 feb. 2020
 * @version 1.0
 *
 */

public class PruebaExcepciones {
	
	public static int calculo() throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bf.readLine();
		
		int a = 8;
		int b = 0;
		int c;
		String s = "****54";
		
		try {
			int h = Integer.parseInt(s);
			c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			c=0;
		} catch (NumberFormatException e) {
			c=0;
		} catch (Exception e) {
			c=0;
		} finally {
			c=0;
			c++;
		}
		
		return c;
	}
	
	public static void fallo(int valor) throws ExcepcionPropia {		
		if(valor>100) {
			throw new ExcepcionPropia("Algo anda mal");
		}
	}

}
