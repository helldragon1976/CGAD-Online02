/*
 * Muestre la tabla de multiplicar de un número introducido por teclado.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Antonio David Cabrera Gomez
 */

public class E07 {

	public static void main(String[] args) {
		int numero;
		do {
			Scanner teclado = new Scanner(System.in);
			System.out
					.println(" Por favor , introduzca el número entero del cual quiere saber su tabla de multiplicar");
			numero = teclado.nextInt();
			if (numero < 0)
				System.err.println(" El número introducido no es valido ");
		} while (numero < 0);
		for (int i = 0; i < 11; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);

		}

	}
}