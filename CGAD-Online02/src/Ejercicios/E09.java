/*
 * Programa que introducido un número indique si es positivo. Si no lo es finalizará el programa pero en caso de que sea mayor que cero mostrará todos los números entre los que es divisible.
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
		System.out.print(" Por favor introduzca un número ");
		numero = teclado.nextInt();
		if (numero > 0) {
			for (int i = numero; i > 0; i--) {
				if (numero % i == 0) {
					System.out.println(" El número introducido es positivo y es divisible entre : " + i);
				}
			}
		} else {
			System.out.println(" El número introducido es negativo ");
			System.out.println(" El programa ha finalizado ");

		}

	}
}
