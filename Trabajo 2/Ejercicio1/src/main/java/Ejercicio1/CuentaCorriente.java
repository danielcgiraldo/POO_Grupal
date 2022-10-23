
package Ejercicio1;

public class CuentaCorriente extends Cuenta {

    float sobregiro;
    
    //constructor cuentacorriente

    public CuentaCorriente(float saldoC, float tasaAnualC) {
        super(saldoC, tasaAnualC);
        sobregiro = 0;
    }
   
    
    //metodos de clase cuentaCorriente
    public void Retirar(float cantidad) {
        float resultado = saldo - cantidad;

        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            saldo = 0;
        } else {
            super.Retirar(cantidad);
        }

    }

    public void Consignar(float cantidad) {
        float residuo = sobregiro - cantidad;

        if (sobregiro > 0) {
            if (residuo > 0) {
                sobregiro = 0;
                saldo = residuo;
            } else {                
                sobregiro = -residuo;
                saldo = 0;
            }

        } else {
            super.Consignar(cantidad);
        }

    }

    public void extractoMensual() {

        super.ExtractoMensual();
    }

    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mesual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numConsignacion + numRetiros));
        System.out.println("Valor de sobregiro = $ " + (sobregiro));
        System.out.println();
    }

}
