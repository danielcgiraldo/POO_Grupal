package Cap4Resuelto11;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digita 3 números enteros:");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		System.out.println("El número mayor entre ellos es: " + Math.max(Math.max(num1, num2), num3));
	}
}
