//Clase Libro
package sistemaB;
import java.util.ArrayList;

class Libro {
    private String titulo;
    private String isbn;
    private ArrayList<Pagina> paginas;

    //Clase Pagina
    class Pagina {
        private int numPag;
        private String contPag;

        public Pagina(int numPag, String contPag) {
            this.numPag = numPag;
            this.contPag = contPag;
        }

        public void mostrarInfo() {
            System.out.println("Pagina: " + numPag);
            System.out.println(contPag);
        }
    }

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.paginas = new ArrayList<>();
    }

    public void agregarPagina(int num, String cont) {
        paginas.add(new Pagina(num, cont));
    }

    public void leer() {
        for (Pagina p : paginas) {
            p.mostrarInfo();
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }
}