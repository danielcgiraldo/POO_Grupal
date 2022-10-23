
package Inmuebles;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de una casa rural con todos los atributos de todas sus clases heredadas definidos.
        Rurales casarural = new Rurales();
        casarural.IdentificadorInmobiliario = 20;
        casarural.Area = 100;
        casarural.Direccion = "Calle 55 #80-67";
        casarural.NumHabitaciones = 3;
        casarural.NumBanos = 2;
        casarural.NumPisos = 2;
        casarural.DistanciaCabecera = 200;
        casarural.Altitud = 1200;
        casarural.imprimir();
    }
}