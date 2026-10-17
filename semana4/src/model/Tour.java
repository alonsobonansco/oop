package model;

/**
 * Representa un tour en la agencia Llanquihue Tour con algunos datos.
 * Sus atributos son: nombreCircuito, cantidadPersonas y duracion.
 */
public class Tour {

    private String nombreCircuito;
    private int cantidadPersonas;
    private double duracion;

    public Tour(String nombreCircuito, int cantidadPersonas, double duracion) {

        setNombreCircuito(nombreCircuito);
        setCantidadPersonas(cantidadPersonas);
        setDuracion(duracion);
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }

    /**
     * Método modificador con if statement para validar que el nombre no esté vacío.
     * Lanza una excepción en caso de que esté vacío. Sino, asigna el valor que recibe.
     * Es reutilizado en el constructor.
     *
     * @param nombreCircuito El nombre del tour
     */
    public void setNombreCircuito(String nombreCircuito) {
        if (nombreCircuito == null || nombreCircuito.isBlank()) {
            throw new IllegalArgumentException("El nombre del tour no puede estar vacío.");
        } else {
            this.nombreCircuito = nombreCircuito;
        }
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        if (cantidadPersonas < 1) {
            throw new IllegalArgumentException(
                    "La cantidad de personas para un tour no puede ser menos que una."
            );
        } else {
            this.cantidadPersonas = cantidadPersonas;
        }
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        if (duracion <= 0) {
            throw new IllegalArgumentException("La duración del tour debe ser un número válido.");
        } else {
            this.duracion = duracion;
        }
    }

    @Override
    public String toString() {

        return String.format("%-30s %-10s %-10s", nombreCircuito, cantidadPersonas, duracion);
    }
}
