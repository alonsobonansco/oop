package model;

public class Chofer extends Persona implements Registrable {
    private String tipoLicencia;

    public Chofer(String nombre, int edad, String tipoLicencia) {
        super(nombre, edad);
        setTipoLicencia(tipoLicencia);
    }

    /**
     * Método solicitado. Usa @Override para implementar su propia lógica.
     *
     * @return Un String con la información específica de cada clase.
     */
    @Override
    public String mostrarResumen() {
        return "Nombre: " + super.getNombre() +
                " | Edad: " + super.getEdad() +
                " | Tipo Licencia: " + tipoLicencia + "\n";
    }

    public String getTipoVehiculo() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        if (tipoLicencia == null || tipoLicencia.isBlank()) {
            throw new IllegalArgumentException("El chofer debe tener un vehículo. ");
        }
        this.tipoLicencia = tipoLicencia;
    }
}
