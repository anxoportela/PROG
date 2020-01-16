package LeerTxT;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author anxo
 */
public class LeerTxT {

    public static void main(String[] args) {
        leotxt();
        procesoTxT();
        cuentaLineas();
        cuentaLineasBlanco();
        cuentaLetras();
    }

    public static void leotxt() {
        InputStream fichero = LeerTxT.class.getResourceAsStream("texto.txt");
        Scanner entrada = new Scanner(fichero, "ISO-8859-1");

        while (entrada.hasNext()) {
            System.out.println(entrada.nextLine());
        }
    }

    public static void procesoTxT() {
        InputStream fichero = LeerTxT.class.getResourceAsStream("texto.txt");
        Scanner entrada = new Scanner(fichero, "ISO-8859-1");

        String linea;

        while (entrada.hasNext()) {
            linea = entrada.nextLine();
            if (!"".equals(linea)) {
                linea = linea.trim();
                System.out.println(linea);
            }
        }
        
        entrada.close();
    }

    public static void cuentaLineas() {
        InputStream fichero = LeerTxT.class.getResourceAsStream("texto.txt");
        Scanner entrada = new Scanner(fichero, "ISO-8859-1");

        String linea;
        int numLineas;

        numLineas = 0;

        while (entrada.hasNext()) {
            linea = entrada.nextLine();
            numLineas++;
        }
        
        System.out.println(numLineas);
        entrada.close();
    }

    public static void cuentaLineasBlanco() {
        InputStream fichero = LeerTxT.class.getResourceAsStream("texto.txt");
        Scanner entrada = new Scanner(fichero, "ISO-8859-1");

        int lineasBlanco;
        String linea;

        lineasBlanco = 0;

        while (entrada.hasNext()) {
            linea = entrada.nextLine();
            if ("".equals(linea)) {
                lineasBlanco++;
            }
        }
        
        System.out.println(lineasBlanco);
        entrada.close();
    }

    public static void cuentaLetras() {
        InputStream fichero = LeerTxT.class.getResourceAsStream("texto.txt");
        Scanner entrada = new Scanner(fichero, "ISO-8859-1");

        String linea;
        int numLetras;
        String[] vectorLinea;

        numLetras = 0;

        while (entrada.hasNext()) {
            linea = entrada.nextLine();
            if (!"".equals(linea)) {
                linea = linea.trim();
                vectorLinea = linea.split("\\s++");
                for (int i = 0; i < vectorLinea.length; i++) {
                    numLetras++;
                }
            }
        }
        
        System.out.println(numLetras);
        entrada.close();
    }

}
