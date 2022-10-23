
package Inmuebles;

public class Oficinas extends Locales {
    boolean Gobierno;
    int ValorCompra = 3500000;
    
    public void imprimir() {
        System.out.println("==== Oficinas ====");
        super.imprimir();
       
        if(this.Gobierno) System.out.println("Es Oficina Gubernamental: Sí");
        else System.out.println("Es Oficina Gubernamental: No");
        
        System.out.println("Precio de Venta: " + (this.Area * this.ValorCompra));
        
    }
}
