package wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class EjerciciosWrappers {

	public static void main(String[] args) {
		// minmaxvalueTiposPrimitivos();
		//contraseniaConRequisitos();
		print100NumberHex();

	}

	public static void minmaxvalueTiposPrimitivos() {
		System.out.println("M�ximo valor para byte: " + Byte.MAX_VALUE);
		System.out.println("M�nimo valor para byte: " + Byte.MIN_VALUE);

		System.out.println("M�ximo valor para Integer: " + Integer.MAX_VALUE);
		System.out.println("M�nimo valor para Integer: " + Integer.MIN_VALUE);

		System.out.println("M�ximo valor para Short: " + Short.MAX_VALUE);
		System.out.println("M�nimo valor para Short: " + Short.MIN_VALUE);

		System.out.println("M�ximo valor para Long: " + Long.MAX_VALUE);
		System.out.println("M�nimo valor para Long: " + Long.MIN_VALUE);

		System.out.println("M�ximo valor para Float: " + Float.MAX_VALUE);
		System.out.println("M�nimo valor para Float: " + Float.MIN_VALUE);

		System.out.println("M�ximo valor para Double: " + Double.MAX_VALUE);
		System.out.println("M�nimo valor para Double: " + Double.MIN_VALUE);

	}

	public static void contraseniaConRequisitos() {

		boolean mayus = false, minus = false, digit = false, notAlpha = false;
		
		
		do {
			
			String password = JOptionPane.showInputDialog("Introduzca contrase�a con mayuscula, minuscula,\n un d�gito y un caracter alfanum�rico");

			char passArray[] = new char[password.length()];

			for (int i = 0; i < passArray.length; i++) {
				passArray[i] = password.charAt(i);
			}
			
			mayus = false; minus = false; digit = false; notAlpha = false;
			
			for (int i = 0; i < passArray.length; i++) {
				if (Character.isUpperCase(passArray[i]) ) {
					mayus = true;
				}
				if (Character.isLowerCase(passArray[i]) ) {
					minus = true;
				}
				if (Character.isDigit(passArray[i]) ) {
					digit = true;
				}
				if (!Character.isLetterOrDigit(passArray[i]) ) {
					notAlpha = true;
				}
			}
		} while (!(mayus && minus && digit && notAlpha));
		
		System.out.println("Contrase�a correcta");
	}
	
	public static void print100NumberHex() {
		for (int i = 0; i < 100; i++) {
			System.out.println("El valor hexadecimal del n�mero " + i + " es " + Integer.toHexString(i));
		}
	}
}
