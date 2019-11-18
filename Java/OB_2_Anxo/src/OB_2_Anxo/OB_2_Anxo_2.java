/*
 * Documento creado en 2019 por DAWDU1
 * CIFP A Carballeira. Proyecto OB_2_Anxo el 18 nov. 2019
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package OB_2_Anxo;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */
public class OB_2_Anxo_2 {

    public static void main(String[] args) {

        int[][] matriz = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = 1;
        }
        
        for ( int [] x : matriz){
            System.out.println(matriz + " ");
        }
    }

}
