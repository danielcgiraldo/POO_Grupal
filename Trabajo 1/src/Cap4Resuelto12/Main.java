package Cap4Resuelto12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese nombre del trabajador: ");
        String NOM = entrada.next();
        NOM += entrada.nextLine();

        System.out.print("Ingrese numero de horas trabajadas: ");
        int NHT = entrada.nextInt();

        System.out.print("Ingrese valor de hora de trabajo: ");
        double VHN = entrada.nextDouble();

        double salario;

        if (NHT > 40){
            int HET = NHT - 40;
            if (HET > 8){
                int HEE8 = HET - 8;
                double PPHX = VHN * 2 * 8 + VHN * 3 * HEE8;
                salario = 40 * VHN + PPHX;
            }
            else{
                double PPHX = VHN * 2 * HET;
                salario = VHN * 40 + PPHX;
            }
            System.out.printf("El trabajador " + NOM + " devengo: $" + salario);
        }
        else{
            salario = VHN * NHT;
            System.out.printf("El trabajador " + NOM + " devengo: $" + salario);
        }
    }

}