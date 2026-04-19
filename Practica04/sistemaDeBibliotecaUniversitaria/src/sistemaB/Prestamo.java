//Clase Prestamo
package sistemaB;
class Prestamo {
    private String fechaPre;
    private String fechaDev;

    private Estudiante estudiante;
    private Libro libro;

    public Prestamo(Estudiante estudiante, Libro libro) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPre = "18/04/2026";
        this.fechaDev = "25/04/2026";
    }

    public Libro getLibro() {
        return libro;
    }

    public void mostrarInfo() {
        System.out.println("|Fecha de prestamo: " + fechaPre);
        System.out.println("|Fecha de devolucion: " + fechaDev);
        System.out.println("|Usuario:");
        estudiante.mostrarInfo();
        System.out.println("|Libro: " + libro.getTitulo());
    }
}