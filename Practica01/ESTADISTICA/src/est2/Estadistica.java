package est2;

import java.util.Scanner;
import java.util.Locale;

class Estadistica {

    private double[] numeros = new double[10];

    public void leerDatos() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
    }

    public double promedio() {
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        return suma / numeros.length;
    }

    public double desviacion() {
        double prom = promedio();
        double suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - prom, 2);
        }

        return Math.sqrt(suma / (numeros.length - 1));
    }
}


