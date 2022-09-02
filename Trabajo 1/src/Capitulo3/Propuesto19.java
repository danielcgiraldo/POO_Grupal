package Capitulo3;
import java.util.Scanner;

public class Propuesto19 {
	public static void main(String[] args) {
		Triangulo mitriangulo = new Triangulo(); 
		System.out.print("Ingrese el lado: ");
		Scanner entrada = new Scanner(System.in); 
		mitriangulo.lado = entrada.nextDouble(); 
		System.out.println("Perímetro del Triángulo: " + mitriangulo.perimetro());
		System.out.println("Altura del Triángulo: " + mitriangulo.altura());
		System.out.println("Área del Triángulo: " + mitriangulo.area(mitriangulo.altura()));
	}

}

class Triangulo {
	double lado;
	public double perimetro() {
		return lado*3;
	}
	public double altura() {
		return Math.sqrt(Math.pow(lado, 2) - Math.pow(lado / 2, 2));
	}
	public double area(double altura) {
		return lado * altura / 2;
	}
}