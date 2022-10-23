package Cap4Resuelto13;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double discount, compra;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digita el valor de la compra: ");
		compra = entrada.nextDouble();
		System.out.println("Digite la letra según el color de la bolita: ");
		System.out.println("B: Blanca");
		System.out.println("V: Verde");
		System.out.println("A: Amarilla");
		System.out.println("Z: Azul");
		System.out.println("R: Roja");
		char color = entrada.next().charAt(0);
		discount = 2;
		if(color == 'B') discount = 1;
		else if(color == 'V') discount = 0.9;
		else if(color == 'A') discount = 0.75;
		else if(color == 'Z') discount = 0.5;
		else if(color == 'R') discount = 0;
		else System.out.println("Color Equivocado");
		
		if(discount != 2) System.out.println("El valor a pagar por la compra teniendo en cuenta los posibles descuentos es de: $" + compra * discount);
	}
}
