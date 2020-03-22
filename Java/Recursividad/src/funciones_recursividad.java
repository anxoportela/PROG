// TODO: Auto-generated Javadoc
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * The Class funciones_recursividad.
 *
 * @author Anxo Portela-Insua Blanco <anxoportela@gmail.com>
 * @versión 1.0
 */

public class funciones_recursividad {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println(sumaConsecutiva(5));
		System.out.println(fibonacci(1));
	}

	/**
	 * Suma.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int suma(int x, int y) {

		if (y == 0) {
			return x;
		}
		return 1 + suma(x, y - 1);

	}

	/**
	 * Suma consecutiva.
	 *
	 * @param x the x
	 * @return the int
	 */
	public static int sumaConsecutiva(int x) {

		if (x == 0) {
			return 0;
		}
		return x + sumaConsecutiva(x - 1);

	}

	/**
	 * Factorial.
	 *
	 * @param x the x
	 * @return the int
	 */
	public static int factorial(int x) {

		if (x == 0) {
			return 1;
		}
		return x * factorial(x - 1);

	}

	/**
	 * Fibonacci.
	 *
	 * @param x the x
	 * @return the int
	 */
	public static int fibonacci(int x) {

		if (x == 1) {
			return 1;
		}
		if (x == 0) {
			return 0;
		}

		return fibonacci(x - 1) + fibonacci(x - 2);

	}

	/**
	 * Cociente.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int cociente(int x, int y) {

		if (x < y) {
			return 0;
		} else {
			return 1 + cociente(x - y, y);
		}
	}

	/**
	 * Elevado 2 n.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int elevado2n(int x, int y) {

		if (y == 0) {
			return 1;
		} else {
			return x * elevado2n(x, y - 1);
		}
	}

	/**
	 * Par.
	 *
	 * @param x the x
	 * @return true, if successful
	 */
	public static boolean par(int x) {

		if (x == 0) {
			return true;
		} else if (x == 1) {
			return false;
		} else {
			return par(x - 2);
		}
	}

	/**
	 * Multip.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int multip(int x, int y) {

		if (y == 1) {
			return x;
		} else {
			return x + multip(x, y - 1);
		}
	}

	/**
	 * Mcd.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int mcd(int x, int y) {

		if (y == 0) {
			return x;
		} else {
			return mcd(y, x % y);
		}
	}

	/**
	 * Suma vector.
	 *
	 * @param x the x
	 * @param y the y
	 * @return the int
	 */
	public static int sumaVector(int[] x, int y) {

		if (y == 0) {
			return x[y];
		} else {
			return x[y] + sumaVector(x, y - 1);
		}
	}

	/**
	 * Invertir.
	 *
	 * @param x the x
	 * @return the int
	 */
	public static int invertir(int x) {

		if (x < 10) {
			return x;
		} else {
			return (x % 10) + invertir(x / 10) * 10;
		}
	}

}
