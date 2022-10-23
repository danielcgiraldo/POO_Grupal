
package Ejercicio1;

public class CuentaAhorros extends Cuenta{

    private boolean activa;

    public CuentaAhorros(float saldoC, float tasaC) {
        super(saldoC, tasaC);
        if (saldoC < 10000) {
            activa = false;
        } else {
            activa = true;
        }

    }

    //metodos de clase cuentaAhorros
    public void Consignar(float cantidad) {
        if (activa == true) {
            super.Consignar(cantidad);
        } else {
            System.out.println("Cuenta inactiva");
        }

    }

    public void Retirar(float cantidad) {
        if (activa) {
            super.Retirar(cantidad);
        } else {
            System.out.println("Cuenta inactiva");
        }

    }

    public void extractoMensual() {

        if (saldo < 10000) {
            activa = false;
            System.out.println("Cuenta inactiva");
        } else {
            if (numRetiros > 4) {
                comisionMensual += (numRetiros - 4) * 1000;
            }
            super.ExtractoMensual();

        }

    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numConsignacion + numRetiros));
        System.out.println();
    }

}
