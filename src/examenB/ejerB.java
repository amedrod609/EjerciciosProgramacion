package examenB;

import toolbox.Utils;

public class ejerB {

	public static void main(String[] args) {
		// Generar n�mero a evaluar
		int numero =3;
		// Imprimir el n�mero
		System.out.println("n�mero a examinar: " + numero);
		// Comprobar si todos los n�meros entre 2 y �l mismo menos 1
		// son divisores
		for (int i = 2; i < numero - 1; i++) {
			// si hay divisores en numero es compuesto
			if (numero % i == 0) {
				// Se imprime y se acaba aqu� el programa
				System.out.println("\nEl n�mero es compuesto");
				return;
			}
		}
		// Si el n�mero no es compuesto, es primo
		System.out.println("\nEl n�mero es primo");
	}

}
