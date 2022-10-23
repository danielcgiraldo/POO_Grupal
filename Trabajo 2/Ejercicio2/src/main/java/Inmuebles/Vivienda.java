
package Inmuebles;

public class Vivienda extends Inmuebles {
    int NumHabitaciones;
    int NumBanos;
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Habitaciones: " + this.NumHabitaciones);
        System.out.println("Número de Baños: " + this.NumBanos);
    }
}
