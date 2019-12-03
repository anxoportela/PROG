package aer_171;

import java.util.Scanner;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
public class AeR_171 {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();

        while (x != 0) {
            String vector[] = new String[x];
            int contador = 1;
            for (int i = 0; i < vector.length; i++) {
                vector[i] = entrada.next();
            }
            
            int aux = Integer.parseInt(vector[x-1]);
            
            for (int i = vector.length -2; i >= 0; i--) {
                if (Integer.parseInt(vector[i]) > aux) {
                    contador++;
                    aux = Integer.parseInt(vector[i]);
                }
            }
            System.out.println(contador);
            x = entrada.nextInt();
        }

    }

}
