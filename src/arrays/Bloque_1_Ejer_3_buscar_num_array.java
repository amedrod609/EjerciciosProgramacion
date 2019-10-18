package arrays;

import javax.swing.JOptionPane;

public class Bloque_1_Ejer_3_buscar_num_array {

	public static void main(String[] args) {
int array[] = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			//Asignar valores
			array[i] = (int) (Math.round(Math.random() * 100));
			
		}
			//Mostrar array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
		//Pedir n�mero al usuario
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero: "));
		
		//Buscar n�mero
		boolean isNumberOnArray = false;
		for (int i = 0; i < array.length && !isNumberOnArray; i++) {
			if (num == array[i]) {
				System.out.println("\nEl n�mero " + num + " se encuentra en la posicion de array " + i);
				isNumberOnArray = true;
			}
			
		}
		
		//Si no est�
		if (!isNumberOnArray) {
			System.out.println("El n�mero " + num + " no se encuentra");
		}
	}
}