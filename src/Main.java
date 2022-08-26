public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaDeDavid = new CuentaBancaria( "David", TipoDeCuenta.AHORRO, 23600);
//        cuentaDeDavid.titular = "David";
//        cuentaDeDavid.tipoDeCuenta = "nomina";
//        cuentaDeDavid.saldo = 26000;
//Esto lo comentamos cuando ya tenemos los constructores
        System.out.println("Saldo:" + cuentaDeDavid.saldo);

        cuentaDeDavid.sacarDinero(100);
        System.out.println("Saldo despues de sacar dinero: "+ cuentaDeDavid.saldo);

        cuentaDeDavid.ingresarDinero(1000);
        System.out.println("Saldo: "+ cuentaDeDavid.saldo);

        cuentaDeDavid.cambiarTipoDeCuenta(TipoDeCuenta.NOMINA);
        System.out.println("nuevo tipo de cuenta: " + cuentaDeDavid.tipoDeCuenta);

        System.out.println("Tu saldo es: "+ cuentaDeDavid.obtenerSaldo());
    }
}
