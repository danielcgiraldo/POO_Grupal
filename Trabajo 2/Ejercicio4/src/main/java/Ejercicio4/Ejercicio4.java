
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
        
       /* System.out.println("Ingresa integrantes de tu equipo!");
        System.out.println("Ingresa 1 : Velocista");
        System.out.println("Ingresa 2 : Escalador");
        System.out.println("Ingresa 3 : Contrarelojista");
        int tipoC = input.nextInt();
        */
        
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320, 25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        ContraReloj contrarrelojista1 = new ContraReloj(123981, "Jonathan Castroviejo", 120);
        equipo1.Añadir(velocista1);
        equipo1.Añadir(escalador1);
        equipo1.Añadir(contrarrelojista1);
        velocista1.setTiempoCarrera(365);
        escalador1.setTiempoCarrera(385);
        //ContraReloj.setTiempoCarrera(370); 
        equipo1.CalcularTotalTiempo();
        equipo1.Imprimir();
        equipo1.ListaNombres();

    
    }
}
