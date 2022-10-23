
package Inmuebles;

public class Independiente extends Urbanas {
    int ValorCompra = 3000000;
    
    public void imprimir() {
        System.out.println("==== Casa Independiente ====");
        System.out.println("Identificador Inmobiliario: " + this.IdentificadorInmobiliario);
        System.out.println("Área: " + this.Area);
        System.out.println("Dirección: " + this.IdentificadorInmobiliario);
        System.out.println("Número de Habitaciones: " + this.NumHabitaciones);
        System.out.println("Número de Baños: " + this.NumBanos);
        System.out.println("Número de Pisos: " + this.NumPisos);
        
        System.out.println("Precio de Venta: " + (this.Area * this.ValorCompra));
    }
}
