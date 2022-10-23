package Cap3Propuesto21;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Triangulo mitriangulo = new Triangulo();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese Lado 1: ");
        mitriangulo.a = entrada.nextDouble();

        System.out.print("Ingrese Lado 2: ");
        mitriangulo.b = entrada.nextDouble();

        System.out.print("Ingrese Lado 3: ");
        mitriangulo.c = entrada.nextDouble();

        
        System.out.println("Perímetro:  " + mitriangulo.perimetro());
        System.out.println("Semiperímetro:  " + mitriangulo.semipe());
        System.out.println("Área:  " + mitriangulo.area());
    }
}

class Triangulo {
     double semipe, a, b, c, perimetro;
	public double perimetro() {
		perimetro = a + b + c;
		return perimetro;
	}
	public double semipe() {
		semipe = perimetro / 2;
		return semipe;
	}

	public double area() {
			return Math.sqrt(semipe * (semipe - a) * (semipe - b) * (semipe - c));
	
	
	}
}