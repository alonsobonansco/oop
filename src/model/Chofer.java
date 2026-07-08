package model;

public class Chofer extends Persona implements Registrable {
    private String tipoVehiculo;

    public Chofer(String nombre, int edad, String tipoVehiculo) {
        super(nombre, edad);
        setTipoVehiculo(tipoVehiculo);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Nombre: " + super.getNombre() +
                " | Edad: " + super.getEdad() +
                " | Tipo Vehículo: " + tipoVehiculo + "\n");
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        if (tipoVehiculo == null || tipoVehiculo.isBlank()) {
            throw new IllegalArgumentException("El chofer debe tener un vehículo. ");
        }
        this.tipoVehiculo = tipoVehiculo;
    }
}
