package est1;
import java.util.Scanner;
import java.util.Locale;

public class EstadisticaModular {

    public static double promedio(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public static double desviacion(double[] numeros) {
        double prom = promedio(numeros);
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - prom, 2);
        }

        return Math.sqrt(suma / (numeros.length - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        double[] numeros = new double[10];

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }

        double prom = promedio(numeros);
        double desv = desviacion(numeros);

        System.out.println("El promedio es: " + prom);
        System.out.println("La desviacion estandar es: " + desv);

        sc.close();
    }
}
