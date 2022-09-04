package Cap4Resuelto10;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese número de inscripción: ");
		int NI = entrada.nextInt();
		System.out.print("Ingrese su nombre: ");
		String NOM = entrada.next();
		System.out.print("Ingrese su patrimonio: ");
		double PAT = entrada.nextDouble();
		System.out.print("Ingrese su estrato social: ");
		double EST = entrada.nextDouble();
        
		double PAGMAT = 50000;
		System.out.println("No. INSCRIPCION: " + NI);
		System.out.println("NOMBRE DEL ESTUDIANTE: "+ NOM);
		if ((PAT > 2000000) && (EST > 3)) PAGMAT = (PAT * 0.03) + (PAGMAT);
		System.out.println("PAGO MATRICULA: $"+ PAGMAT);
		}
}