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

public class AeR_347 {

    public static void main(String[] args) {

        Scanner entrada;
        entrada = new Scanner(System.in);

        int ancho, alto, resultado;

        ancho = entrada.nextInt();
        alto = entrada.nextInt();
        resultado = 0;

        while (ancho != 0 && alto != 0) {

            while (ancho >= 10 && alto >= 10) {
                if (ancho >= alto) {
                    resultado += Math.floor(ancho / alto);
                    ancho = ancho % alto;
                } else {
                    resultado += Math.floor(alto / ancho);
                    alto = alto % ancho;
                }
            }

            System.out.println(resultado);
            ancho = entrada.nextInt();
            alto = entrada.nextInt();
            resultado = 0;

        }
    }
}
