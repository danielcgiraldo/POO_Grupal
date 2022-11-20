/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author danie
 */
public class Cilindro extends Figuras {
    public double radio, altura;
    
    private double areacircunferencia() {
        return Math.PI * Math.pow(radio, 2.0);
    }
    
    public double volumen(){
        return areacircunferencia() * altura;
    }

    public double superficie(){
        return 2.0 * Math.PI * radio * altura + 2.0 * areacircunferencia();
    }
}
