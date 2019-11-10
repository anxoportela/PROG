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

public class AeR_119 {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        int legionarios, escudos, raiz;

        legionarios = entrada.nextInt();

        while (legionarios > 0) {
            escudos = 0;
            while (true) {
                if (legionarios == 0) {
                    break;
                }
                if (legionarios < 4) {
                    escudos += legionarios * 5;
                    break;
                }

                raiz = (int) Math.sqrt(legionarios);
                legionarios -= (raiz * raiz);
                escudos += (raiz - 2) * (raiz - 2) + 12 + ((raiz - 2) * 4) * 2;

            }
            System.out.println(escudos);
            legionarios = entrada.nextInt();

        }
    }

}
