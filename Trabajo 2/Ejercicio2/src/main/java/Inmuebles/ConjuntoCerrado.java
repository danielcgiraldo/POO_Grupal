
package Inmuebles;

public class ConjuntoCerrado extends Urbanas {
    int Administracion;
    boolean Piscina;
    boolean CampoDeportivo;
    int ValorCompra = 2500000;
    
    public void imprimir() {
        System.out.println("==== Casa Conjunto Cerrado ====");
        super.imprimir();
        
        System.out.println("Valor Administración: " + this.Administracion);
        if(this.Piscina) System.out.println("Piscina: Sí");
        else System.out.println("Piscina: No");
        if(this.CampoDeportivo) System.out.println("Campo Deportivo: Sí");
        else System.out.println("Campo Deportivo: No");
        
        System.out.println("Precio de Venta: " + (this.Area * this.ValorCompra));
    }
}
