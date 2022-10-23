
package Inmuebles;

public class Inmuebles {
    int IdentificadorInmobiliario, Area;
    String Direccion;
    
    protected void imprimir() {
        System.out.println("Identificador Inmobiliario: " + this.IdentificadorInmobiliario);
        System.out.println("Área: " + this.Area);
        System.out.println("Dirección: " + this.IdentificadorInmobiliario);
    }
}
