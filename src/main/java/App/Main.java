
package App;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Elija la base");
		int op = leer.nextInt();
		App ej = new App(op);
		System.out.println("1.Suma \n2.Multiplicaci�n");
		op = leer.nextInt();
		switch (op) {
		case 1:
			ej.llenarSuma();
			ej.mostrar();
			break;
		case 2:
			ej.llenarMult();
			ej.mostrar();
			break;

		}
	}

}
