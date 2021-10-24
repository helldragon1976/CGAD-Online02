/*
 * Reciba dos números desde teclado. Y realice una de las siguientes acciones:

 * Si el primer número es mayor que el segundo realice la resta.

 * Si el primer número es menor que el segundo realice la suma.

 * Si los números son iguales realice la multiplicación.   
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
		System.out.println(" Por favor introduzca el primer número ");
		numero1 = teclado.nextInt();
		System.out.println(" Por favor introduzca el segundo número ");
		numero2 = teclado.nextInt();
		if (numero1 > numero2) {
			System.out.println(" El número " + numero1 + " es el mayor "
			 + " El resultado de su resta " + numero1 + " - " + numero2 + " es : " + (numero1 - numero2));

		}else if (numero1 < numero2) 
				System.out.println(" El número " + numero2 + " es el mayor "
			         + " El resultado de su suma " + numero2 + " + " + numero1 + " es : " + (numero1 + numero2));
		 
		
		else 
			System.out.println(" Los 2 números introducidos son iguales "
		 + " La multiplicación de " + numero1 + " x " + numero2 + " es : " + (numero1 * numero2));
		}
	
	}


