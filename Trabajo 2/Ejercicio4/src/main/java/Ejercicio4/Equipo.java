
package Ejercicio4;

import java.util.Vector;

public class Equipo {
     //atributos
    private String nombreEquipo;
    private static int totalCarrera;
    private String pais;
    
    Vector integrantes;
    
    //constructor
    public Equipo(String nombreE, String paisE){       
        nombreEquipo=nombreE;
        pais=paisE;   
        
        integrantes = new Vector();
    } 

    //metodos get
    protected String getNombre() {
        return nombreEquipo;
    }

    protected int getTotalCarrera() {
        return totalCarrera;
    }

    protected String getPais() {
        return pais;
    }
   

    //metodos set
    
    protected void setNombre(String nombreE){
        nombreEquipo = nombreE;
    
    }
    protected void setTotalCarrera(int total){
        totalCarrera = total;
    
    }
    protected void setPais(String paisE){
        pais=paisE;
    
    }
    
    //metodos
     protected void Imprimir() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("Total tiempo de carrera: " + totalCarrera);
        System.out.println("Pais del quipo: " + pais);

    }
     
     protected void Añadir(Ciclista C) {
         integrantes.add(C);
    }
     
     protected void CalcularTotalTiempo(){
         for (int i=0;i<integrantes.size();i++){
             Ciclista C =(Ciclista) integrantes.elementAt(i);
             totalCarrera=totalCarrera + C.getTiempoCarrera();
         }
     
     }
     
     protected void ListaNombres(){
         for (int i=0;i<integrantes.size();i++){
             Ciclista C =(Ciclista) integrantes.elementAt(i);
             System.out.println(C.getNombre());        
         }
    
     }
     
     protected void identificar(int idC){
     
     }
    
}
