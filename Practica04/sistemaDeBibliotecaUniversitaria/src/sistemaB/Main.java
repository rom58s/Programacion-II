//Main
package sistemaB;

public class Main {
    public static void main(String[] args) {

        // CREAR AUTORES (AGREGACIÓN)
        Autor a1 = new Autor("Gabriel Garcia Marquez", "Colombiano");
        Autor a2 = new Autor("Mario Vargas Llosa", "Peruano");

        // CREAR LIBROS (COMPOSICIÓN)
        Libro l1 = new Libro("Cien años de soledad", "ISBN-001");
        l1.agregarPagina(1, "Muchos años despues...");
        l1.agregarPagina(2, "El coronel Aureliano...");

        Libro l2 = new Libro("La ciudad y los perros", "ISBN-002");
        l2.agregarPagina(1, "En el colegio militar...");
        l2.agregarPagina(2, "Los jovenes cadetes...");

        // CREAR ESTUDIANTES
        Estudiante e1 = new Estudiante(101, "Mateo");
        Estudiante e2 = new Estudiante(102, "Carlos");

        // CREAR BIBLIOTECA (TODO)
        Biblioteca biblio = new Biblioteca("Biblioteca UMSA");

        // AGREGACIÓN
        biblio.agregarAutor(a1);
        biblio.agregarAutor(a2);

        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);

        // ASOCIACIÓN (PRÉSTAMOS)
        biblio.prestarLibro(e1, l1);
        biblio.prestarLibro(e2, l2);

        // Intento de error (para demostrar validación)
        biblio.prestarLibro(e1, l1);

        // MOSTRAR ESTADO COMPLETO
        biblio.mostrarEstado();

        // DEMOSTRAR COMPOSICIÓN (Libro-Página)
        System.out.println("\n=== LEYENDO LIBRO ===");
        l1.leer();

        // CERRAR BIBLIOTECA
        biblio.cerrarBiblioteca();

        // Verificar que ya no hay préstamos
        biblio.mostrarEstado();
    }
}
