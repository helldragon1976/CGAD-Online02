/*Igual que el ejercicio 1 pero en el caso que sea cero el número introducido muestre por pantalla el mensaje: "el número es cero".
 */
package Ejercicios;

import java.util.Scanner;

/**
*
* @author Antonio David Cabrera Gomez
*/

public class E02 {

	public static void main(String[] args) {
		int numero;
		System.out.print(" Por favor introduzca un numero entero ");
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextInt();
		if (numero == 0) {
			System.out.println(" El numero es cero ");
		} else if (numero < 0)
			System.out.println(" El numero ingresado es negativo ");
		else
			System.out.println(" El numero ingresado es positivo ");

	}

}
