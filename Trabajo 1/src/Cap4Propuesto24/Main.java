package Cap4Propuesto24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ESFERA1, ESFERA2, ESFERA3, MAYORP;
        System.out.print("Ingrese peso esfera 1: ");
        ESFERA1 = entrada.nextInt();
        
        System.out.print("Ingrese peso esfera 2: ");
        ESFERA2 = entrada.nextInt();
        
        System.out.print("Ingrese peso esfera 3: ");
        ESFERA3 = entrada.nextInt();

        if (ESFERA1 > ESFERA2 & ESFERA1 > ESFERA3) {
            MAYORP = ESFERA1;
        } else if (ESFERA2 > ESFERA3) {
            MAYORP = ESFERA2;
        } else {
            MAYORP = ESFERA3;
        }
        System.out.println("ESFERA DE MAYOR PESO: " + MAYORP);

    }
}