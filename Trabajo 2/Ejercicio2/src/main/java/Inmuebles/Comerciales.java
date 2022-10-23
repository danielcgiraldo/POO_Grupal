package Inmuebles;

public class Comerciales extends Locales {
    String CentroComercial;
    int ValorCompra = 3000000;
    
    public void imprimir() {
        System.out.println("==== Locales Comerciales ====");
        super.imprimir();
        
        System.out.println("Centro Comercial: " + this.CentroComercial);
        
        System.out.println("Precio de Venta: " + (this.Area * this.ValorCompra));
        
    }
}
