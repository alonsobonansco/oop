package model;

/**
 * Representa un circuito de turismo basado en paradas gastronómicas.
 * Su atributo propio es numeroDeParadas.
 */
public class RutaGastronomica extends ServicioTuristico {
    private int numeroDeParadas;

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        setNumeroDeParadas(numeroDeParadas);
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        if (numeroDeParadas < 1) {
            throw new IllegalArgumentException("La Ruta Gastronómica debe tener al menos una parada.");
        }
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Número de Paradas: " + numeroDeParadas + "\n";
    }
}
