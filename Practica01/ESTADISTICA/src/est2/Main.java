package est2;

public class Main {

    public static void main(String[] args) {

        Estadistica e = new Estadistica();

        e.leerDatos();

        System.out.println("El promedio es: " + e.promedio());
        System.out.println("La desviacion estandar es: " + e.desviacion());
    }
}
