package objetos;

import javax.swing.JOptionPane;



public class PruebaPersona {

	public static void main(String[] args) {
		//Pedir la cantidad de personas
		int cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad de personas"));
		Persona personas[] = new Persona[cantidadPersonas];
		//Introducir los campos en cada iteraci�n del bucle
		for (int i = 0; i < personas.length; i++) {
			//Introducir datos
			String nombre = JOptionPane.showInputDialog("Introduzca Nombre");
			String apellidos = JOptionPane.showInputDialog("Introduzca Apellidos");
			String dni = JOptionPane.showInputDialog("Introduzca DNI");
			String direccion = JOptionPane.showInputDialog("Introduzca Direcci�n");
			int tfn = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero de tel�fono"));
			//Asignar valores al objeto
			personas[i] = new Persona(nombre, apellidos, dni, direccion, tfn);
			//Imprimir
			System.out.println("\nPERSONA N�MERO " + i);
			personas[i].imprimir();
			
		}
	}

}
