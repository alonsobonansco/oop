package model;

/**
 * Representa a un transportista de la Agencia que lleva pasajeros
 * de un lugar a otro.
 * <p>
 * Sus atributos propios son vehiculo (tipo) y
 * capacidadMaxima (de su vehículo).
 */
public class Transportista extends Empleado {

    private String vehiculo;
    private int capacidadMaxima;

    public Transportista(String nombre, int edad,
                         String calle, String sector, String ciudad,
                         String numeroTelefono, String correoElectronico,
                         double sueldo,
                         String vehiculo, int capacidadMaxima) {

        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico, sueldo);
        setVehiculo(vehiculo);
        setCapacidadMaxima(capacidadMaxima);
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        if (vehiculo == null || vehiculo.isBlank()) {
            throw new IllegalArgumentException("Faltan los datos del vehículo. ");
        }
        this.vehiculo = vehiculo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima < 1) {
            throw new IllegalArgumentException(
                    "El transportista debe tener un vehículo con capacidad para llevar a una persona. "
            );
        }
        this.capacidadMaxima = capacidadMaxima;

    }

    @Override
    public String toString() {
        return super.toString() +
                "Transportista: Vehículo: " + vehiculo +
                " | Capacidad máxima: " + capacidadMaxima + "\n\n";
    }
}
