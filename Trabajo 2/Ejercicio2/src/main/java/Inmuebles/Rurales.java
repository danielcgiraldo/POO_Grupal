
package Inmuebles;

public class Rurales extends Casas {
    int DistanciaCabecera;
    int Altitud;
    int ValorCompra = 1500000;
    
    public void imprimir() {
        System.out.println("==== Casa Rural ====");
        super.imprimir();
        System.out.println("Distancia de la Cabecera Municipal: " + this.DistanciaCabecera);
        System.out.println("Altitud: " + this.Altitud);
        System.out.println("Precio de Venta: " + (this.Area * this.ValorCompra));
    }
}
