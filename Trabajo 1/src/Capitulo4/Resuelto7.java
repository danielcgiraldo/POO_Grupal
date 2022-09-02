package Capitulo4;

import java.util.Scanner;

public class Resuelto7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double A = entrada.nextDouble();
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
