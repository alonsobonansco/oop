package model;

/**
 * Interfaz en común que distintas clases pueden implementar.
 */
public interface Registrable {
    // si no se pone public, Java lo asume
    String mostrarResumen();
}
