
package acepta_reto;

/**
 * 
 * @author dual108
 * @version 1.0
 */

// Importación de librerías
import java.util.Scanner;


public class AeR_155 {

    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        
        // Declaración de variables
        // Entrada de datos
        int base,altura;
        // Salida de datos
        int perimetro;
        // Operativa
        Scanner entrada;
        // Constantes
        // Inicialización
        // Creación de objetos
        entrada = new Scanner(System.in);
        
        // Entrada de datos
        base = entrada.nextInt();
        altura = entrada.nextInt();
        
        // Resolución
        
       while (base >= 0 && altura >= 0){
           perimetro = base*2 + altura*2;
           System.out.println(perimetro);
           base = entrada.nextInt();
           altura = entrada.nextInt();
       }
        
    } // Fin método main
    
} // Fin de clase
