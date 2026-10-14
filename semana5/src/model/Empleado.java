package model;

/**
 * Representa a un empleado en la Agencia, puede tener distintas ocupaciones.
 * Hereda de Persona sus métodos y atributos (nombre, edad, dirección y contacto).
 * <p>
 * Atributo propio: sueldo (que recibe el empleado)
 */
public class Empleado extends Persona {
    private double sueldo;

    public Empleado(String nombre, int edad,
                    String calle, String sector, String ciudad,
                    String numeroTelefono, String correoElectronico,
                    double sueldo) {
        //  Palabra clave que llama al constructor de la clase padre (superclase)
        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico);
        validarEdadEmpleado(edad);
        setSueldo(sueldo);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo <= 0) {
            throw new IllegalArgumentException("El sueldo no puede ser negativo o cero. ");
        }
        this.sueldo = sueldo;
    }

    /**
     * Método que valida si el empleado es mayor de edad y puede trabajar.
     * (En esta agencia es obligatorio ser mayor de edad). Es private
     * porque "solo sirve como filtro del constructor".
     *
     * @param edad Edad del empleado
     */
    private void validarEdadEmpleado(int edad) {
        if (edad < 18) {
            throw new IllegalArgumentException("Un empleado no puede ser menor de edad. ");
        }
    }

   /* @Override
    public String toString() {

        String textoSueldo = String.format("Empleado en la Agencia. Sueldo: $%,.0f%n", sueldo);
        return super.toString() + textoSueldo.replace(",", ".");
    }*/
}
