
package Ejercicio1;

public class Cuenta {
    
    //Ejercicio herencia
    //Clase cuenta
    protected float saldo;
    protected int numConsignacion = 0;
    protected int numRetiros = 0;
    protected float tasaAnual; //porcentaje
    protected float comisionMensual;
    
    //constructor
    public Cuenta(float saldoC,float tasaAnualC){
        saldo = saldoC;
        tasaAnual = tasaAnualC;    
    }

    //metodos de la clase cuenta
    public void Consignar(float cantidad) {
        saldo = saldo + cantidad;
        numConsignacion = numConsignacion + 1;
    }
    
    

    public void Retirar(float cantidad) {

        if (cantidad <= saldo) {
            saldo = saldo - cantidad;
            numRetiros = numRetiros + 1;
        } else {
            System.out.println("No es posible retirar el dienro");
        }

    }

    public void CalcInteresMensual() {
        float tasamensual = tasaAnual / 12;

        float interesmensual = saldo * tasamensual;
        saldo += interesmensual;

    }

    public void ExtractoMensual() {
        saldo -= comisionMensual;
        CalcInteresMensual();

    }
    
}
