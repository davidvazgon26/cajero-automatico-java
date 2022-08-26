

public class CuentaBancaria {

    String titular;
    TipoDeCuenta tipoDeCuenta;
    double saldo;
    String otroDato;

    //Constantes
    final double COMISION = 1.2;


    //Constructores

    CuentaBancaria(String titular, TipoDeCuenta tipoCuenta, double saldo){
        this.titular = titular;
        this.tipoDeCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    CuentaBancaria(){
        tipoDeCuenta = TipoDeCuenta.AHORRO;
    }
    CuentaBancaria(String titular, double saldo){
        this.titular = titular;
        tipoDeCuenta = TipoDeCuenta.AHORRO;
        this.saldo = saldo;
    }

    void sacarDinero(double cantidad){
        if (cantidad<0) return;
        double comision = calcularComision();
       // if (tipoDeCuenta.equals(TipoDeCuenta.AHORRO)) comision = COMISION; // Lo movemos a un metodo para hacerlo reutilizable
        saldo -= cantidad;
        saldo -= comision;
    }

    double calcularComision(){
        switch (tipoDeCuenta){
            case AHORRO:
                return COMISION;
            case NOMINA:
                return 0;
            default:
                return 0;
        }
    }

    void ingresarDinero(double cantidad){
        if (cantidad<0) return;
        saldo += cantidad;
    }

    void cambiarTipoDeCuenta(TipoDeCuenta nuevoTipo){
        tipoDeCuenta = nuevoTipo;
    }

    double obtenerSaldo(){
        return saldo;
    }
}
