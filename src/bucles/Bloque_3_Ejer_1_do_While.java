package bucles;

import javax.swing.JOptionPane;

public class Bloque_3_Ejer_1_do_While {

	public static void main(String[] args) {
		int suma = 0; //Result
		int contMedia = 0;
		int sumando = 0;
		
		// infinite loop
		do {
			//request number
			sumando = Integer.parseInt(JOptionPane.showInputDialog("Introduzca sumandos: "));
			//screen
			if (sumando == 0) {
				System.out.println("Insumable. Media: " + ((float) suma / contMedia));
				return;
			}
			else {
				contMedia++; 
				suma += sumando;
				System.out.println("Media actual: " + ((float) suma / contMedia));
			}
		}while( sumando == 0);
	}
}
