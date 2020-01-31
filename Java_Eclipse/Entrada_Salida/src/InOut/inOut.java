package InOut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 *
 * @author dual108
 * @date 29 ene. 2020
 * @version 1.0
 *
 */

public class inOut {
	
	/**
	 * @param args
	 * @throws IOException
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
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
		
		/*
		BufferedReader entrada = new BufferedReader(new FileReader("C:/Users/dual108/Documents/GitHub/PROG/Archivos/lectura.txt",Charset.forName("UTF-8")));
		
		entrada.mark(200);
		String data;
		
		while((data = entrada.readLine())!=null) {
			System.out.println(data);
		}
		
		entrada.reset();
		
		System.out.println(entrada.readLine());
		
		entrada.close();
		*/
		
		/*
		File file;
		FileWriter fw = new FileWriter("C:/Users/dual108/Documents/GitHub/PROG/Archivos/prueba.txt",Charset.forName("UTF-8"), true);
		
		fw.write("Julio\r\n");
		fw.write("Mosquera\r\n");
		fw.write("González\r\n");
		fw.close();
		*/
		
		/*
		File f = new File("C:/Users/dual108/Documents/GitHub/PROG/Archivos/nuevoArchivo.txt");
		FileInputStream is = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		*/
		
		/*
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		*/
		
		/*
		Properties propiedades = new Properties();
		FileReader fr =  new FileReader("C:/Users/dual108/Documents/GitHub/PROG/Archivos/propiedades");
		propiedades.load(fr);
		
		System.out.println(propiedades.getProperty("usuario"));
		*/
		
		/*
		String s = System.getenv("userprofile");
		System.out.println(s);
		*/
		
		File f = new File("C:/Users/dual108/Documents/GitHub/PROG/Archivos/prueba.txt");
		
		try {
			FileInputStream fi = new FileInputStream(f);
			fi.read();
			
			int i = 8;
			int res = i/0;
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado: " + e.getMessage());
			//e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Error matemático " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
