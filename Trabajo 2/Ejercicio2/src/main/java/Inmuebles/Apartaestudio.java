
package Inmuebles;

public class Apartaestudio extends Apartamentos {
    int NumHabitaciones = 1;
    int ValorCompra = 1500000;
    
    public void imprimir() {
        System.out.println("==== Apartaestudio ====");
        super.imprimir();
        
        System.out.println("Precio de Venta: " + (this.Area * this.ValorCompra));
    }
}
