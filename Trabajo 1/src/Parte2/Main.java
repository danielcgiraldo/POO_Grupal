package Parte2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Rectangulo r = new Rectangulo();
        Circulo c = new Circulo();
        TrianguloRectangulo tr  = new TrianguloRectangulo();
        Cuadrado cu = new Cuadrado();

        System.out.println("Elija la figura: \n 1. Circulo \n 2. Cuadrado \n 3. Rectangulo \n 4. Triangulo Rectangulo" );
        double figura = entrada.nextInt();

        if (figura == 1){
            System.out.println("Ingrese el radio del circulo: ");
            c.radio = entrada.nextInt();
            System.out.println("Area: " + c.area());
            System.out.println("Perimetro: " + c.perimetro());
        }
        if (figura == 2){
            System.out.println("Ingrese la longitud del lado del cuadrado: ");
            cu.lado = entrada.nextInt();
            System.out.println("Area: " + cu.area());
            System.out.println("Perimetro: " + cu.perimetro());
        }
        if (figura == 3){
            System.out.println("Ingrese la longitud de la base del rectangulo: ");
            r.base = entrada.nextInt();
            System.out.println("Ingrese la longitud de la altura del rectangulo: ");
            r.altura = entrada.nextInt();
            System.out.println("Area: " + r.area());
            System.out.println("Perimetro: " + r.perimetro());
        }
        if (figura == 4){
            System.out.println("Ingrese la longitud de la base del triangulo: ");
            tr.base = entrada.nextInt();
            System.out.println("Ingrese la longitud de la altura del triangulo: ");
            tr.altura = entrada.nextInt();
            System.out.println("Area: " + tr.area());
            System.out.println("Perimetro: " + tr.perimetro());
            System.out.println("Hipotenusa: " + tr.hipotenusa());
            System.out.println(tr.tipoTriangulo());
        }
    }
}
class Rectangulo {
    double base, altura;

    public double area(){
        double area = base * altura;
        return area;
    }
    public double perimetro(){
        double perimetro = (2*base) + (2*altura);
        return perimetro;
    }
}
class Circulo {
    double radio;
    public double area(){
        double area = Math.PI*(radio*radio);
        return area;
    }

    public double perimetro(){
        double perimetro = Math.PI*2*radio;
        return perimetro;
    }
}
class TrianguloRectangulo {
    double base, altura, hipotenusa;
    public double area(){
        double area = (base*altura)/2;
        return area;
    }

    public double perimetro(){
        double hipotenusa = Math.sqrt((altura*altura)+(base*base));
        double perimetro = hipotenusa + base + altura;
        return perimetro;
    }

    public double hipotenusa(){
        hipotenusa = Math.sqrt((altura*altura)+(base*base));
        return hipotenusa;
    }
    public String tipoTriangulo(){
    	if(hipotenusa == altura && altura == base) return "El triángulo es un triángulo equilátero";
    	else if(hipotenusa == altura || altura == base) return "El triángulo es un triángulo isóceles";
    	else return "El triángulo es un triángulo escaleno";
    }
}
class Cuadrado {
    double lado;
    public double area(){
        double area = lado * lado;
        return area;
    }

    public double perimetro(){
        double perimetro = (4*lado);
        return perimetro;
    }
}