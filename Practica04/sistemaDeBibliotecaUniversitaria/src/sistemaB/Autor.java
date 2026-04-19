//Clase Autor
package sistemaB;

class Autor {
    private String nom;
    private String nacionalidad;

    public Autor(String nom, String nacionalidad) {
        this.nom = nom;
        this.nacionalidad = nacionalidad;
    }

    public void mostrarInfo() {
        System.out.println(" |Nombre: " + nom + " |Nacionalidad: " + nacionalidad);
    }
}
