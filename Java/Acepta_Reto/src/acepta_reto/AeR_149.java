/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta_reto;

/**
 *
 * @author anxo
 */
import java.util.Scanner;

public class AeR_149 {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        int toros, velocidad, corredor;

        while (entrada.hasNext()) {
            corredor = 0;
            toros = entrada.nextInt();
            for (int i = 0; i < toros; i++) {
                velocidad = entrada.nextInt();

                if (velocidad > corredor) {
                    corredor = velocidad;
                }
            }
            System.out.println(corredor);
        }
        entrada.close();
    }

}
