package model;

import util.EdadInvalidaException;

/**
 *  Representa a una persona relacionada con la Agencia como un Empleado
 *  (o Cliente para futuras versiones).
 *
 *  Aplica composición con Direccion y Contacto (en caso de que
 *  se elimine a un objeto 'persona' del sistema, no tiene sentido
 *  conservar su dirección e información de contacto).
 *
 *  Además de direccion y contacto, sus atributos son nombre y edad.
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
                   String numeroTelefono, String correoElectronico)

                   throws EdadInvalidaException {

        this.nombre = nombre;
        validadEdadPersona(edad);
        this.edad = edad;
        // ------------------
        this.direccion = new Direccion(calle, sector, ciudad);               // Composición: se crea el objeto dentro
        this.contacto = new Contacto(numeroTelefono, correoElectronico);     //  de la clase
        // ------------------
    }

    /**
     *  Método para validar la edad de la persona (considera menores de un año).
     *  Se prefiere un método específico porque o sino ocurren problemas de
     *  incialización entre clases padres e hijas al sobrescribir el método setEdad
     *  y usarlo en el constructor de una clase padre.
     *
     *  Salta antes que la excepción en Empleado.
     *
     * @param edad Edad de la persona
     * @throws EdadInvalidaException Excepción para interrumpir el flujo en caso de error
     * en ingreso de datos
     */
    private void validadEdadPersona(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa.");
        }
    }

    // Métodos getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    /**
     *  Método setter con validación avanzada para que la persona tenga una edad real.
     *
     * @param edad Edad de la persona
     */
    public void setEdad(int edad) throws EdadInvalidaException {
        validadEdadPersona(edad);
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
        return "Nombre: " + nombre + " | Edad: " + edad +
                "\nDirección: " + direccion + "\n" + contacto + "\n";
    }
}
