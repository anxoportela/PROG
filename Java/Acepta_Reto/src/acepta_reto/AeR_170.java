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

public class AeR_170 {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        int piedras, lado, resto;

        piedras = entrada.nextInt();
        lado = 1;
        resto = 0;

        while (piedras > 0) {

            for (int i = 0; i < piedras; i++) {
                resto += lado;
                lado++;
                if (resto == piedras) {
                    lado--;
                    System.out.println(lado + " " + 0);
                    break;
                } else if ((resto + lado) > piedras) {
                    lado--;
                    System.out.println(lado + " " + (piedras - resto));
                    break;
                }

            }

            piedras = entrada.nextInt();
            lado = 1;
            resto = 0;

        }

    }

}
