package model;

/**
 * Representa al dueño de la mascota.
 * Sus atributos son: nombre, teléfono, dirección.
 * Aplica composición con Direccion.
 */
public class Dueño {

    private String nombre;
    private String telefono;
    // =========================
    private Direccion direccion;        // Integración de la clase Direccion como atributo
    // =========================

    /**
     *  Constructor del Dueño
     *
     * @param nombre    Nombre del dueño
     * @param telefono  Teléfono de contacto del dueño
     * @param calle     La calle y número
     * @param ciudad    La ciudad de residencia
     * @param region    La región en número romanos
     */
    public Dueño(String nombre, String telefono, String calle, String ciudad, String region) {
        this.nombre = nombre;
        this.telefono = telefono;
        // ===========
        this.direccion = new Direccion(calle, ciudad, region);  // Composición (relación fuerte "has-a")
        // ===========
    }


    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getTelefono() {return telefono;}

    public void setTelefono(String telefono) {this.telefono = telefono;}

    public Direccion getDireccion() {return direccion;}

    public void setDireccion(Direccion direccion) {this.direccion = direccion;}


    @Override
    public String toString() {
        return "Dueño/a: " + nombre + " | Teléfono: " + telefono + " | Dirección: " + direccion + "\n";
    }
}
