package exception;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		try {
			pedirNumeroPar();
		} catch (NumeroImparException e) {
			e.printStackTrace();
		}

	}

	public static void pedirNumeroPar() throws NumeroImparException {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca n�mero par"));
		if (num % 2 == 0) {
			System.out.println("El n�mero es par, muy bien");
		} else {
			throw new NumeroImparException("El n�mero no es par, GGGGGGGGGGGImb�cil");
		}
	}

}
