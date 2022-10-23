
package Inmuebles;

public class Familiar extends Apartamentos {
    int Administracion;
    int ValorCompra = 2000000;
    
    public void imprimir() {
        System.out.println("==== Apartamento Familiar ====");
        super.imprimir();
        
        System.out.println("Valor Administración: " + this.Administracion);
        
        System.out.println("Precio de Venta: " + (this.Area * this.ValorCompra));
    }
}
