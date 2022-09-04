package Cap4Resuelto14;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("VENTAS DPTO 1: ");
        double VD1 = entrada.nextDouble();
        System.out.print("VENTAS DPTO 2: ");
        double VD2 = entrada.nextDouble();
        System.out.print("VENTAS DPTO 3: ");
        double VD3 = entrada.nextDouble();
        System.out.print("SALARIO GENERAL: ");
        double SAL = entrada.nextDouble();
        double SAL1=SAL, SAL2=SAL, SAL3=SAL;
        double TOTVEN = (VD1 + VD2 + VD3);
        double PORVEN = (0.33 * TOTVEN);
        if (VD1 > PORVEN) {
            SAL1 = SAL + 0.2 * SAL;
        }
        if (VD2 > PORVEN) {
            SAL2 = SAL + 0.2 * SAL;
        }
        if (VD3 > PORVEN) {
            SAL3 = SAL + 0.2 * SAL;
        }
        System.out.println("SALARIO DPTO 1: $"+ SAL1);
        System.out.println("SALARIO DPTO 2: $"+ SAL2);
        System.out.println("SALARIO DPTO 3: $"+ SAL3);


    }
}