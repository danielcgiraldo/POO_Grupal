package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa tipo de cuenta");
        System.out.println("ingresa 1 : cuenta de ahorros");
        System.out.println("ingresa 2 : cuenta corriente");
        int tipoCuenta = input.nextInt();

        if (tipoCuenta == 1) {
            System.out.println("Cuenta de ahorros");
            System.out.println("Ingrese saldo inicial= $");
            float saldoInicialAhorros = input.nextFloat();
            System.out.print("Ingrese tasa de interés= ");
            float tasaAhorros = input.nextFloat();
            
            CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
            
            System.out.print("Ingresar cantidad a consignar: $");
            float cantidadDepositar = input.nextFloat();
            cuenta1.Consignar(cantidadDepositar);
            
            System.out.print("Ingresar cantidad a retirar: $");
            float cantidadRetirar = input.nextFloat();
            cuenta1.Retirar(cantidadRetirar);
            cuenta1.extractoMensual();
            cuenta1.imprimir();
        
        }else{
            System.out.println("Cuenta corriente");
            System.out.println("Ingrese saldo inicial= $");
            float saldoInicialAhorros = input.nextFloat();
            System.out.print("Ingrese tasa de interés= ");
            float tasaAhorros = input.nextFloat();
            
            CuentaCorriente cuenta1 = new CuentaCorriente(saldoInicialAhorros, tasaAhorros);
            
            System.out.print("Ingresar cantidad a consignar: $");
            float cantidadDepositar = input.nextFloat();
            cuenta1.Consignar(cantidadDepositar);
            
            System.out.print("Ingresar cantidad a retirar: $");
            float cantidadRetirar = input.nextFloat();
            cuenta1.Retirar(cantidadRetirar);
            cuenta1.extractoMensual();
            cuenta1.imprimir();      
        
        }
    }
}
