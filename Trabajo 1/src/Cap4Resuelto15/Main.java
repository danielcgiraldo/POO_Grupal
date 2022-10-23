package Cap4Resuelto15;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite el peso de la esfera A: ");
		double A = entrada.nextDouble();
		System.out.print("Digite el peso de la esfera B: ");
		double B = entrada.nextDouble();
		System.out.print("Digite el peso de la esfera C: ");
		double C = entrada.nextDouble();
		System.out.print("Digite el peso de la esfera D: ");
		double D = entrada.nextDouble();
		if(Math.min(A, B) != Math.min(C,D)) {
			if(Math.min(A, B) == C) System.out.print("La esfera D tiene diferente peso y este es menor al de las otras 3");
			else if( A != D ) System.out.print("La esfera A tiene diferente peso y este es menor al de las otras 3");
			else if( B != D) System.out.print("La esfera B tiene diferente peso y este es menor al de las otras 3");
			else System.out.print("La esfera C tiene diferente peso y este es menor al de las otras 3");
		} else {
			if(Math.max(A, B) == C) System.out.print("La esfera D tiene diferente peso y este es mayor al de las otras 3");
			else if( A != D ) System.out.print("La esfera A tiene diferente peso y este es mayor al de las otras 3");
			else if( B != D) System.out.print("La esfera B tiene diferente peso y este es mayor al de las otras 3");
			else System.out.print("La esfera C tiene diferente peso y este es mayor al de las otras 3");
		}
		
	}
}
