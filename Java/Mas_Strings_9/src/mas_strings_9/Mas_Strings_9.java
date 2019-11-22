/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mas_strings_9;

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 */
import java.util.Scanner;

public class Mas_Strings_9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double peso, resultado, altura;
        System.out.print("Introduzca su peso en kilogramos: ");
        peso = entrada.nextDouble();
        System.out.print("Introduzca su altura en centimetros: ");
        altura = entrada.nextDouble();
        resultado = pesoImc(peso, altura);

        if (resultado < 18.5) {
            System.out.println("Por debajo del peso");
        } else if (resultado >= 18.5 && resultado < 25) {
            System.out.println("Saludable");
        } else if (resultado >= 25 && resultado < 30) {
            System.out.println("Con sobrepeso");
        } else if (resultado >= 30 && resultado < 40) {
            System.out.println("Obeso");
        } else {
            System.out.println("Obesidad extrema o de alto riesgo");
        }
    }

    public static double pesoImc(double x, double y) {
        double resultado;
        resultado = x / Math.pow(y, 2);
        return resultado;
    }
}
