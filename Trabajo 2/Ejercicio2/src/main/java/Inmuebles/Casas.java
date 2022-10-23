package Inmuebles;

public class Casas extends Vivienda {
    int NumPisos;
    
    public void imprimir() {
        super.imprimir();
        System.out.println("Número de Pisos: " + this.NumPisos);

    }
}
