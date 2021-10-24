/*
 * Programa que introducido un n�mero indique si es positivo. Si no lo es finalizar� el programa pero en caso de que sea mayor que cero mostrar� todos los n�meros entre los que es divisible.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Antonio David Cabrera Gomez
 */

public class E09 {

	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print(" Por favor introduzca un n�mero ");
		numero = teclado.nextInt();
		if (numero > 0) {
			for (int i = numero; i > 0; i--) {
				if (numero % i == 0) {
					System.out.println(" El n�mero introducido es positivo y es divisible entre : " + i);
				}
			}
		} else {
			System.out.println(" El n�mero introducido es negativo ");
			System.out.println(" El programa ha finalizado ");

		}

	}
}
