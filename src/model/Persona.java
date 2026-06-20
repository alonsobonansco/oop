package model;

/**
 * Representa a una persona relacionada con la Agencia como un Empleado
 * (o Cliente para futuras versiones).
 * <p>
 * Aplica composición con Direccion y Contacto (en caso de que
 * se elimine a un objeto 'persona' del sistema, no tiene sentido
 * conservar su dirección e información de contacto).
 * <p>
 * Además de direccion y contacto, sus atributos son nombre y edad.
 *
 */
public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;
    // --------------------------
    private Direccion direccion;                // Integración de clases Direccion
    private Contacto contacto;                  //  y Contacto como atributos
    // --------------------------

    public Persona(String nombre, int edad,
                   String calle, String sector, String ciudad,
                   String numeroTelefono, String correoElectronico) {

        setNombre(nombre);
        setEdad(edad);
        // ------------------
        this.direccion = new Direccion(calle, sector, ciudad);               // Composición: se crea el objeto dentro
        this.contacto = new Contacto(numeroTelefono, correoElectronico);     //  de la clase
        // ------------------
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la persona no puede estar vacío. ");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    /**
     * Método setter que lanza excepción si una persona no tiene una edad real.
     *
     * @param edad Edad de la persona
     */
    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La persona no puede tener edad negativa. ");
        }
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Nombre: " + nombre + " (" + edad + " años)" +
                "\nContacto: " + contacto + "\n" + "Dirección: " + direccion + "\n";
    }
}
