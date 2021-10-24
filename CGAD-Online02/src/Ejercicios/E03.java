/*
 * Indique cuál es el mayor de dos números introducidos por teclado. Si son iguales también ha de notificarlo.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Antonio David Cabrera Gomez
 */

public class E03 {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Por favor ingrese el primer número a comparar ");
		numero1 = teclado.nextInt();
		System.out.println(" Por favor ingrese el segundo número a comparar ");
		numero2 = teclado.nextInt();
		if (numero1 > numero2) {
			System.out.println(" El número " + numero1 + " es el mayor ");
		} else
			System.out.println(" El número " + numero2 + " es el mayor ");
 
	}

}
