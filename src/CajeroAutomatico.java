/*
Clase que emula las funcionalidades de un cajero automatico.

La clase tendra una variable de instancia llamada cuentaBancariaActual de tipo CuentaBancaria

La clase tendra un costructor que tendra como parametro un String que identifica al usuario y otro string que contiene una contrasena

Como se trata de una emulacion, en lugar de conectar con la base de datos del banco para que nos devuelva la cuenta bancaria del usuario y

Esta clase tendra los siguientes metodos:

mostrarSaldo() -> mostrar por pantalla el saldo de la cuenta

ingresarDinero() ->  preguntar cuando dinero quiere ingresar en la cuenta

sacarDinero() -> Preguntar al usuario el monto  retirar

consultarUltimosMovimientos()-> Por el momento queda pendiente

salir() ->


 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CajeroAutomatico {

    CuentaBancaria cuentaBancariaActual;

    CajeroAutomatico(String usuario, String password){

        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
        cuentaBancariaActual = new CuentaBancaria("Nombre cualquiera", cantidadAleatoria);
    }

    void mostrarSaldo(){
        System.out.println("El Saldo de la cuenta es: "+ cuentaBancariaActual.obtenerSaldo());
    }

    void ingresarDinero(){
        System.out.println("Cuanto dinero quiere ingresar en la cuenta?");
        Scanner sc = new Scanner(System.in);
        double monto = sc.nextDouble();
        cuentaBancariaActual.ingresarDinero(monto);
    }

    void sacarDinero(){
        System.out.println("Cuanto dinero quiere sacar");
        Scanner sc = new Scanner(System.in);
        double monto = sc.nextDouble();
        cuentaBancariaActual.sacarDinero(monto);
    }

    void consultarUltimosMovimientos(){
        GeneradorAleatorioDeMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioDeMovimientos();
        System.out.println("Cuantos movimientos quieres consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.ObtenerMovimientos( numeroDeMovimientos, "euros" );
        mostrarMovimientos(movimientos);
    }

    void mostrarMovimientos(ArrayList<String> movimientos) {
        for (String movimiento: movimientos) {
            System.out.println(movimiento);
        }
    }

    void salir(){
        System.out.println("Gracias, vuelva pronto");
    }

}
