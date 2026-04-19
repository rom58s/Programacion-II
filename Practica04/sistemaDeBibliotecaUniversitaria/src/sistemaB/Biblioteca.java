//Clase Biblioteca
package sistemaB;
import java.util.ArrayList;

class Biblioteca {
    private String nomB;
    private ArrayList<Libro> librosDis;
    private ArrayList<Autor> autoresReg;
    private ArrayList<Prestamo> prestamosAct;
    private Horario horario;

    //Clase Horario
    class Horario {
        private String dias;
        private String horaAp;
        private String horaCi;

        public Horario(String dias, String horaAp, String horaCi) {
            this.dias = dias;
            this.horaAp = horaAp;
            this.horaCi = horaCi;
        }

        public void mostrarHorario() {
            System.out.println("\nHorario:");
            System.out.println(dias + " | " + horaAp + " - " + horaCi);
        }
    }

    public Biblioteca(String nomB) {
        this.nomB = nomB;
        this.librosDis = new ArrayList<>();
        this.autoresReg = new ArrayList<>();
        this.prestamosAct = new ArrayList<>();
        this.horario = new Horario("Lunes-Viernes", "08:00", "20:00");
    }

    public void agregarLibro(Libro libro) {
        if (!librosDis.contains(libro)) {
            librosDis.add(libro);
        }
    }

    public void agregarAutor(Autor autor) {
        if (!autoresReg.contains(autor)) {
            autoresReg.add(autor);
        }
    }

    public void prestarLibro(Estudiante estudiante, Libro libro) {

        if (!librosDis.contains(libro)) {
            System.out.println("Libro no pertenece a la biblioteca");
            return;
        }

        for (Prestamo p : prestamosAct) {
            if (p.getLibro().equals(libro)) {
                System.out.println("Libro ya prestado");
                return;
            }
        }

        prestamosAct.add(new Prestamo(estudiante, libro));
        System.out.println("Prestamo realizado");
    }

    public void mostrarEstado() {
        System.out.println("\n=== Biblioteca: " + nomB + " ===");

        horario.mostrarHorario();

        System.out.println("\nAutores:");
        for (Autor a : autoresReg) {
            a.mostrarInfo();
        }

        System.out.println("\nPrestamos:");
        for (Prestamo p : prestamosAct) {
        	System.out.println(" ");
            p.mostrarInfo();
        }

        
        System.out.println("\nLibros Disponibles:");

        boolean hayDisponibles = false;

        for (Libro l : librosDis) {

            boolean prestado = false;

            for (Prestamo p : prestamosAct) {
                if (p.getLibro().equals(l)) {
                    prestado = true;
                    break;
                }
            }

            if (!prestado) {
                System.out.println(l.getTitulo() + " - " + l.getIsbn());
                hayDisponibles = true;
            }
        }

        // si ninguno quedó disponible
        if (!hayDisponibles) {
            System.out.println("No hay libros disponibles");
        }
        
    }

    public void cerrarBiblioteca() {
    	System.out.println("\n===================");
        System.out.println("Biblioteca cerrada");
        prestamosAct.clear();
    }
}