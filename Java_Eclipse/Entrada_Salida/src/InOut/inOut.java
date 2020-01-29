package InOut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class inOut {
	
	public static void main(String[] args) throws IOException {
		
		/*
		InputStream entrada = new FileInputStream("C:/Users/dual108/Documents/GitHub/PROG/Archivos/lectura.txt");
		
		int data;
		
		while ((data = entrada.read()) != -1) {
			System.out.print((char)data);
		}
		
		//System.out.println(data);
		
		entrada.close();
		*/
		
		/*
		FileReader entrada = new FileReader("C:/Users/dual108/Documents/GitHub/PROG/Archivos/lectura.txt");
		
		int data = entrada.read();
		
		while(data!=-1) {
			System.out.print((char)data);
		}
		
		entrada.close();
		*/
		
		BufferedReader entrada = new BufferedReader(new FileReader("C:/Users/dual108/Documents/GitHub/PROG/Archivos/lectura.txt"));
		
		String data;
		
		while((data = entrada.readLine())!=null) {
			System.out.println(data);
		}
		
		entrada.close();
		
	}

}
