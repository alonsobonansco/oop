package model;

import util.CapacidadMaximaInvalidaException;
import util.EdadInvalidaException;
import util.SueldoInvalidoException;

/**
 *  Representa a un transportista de la Agencia que lleva pasajeros
 *  de un lugar a otro.
 *
 *  Sus atributos propios son vehiculo (para transportar gente) y
 *  capacidadMaxima (de su vehículo).
 */
public class Transportista extends Empleado {

    private String vehiculo;
    private int capacidadMaxima;

    public Transportista(String nombre, int edad,
                         String calle, String sector, String ciudad,
                         String numeroTelefono, String correoElectronico,
                         double sueldo,
                         String vehiculo, int capacidadMaxima)

                         //  Las clases hijas también deben lanzar la excepción
                         //  Y la segunda excepción va separada por coma
                         throws SueldoInvalidoException,
                                CapacidadMaximaInvalidaException,
                                EdadInvalidaException {

        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico, sueldo);
        this.vehiculo = vehiculo;
        this.setCapacidadMaxima(capacidadMaxima);
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

                                                        //  Aquí se lanza nuevamente!!
    public void setCapacidadMaxima(int capacidadMaxima) throws CapacidadMaximaInvalidaException {
        if (capacidadMaxima > 0) {
            this.capacidadMaxima = capacidadMaxima;
        } else {
            throw new CapacidadMaximaInvalidaException(
                    "El tranportista debe tener un vehículo con capacidad de llevar a un pasajero."
            );

        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ocupación: Transportista\nVehículo: " + vehiculo +
                " | Capacidad máxima: " + capacidadMaxima + "\n\n";
    }
}
