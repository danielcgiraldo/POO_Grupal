package Cap4Resuelto7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese A: ");
		double A = entrada.nextDouble();
		System.out.print("Ingrese B: ");
		double B = entrada.nextDouble();
		if(A > B) {
			System.out.println("A (" + A + ") es mayor que B (" + B + ")");
		} else if (B > A) {
			System.out.println("A (" + A + ") es menor que B (" + B + ")");
		} else {
			System.out.println("A (" + A + ") es igual a B (" + B + ")");
		}
	}
}
