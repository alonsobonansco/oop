package model;

// Palabra clave abstract: en una clase, no permite instanciar objetos de su tipo.
// Ej: ServicioTuristico st = new ServicioTuristico("Nombre", duracion); arroja error.

/**
 * Representa la clase genérica de servicios turísticos (superclase) que se ofrecen
 * en la agencia de turismo Llanquihue Tour.
 */
public abstract class ServicioTuristico {
    private String nombre;
    private double duracionHoras;

    public ServicioTuristico(String nombre, double duracionHoras) {
        setNombre(nombre);
        setDuracionHoras(duracionHoras);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del servicio no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(double duracionHoras) {
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException(
                    "La duración del servicio no puede ser menor o igual a cero horas.");
        }
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return nombre + " | Duración (h): " + duracionHoras;
    }
}
