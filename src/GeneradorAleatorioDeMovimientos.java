/*


 */


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorioDeMovimientos {

    private static final String TRANSFERENCIA = "Transferencia de ";
    private static final String INGRESO = "Ingreso de ";
    private static final String RETIRADA = "Retirada de ";
    private static final String PAGO_DE_TARJETA = "Pago con tarjeta de ";
    private static final String NOMINA = "Ingreso nomina de ";
    private static final String PAGO_RECIBO = "Pago de recibo de ";


    //Metodo para general la lista aleatoria de movimientos
    ArrayList<String> ObtenerMovimientos(int numeroDeMovimientos, String moneda){
        ArrayList<String> movimientos = new ArrayList<>();

        for (int i = 0; i < numeroDeMovimientos; i++) {
            int numeroAleatorio = obtenerNumeroAleatorioDeMovimiento(1,6);

            String tipoDeMovimiento;

            switch (numeroAleatorio){
                case 1:
                    tipoDeMovimiento = TRANSFERENCIA;
                    break;
                case 2:
                    tipoDeMovimiento = INGRESO;
                    break;
                case 3:
                    tipoDeMovimiento = RETIRADA;
                    break;
                case 4:
                    tipoDeMovimiento = PAGO_DE_TARJETA;
                    break;
                case 5:
                    tipoDeMovimiento = NOMINA;
                    break;
                default:
                    tipoDeMovimiento= PAGO_RECIBO;

            }

            double cantidadAleatoria = obtenerDoubleAleatorio(1.0, 3000.0);
            String movimiento = tipoDeMovimiento + String.format("%.2f", cantidadAleatoria) + " " + moneda;
            movimientos.add(movimiento);

        }
        return movimientos;
    }

   private int obtenerNumeroAleatorioDeMovimiento(int minimo, int maximo){
        return ThreadLocalRandom.current().nextInt(minimo, maximo+1);
   }

   private double obtenerDoubleAleatorio(double minimo, double maximo){
       return ThreadLocalRandom.current().nextDouble(minimo, maximo+1.0);
   }
}
