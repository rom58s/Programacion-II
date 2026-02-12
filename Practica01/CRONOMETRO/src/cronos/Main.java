package cronos;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int n = 100000;
        int[] numeros = new int[n];
        Random random = new Random();

        // 1. Llenar el arreglo con números aleatorios
        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(1000000);
        }

        // 2. Crear el cronómetro
        Cronometro cron = new Cronometro();

        // 3. Iniciar medición
        cron.inicia();

        // 4. Ordenar con selección
        ordenacionSeleccion(numeros);

        // 5. Detener medición
        cron.detener();

        // 6. Mostrar resultado
        System.out.println("Tiempo de ejecución (ms): " + cron.lapsoDeTiempo());
    }

    // Método de ordenación por selección
    public static void ordenacionSeleccion(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int indiceMinimo = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            // Intercambiar
            int aux = arr[i];
            arr[i] = arr[indiceMinimo];
            arr[indiceMinimo] = aux;
        }
    }
}
