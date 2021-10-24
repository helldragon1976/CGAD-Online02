/*
 * Visualiza al menos los puntos 2.6 (Estructura de decisi�n) y 2.7. (Estructura de repetici�n) del curso Java 8 desde cero que est� disponible en OpenWebinars. Posteriormente realiza la pr�ctica de crear una calculadora.
 */
package Ejercicios;

/**
*
* @author Antonio David Cabrera Gomez
*/

import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		int opcion;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("\n");
			System.out.println("**** CALCULADORA DE ANTONIO DAVID CABRERA GOMEZ ****");
			System.out.println("0. Salir del programa");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Resto");
			System.out.print("Introduzca una opci�n valida :");

			opcion = teclado.nextInt();

			if (opcion < 0 || opcion > 5) {
				System.err.println(" Opci�n erronea, introduzca una opci�n valida ");

			} else if (opcion != 0) {
				System.out.println("\n");

				float numero1, numero2;

				System.out.println(" Introduzca el primer numero ");
				numero1 = teclado.nextFloat();

				System.out.println(" Introduzca el segundo numero ");
				numero2 = teclado.nextFloat();

				System.out.println("\n");
				switch (opcion) {
				case 1: // Suma
					System.out.println(" El resultado de la suma es " + (numero1 + numero2));
					break;

				case 2: // Resta
					System.out.println(" El resultado de la resta es " + (numero1 - numero2));
					break;

				case 3: // Multiplicaci�n
					System.out.println(" El resultado de la multiplicaci�n es " + (numero1 * numero2));
					break;

				case 4: // Divisi�n
					System.out.println(" El resultado de la divisi�n es " + (numero1 / numero2));
					break;

				case 5: // Resto
					System.out.println(
							" El resto de dividir " + numero1 + " entre " + numero2 + " es " + numero1 % numero2);
					break;

				}
			}
		} while (opcion != 0);

		System.out.println(" Finalizando .......");

	}

}
