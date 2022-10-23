
package Ejercicio4;

public abstract class Ciclista {
    //atributos
    private int id;
    private String nombre;
    private int tiempoAcumulado;
    
    //metodo abstracto
    abstract String ImprimirTipo(String texto);
    
    //constructor
    public Ciclista(int idC, String nombreC){
        id=idC;
        nombre=nombreC;
        tiempoAcumulado= 0;
    
    }
    
    //metodo get
    protected int getId() {
        return id;
    }
    
    protected String getNombre() {
        return nombre;
    }
    
    protected int getTiempoCarrera() {
        return tiempoAcumulado;
    }
    
    //metodo set
    protected void setId(int idC){
        id = idC;   
    }
    
    protected void setNombre(String nombreC){
        nombre = nombreC;    
    }
    
    protected void setTiempoCarrera(int tiempoAcumuladoC){
        tiempoAcumulado = tiempoAcumuladoC;    
    }
    
    //metodo imprimir
    protected void Imprimir(){
        
        System.out.println("Identificador: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tiempo acumulado: " + tiempoAcumulado);
    
    }
 
}

