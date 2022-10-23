
package Ejercicio4;

public class ContraReloj extends Ciclista {

    private int velMaxima;
    
    //constructor
     public ContraReloj(int idC, String nombreC,int velmaxC){
        super(idC,nombreC);
        velMaxima=velmaxC;
    
    }

    //metodo get
    protected int getVelMax() {
        return velMaxima;
    }

    //metodo set
    protected void setVelMax(int velMaxC) {
        velMaxima = velMaxC;

    }

    protected void imprimir() {
        super.Imprimir();
        System.out.println("velocidad maxima: " + velMaxima);
    }
    
    protected String imprimirTipo(){
        return "Es contrarrelojista";
    
    }

    @Override
    String ImprimirTipo(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

