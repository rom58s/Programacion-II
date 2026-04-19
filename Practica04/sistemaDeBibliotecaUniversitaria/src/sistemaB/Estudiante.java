//Clase Estudiante
package sistemaB;

class Estudiante {
    private int codiEs;
    private String nomE;

    public Estudiante(int codiEs, String nomE) {
        this.codiEs = codiEs;
        this.nomE = nomE;
    }

    public void mostrarInfo() {
        System.out.println("|Codigo: " + codiEs + " |Nombre: " + nomE);
    }
}
