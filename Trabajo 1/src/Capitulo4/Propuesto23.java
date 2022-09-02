package Capitulo4;

import java.util.Scanner;

public class Propuesto23 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sea una ecuación de segundo grado Ax^2 + Bx + C digite A, B, C en el orden respectivo:");
		System.out.print("Digite A: ");
		double A = entrada.nextDouble();
		System.out.print("Digite B: ");
		double B = entrada.nextDouble();
		System.out.print("Digite C: ");
		double C = entrada.nextDouble();
		double discriminante = Math.pow(B, 2) - 4 * A * C;
		if(discriminante > 0) {
			System.out.println("La ecuación " + A + "x^2 + " + B + "x + " + C +" tiene dos soluciones las cuales son:");
			System.out.println("x1 = " + ((-1 * B + Math.sqrt(discriminante))/ (2 * A)));
			System.out.println("x2 = " + ((-1 * B - Math.sqrt(discriminante))/ (2 * A)));
		} else if(discriminante == 0) {
			System.out.println("La ecuación " + A + "x^2 + " + B + "x + " + C +" tiene única solución la cuál es: " + (-1 * B / (2 * A)));
		} else {
			System.out.println("La ecuación " + A + "x^2 + " + B + "x + " + C +" tiene infinitas soluciones");
		}
		
	}
}
