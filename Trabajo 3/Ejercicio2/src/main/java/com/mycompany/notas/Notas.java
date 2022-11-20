package com.mycompany.notas;

public class Notas {

    public static void main(String[] args) {
        VentanaPrincipal interfaz = new VentanaPrincipal();
        interfaz.setVisible(true);
    }
    double[] listaNotas;
    public Notas() {
        listaNotas = new double[5];
    }

    double calcularPromedio() {
        
        double suma = 0;
        
        for(int i=1; i < listaNotas.length; i++) {
            suma = suma + listaNotas[i];
        }

        return (suma / listaNotas.length);
    }

    double calcularDesviación() {
        double promedio = calcularPromedio();
        double suma = 0;
        for(int i=0; i < listaNotas.length; i++) {

            suma += Math.pow(listaNotas[i] - promedio, 2 );
        }
        return Math.sqrt (suma/listaNotas.length );
    }

    double numeroMenor() {
        double menor = listaNotas[0];
        for(int i=0; i < listaNotas.length; i++) {
            if (listaNotas[i] < menor) {

                menor = listaNotas[i];
            }
        }
        return menor;
    }

    double numeroMayor() {
        double mayor = listaNotas[0];
        for(int i=0; i < listaNotas.length; i++) {
            if (listaNotas[i] > mayor) {

                mayor = listaNotas[i];
            }
        }
        return mayor;
    }
}





