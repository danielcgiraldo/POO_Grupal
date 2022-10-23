package Cap3Propuesto18;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Trabajador mitrabajador = new Trabajador();

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese Código: ");
        mitrabajador.codigo = entrada.next();
        System.out.print("Ingrese Nombre(s): ");
        mitrabajador.nombres = entrada.next();
        mitrabajador.nombres += entrada.nextLine();
        System.out.print("Ingrese Horas Trabajadas: ");
        mitrabajador.horas_trabajadas = entrada.nextInt();
        System.out.print("Ingrese Precio Hora Trabajada: ");
        mitrabajador.valor_htrabajadas = entrada.nextInt();
        System.out.print("Ingrese Porcentaje de Retención : ");
        mitrabajador.rtfnt = entrada.nextInt();
        System.out.println("Código: " + mitrabajador.codigo);
        System.out.println("Nombres: " + mitrabajador.nombres);
        System.out.println("Salario Bruto: $" + mitrabajador.bruto());
        System.out.println("Salario Neto: $" + mitrabajador.neto());

    }
}

class Trabajador {
	String codigo, nombres;
	int horas_trabajadas, valor_htrabajadas, rtfnt;
	double bruto, neto;
	public double bruto() {
		bruto = horas_trabajadas*valor_htrabajadas;
		return horas_trabajadas * valor_htrabajadas;
	}
	public double neto() {
		return bruto -  (rtfnt * bruto) / 100;
	}
}