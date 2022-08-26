
//Programa que emula la interfaz de un cajero automatico.
//El programa presentara las siguientes funciones.

/*
    Elije una de las siguientes opciones:
        Escriba 1 para consultar saldo.
        Escriba 2 para ingresar dinero
        Escriba 3 para sacar dinero
        Escriba 4 para consultar sus ultimos moviientos

        Presionar enter para ingresar su opcion elegida.
        una vez ha elegido la opcion, el programa le momstrara por pantalla el numero elegido.
 */

/*
Segunda parte
 */

import java.util.Scanner;

public class interfaz {

    public static void main(String[] args) {
        int opcion;
        System.out.println("Hola, bienvenido a Mi Banquito");
        System.out.println("Ingresa tu usuario:");
        Scanner scanner = new Scanner(System.in);
        String usuario = scanner.nextLine();
        System.out.println("Introduce tu password");
        String password = scanner.nextLine();

        CajeroAutomatico cajero = new CajeroAutomatico(usuario, password);

        System.out.println("Elige una opcion de las siguientes:");
        do {
            System.out.println(
                    " 1.- Consulta de saldo\n" +
                            " 2.- Deposito\n" +
                            " 3.- Retiro\n" +
                            " 4.- Consulta tus movimientos\n" +
                            " 5.- Escribe cualquier otro numero para salir\n"
            );

            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cajero.mostrarSaldo();
                    break;
                case 2:
                    cajero.ingresarDinero();
                    break;
                case 3:
                    cajero.sacarDinero();
                    break;
                case 4:
                    cajero.consultarUltimosMovimientos();
                    break;
            }

        } while (opcion > 0 && opcion < 5);

        cajero.salir();
    }
}
