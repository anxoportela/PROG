/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 *
 */
public class funciones_recursividad {

    public static void main(String[] args) {
        System.out.println(sumaConsecutiva(5));
        System.out.println(fibonacci(1));
    }

    public static int suma(int x, int y) {

        if (y == 0) {
            return x;
        }
        return 1 + suma(x, y - 1);

    }

    public static int sumaConsecutiva(int x) {

        if (x == 0) {
            return 0;
        }
        return x + sumaConsecutiva(x - 1);

    }

    public static int factorial(int x) {

        if (x == 0) {
            return 1;
        }
        return x * factorial(x - 1);

    }

    public static int fibonacci(int x) {

        if (x == 1) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        return fibonacci(x - 1) + fibonacci(x - 2);

    }

}
