/*
Pedir la cantidad en Euros y devolver la conversion en US
El mensaje es: $** Euros equivalen a *** US Dolares.
 */


import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        System.out.println("Ingresa los Euros a convertir");
        Scanner sc = new Scanner(System.in);
        double euros = sc.nextInt();
        double tc = 1.09f;
        double result = euros * tc;

        System.out.println("$ "+euros+" Euros equivalen a $"+result+" US Dolares");

        //usamos double para usar como ejemplo en el caso de los decimales en exceso.

        String eurosString = Double.toString(euros);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
        double tasaDeCambio = 1.09;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);

        BigDecimal dolaresBiDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

        System.out.println(" resultado con BigDecimal: "+ dolaresBiDecimal);

    }
}
