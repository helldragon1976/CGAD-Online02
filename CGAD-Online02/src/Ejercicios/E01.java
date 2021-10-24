/*
 * Indique si el número introducido desde teclado es positivo o negativo mostrando un mensaje por pantalla. El cero lo consideraremos como número positivo.
 * 
 *Enlace github: https://github.com/helldragon1976/CGAD-Online02
 */
package Ejercicios;

import java.util.Scanner;

/**
*
* @author Antonio David Cabrera Gomez
*/

public class E01 {

	public static void main(String[] args) {
		int numero;
		System.out.print(" Por favor introduzca un número entero ");
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextInt();
		if (numero < 0) {
			System.out.println(" El numero ingresado es negativo ");
		} else
			System.out.println(" El numero ingresado es positivo ");
	}

}
