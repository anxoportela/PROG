
package bucles;

/**
 *
 * @author anxo
 */
public class Suma300Impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i,suma;
        suma = 0;
        
        for (i=1;i<=300;i+=2){
            suma+=i;
        }
        
        System.out.println("La suma de los primeros 300 números positivos impares es: " + suma);
    }
    
}
