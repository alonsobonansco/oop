package data;

import model.*;

/**
 * Clase encargada de crear los objetos y mostrarlos.
 * ServicioTuristico se puede instanciar como cualquiera de sus subclases (pero no a sí misma
 * porque es abstract).
 */
public class GestorServicios {
    private ServicioTuristico ruta1;
    private ServicioTuristico ruta2;
    private ServicioTuristico paseo1;
    private ServicioTuristico paseo2;
    private ServicioTuristico excursion1;
    private ServicioTuristico excursion2;

    /**
     * Método que crea los tipos de tours solicitados.
     */
    public void crearTours() {
        // Aquí el this es opcional pero es buena práctica
        this.ruta1 = new RutaGastronomica(
                "Ruta de la repostería Alemana", 3, 4);
        this.ruta2 = new RutaGastronomica(
                "Ruta de las Cecinas", 2.5, 3);

        this.paseo1 = new PaseoLacustre(
                "Vuelta al lago Llanquihue", 6, "Catamarán");
        this.paseo2 = new PaseoLacustre(
                "Circuito libre en Kayak", 1.5, "Kayak");

        this.excursion1 = new ExcursionCultural(
                "Monumento Histórico Nacional", 2, "Casa Werner Raddatz");
        this.excursion2 = new ExcursionCultural(
                "Chalet Histórico", 1.5, "Casa Schöbitz");
    }

    /**
     * Método para presentar la salida. Utiliza los toString() de cada clase (en model)
     * y los concatena y organiza por categorías.
     *
     * @return Un String con la información de todos los tours.
     */
    public String mostrarTours() {
        return "===== Servicios Turísticos de Llanquihue Tour =====\n" +
                "\n--- Rutas Gastronómicas ---\n" +
                ruta1 +
                ruta2 +
                "\n--- Paseos Lacustres ---\n" +
                paseo1 +
                paseo2 +
                "\n--- Excursiones Culturales ---\n" +
                excursion1 +
                excursion2;
    }
}
