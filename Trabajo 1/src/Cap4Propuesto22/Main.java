package Cap4Propuesto22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String NOMBRE;
        double SALH, SALARIOG;
        int horas;
        System.out.print("INGRESAR NOMBRE: ");
        NOMBRE = entrada.next();
        NOMBRE += entrada.nextLine();
        
        System.out.print("SALARIO POR HORA: ");
        SALH = entrada.nextInt();
        
        System.out.print("HORAS TRABAJADAS: ");
        horas = entrada.nextInt();
        
        SALARIOG = horas * SALH;
        if (SALARIOG > 450) {
            System.out.println("NOMBRE: " + NOMBRE + " SALARIO: " + SALARIOG);
        } else {
            System.out.println("NOMBRE: " + NOMBRE);
        }

    }
}