package objetos.FiguraGeometrica;

import toolbox.Utils;

public class Main {

	public static void main(String[] args) {
		Triangulo figura = new Triangulo(Utils.requestUserNumber("Introduzca altura:"), Utils.requestUserNumber("Introduzca anchura"));
		
		switch (Utils.requestUserNumber("1 para Rect�ngulo\n2 para Tri�ngulo")) {
		case 1:
			figura.imprimirTriangulo();
			break;
			
		case 2:
			
			break;
		}
	}

}
