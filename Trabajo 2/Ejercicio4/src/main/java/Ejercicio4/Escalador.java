
package Ejercicio4;

public class Escalador extends Ciclista{
    private float aceleracionProm;
    private float rampa;
    
    //constructor
    public Escalador(int idC, String nombreC,float aceleracionC,float rampaC){
        super(idC,nombreC);
        aceleracionProm = aceleracionC;
        rampa = rampaC;
    
    }
    
    //metodo get
    protected float getAceleracion() {
        return aceleracionProm;
    }
    
    protected float getRampa() {
        return rampa;
    }
    
    //metodo set
    protected void setAceleracion(float aceleracionC){
        aceleracionProm = aceleracionC;   
    }
    
    protected void setRampa(float rampaC){
        rampa = rampaC;    
    }
    
    protected void Imprimir(){
        super.Imprimir();
        System.out.println("Aceleracion promedio subida: " + aceleracionProm );
        System.out.println("Rampa: " + rampa);    
    }
    
    protected String imprimirTipo(){
        return "Es Escalador";
    
    }

    @Override
    String ImprimirTipo(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

