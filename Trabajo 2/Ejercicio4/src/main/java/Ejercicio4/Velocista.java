
package Ejercicio4;

public class Velocista extends Ciclista {

    private double potenciaProm;
    private double velProm;
    
    //constructor
    public Velocista(int idC, String nombreC,double potenciaC,double velPromC){
        super(idC,nombreC);
        potenciaProm=potenciaC;
        velProm=velPromC;
    
    }

    //metodo get
    protected double getPotencia() {
        return potenciaProm;
    }

    protected double getVelocidad() {
        return velProm;
    }

    //metodo set
    protected void setPotencia(double potenciaC) {
        potenciaProm = potenciaC;
    }

    protected void setVelocidad(double velocidadC) {
        velProm = velocidadC;
    }

    //metodos
    protected void Imprimir() {
        super.Imprimir();
        System.out.println("Potencia promedio : " + potenciaProm);
        System.out.println("Velocidad promedio: " + velProm);
    }
    
    protected String imprimirTipo(){
        return "Es velocista";
    
    }

    @Override
    String ImprimirTipo(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
