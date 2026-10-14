package model;

import util.EdadInvalidaException;
import util.SueldoInvalidoException;

/**
 *  Representa a un empleado en la Agencia, puede tener distintas ocupaciones.
 *  Hereda de Persona sus métodos y atributos (nombre, edad, dirección y contacto).
 *
 *  Atributo propio: sueldo (que recibe el empleado)
 */
public class Empleado extends Persona {

    private double sueldo;

    public Empleado (String nombre, int edad,
                    String calle, String sector, String ciudad,
                    String numeroTelefono, String correoElectronico,
                    double sueldo)
                    // Va después de los parámetros
                    throws SueldoInvalidoException,
                           EdadInvalidaException {

        //  Palabra clave que llama al constructor de la clase padre (superclase)
        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico);
        this.setEdad(edad);
        this.setSueldo(sueldo);
    }

    public double getSueldo() {
        return sueldo;
    }
                                         //  Lanza la excepción
    public void setSueldo(double sueldo) throws SueldoInvalidoException {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        } else {
            throw new SueldoInvalidoException("El sueldo no puede ser un número negativo o cero.");

        }
    }

    /**
     *  Método que sobrescribe a setEdad() en clase Persona,
     *  agrega validación básica para ver si el empleado es mayor de edad y puede trabajar.
     *  (En esta agencia es obligatorio ser mayor de edad)
     *
     * @param edad Edad del empleado
     */
    @Override
    public void setEdad(int edad) throws EdadInvalidaException {
        if (edad >= 18) {
            super.setEdad(edad);
        } else {
            throw new EdadInvalidaException("Un empleado no puede ser menor de edad");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado en la Agencia. Sueldo: " + sueldo + "\n";
    }
}
