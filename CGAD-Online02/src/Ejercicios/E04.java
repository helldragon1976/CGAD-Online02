/*
 * Reciba dos n�meros desde teclado. Y realice una de las siguientes acciones:

 * Si el primer n�mero es mayor que el segundo realice la resta.

 * Si el primer n�mero es menor que el segundo realice la suma.

 * Si los n�meros son iguales realice la multiplicaci�n.   
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Antonio David Cabrera Gomez
 */

public class E04 {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Por favor introduzca el primer n�mero ");
		numero1 = teclado.nextInt();
		System.out.println(" Por favor introduzca el segundo n�mero ");
		numero2 = teclado.nextInt();
		if (numero1 > numero2) {
			System.out.println(" El n�mero " + numero1 + " es el mayor "
			 + " El resultado de su resta " + numero1 + " - " + numero2 + " es : " + (numero1 - numero2));

		}else if (numero1 < numero2) 
				System.out.println(" El n�mero " + numero2 + " es el mayor "
			         + " El resultado de su suma " + numero2 + " + " + numero1 + " es : " + (numero1 + numero2));
		 
		
		else 
			System.out.println(" Los 2 n�meros introducidos son iguales "
		 + " La multiplicaci�n de " + numero1 + " x " + numero2 + " es : " + (numero1 * numero2));
		}
	
	}


