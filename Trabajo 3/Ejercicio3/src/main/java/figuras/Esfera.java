/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author danie
 */
public class Esfera extends Figuras {
    public double radio;
    public double volumen(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3.0);
    }

    public double superficie(){
        return 4.0 * Math.PI * Math.pow(radio, 2.0);
    }
}
