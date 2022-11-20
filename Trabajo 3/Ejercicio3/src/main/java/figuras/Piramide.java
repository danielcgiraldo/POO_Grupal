/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author danie
 */
public class Piramide extends Figuras {
    public double base, altura, apotema;
    public double volumen(){
        return (Math.pow(base, 2.0) * altura) / 3.0;
    }

    public double superficie(){
        return Math.pow(base, 2.0) + 2.0 * base * apotema;
    }
}
