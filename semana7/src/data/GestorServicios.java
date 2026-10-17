package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de crear los objetos, añadirlos a una lista, recorrerla y llamar
 * al método mostrarInformacion() de cada subclase.
 * ServicioTuristico se puede instanciar como cualquiera de sus subclases (pero no a sí misma
 * porque es abstract).
 */
public class GestorServicios {
    // final porque "se inicializa una sola vez y nunca se va a reemplazar por una lista nueva"
    private final List<ServicioTuristico> listaServicios;

    public GestorServicios() {
        this.listaServicios = new ArrayList<>();
    }

    /**
     * Método que crea objetos de las subclases de ServicioTuristico y los añade
     * a una lista.
     */
    public void crearListaServicios() {
        listaServicios.add(new RutaGastronomica(
                "Ruta de la repostería Alemana", 3, 4));
        listaServicios.add(new RutaGastronomica(
                "Ruta de las Cecinas", 2.5, 3));
        listaServicios.add(new PaseoLacustre(
                "Vuelta al lago Llanquihue", 6, "Catamarán"));
        listaServicios.add(new PaseoLacustre(
                "Circuito libre en Kayak", 1.5, "Kayak"));
        listaServicios.add(new ExcursionCultural(
                "Monumento Histórico Nacional", 2, "Casa Werner Raddatz"));
        listaServicios.add(new ExcursionCultural(
                "Chalet Histórico", 1.5, "Casa Schöbitz"));
    }

    /**
     * Método que recorre todos los objetos de la lista ServicioTuristico.
     * Diferencia automáticamente qué objeto subclase es y llama a su método
     * mostrarInformacion().
     */
    public void recorrerServicios() {
        for (ServicioTuristico st : listaServicios) {
            st.mostrarInformacion();
        }

        // Forma alternativa desde Java 8
        // listaServicios.forEach(ServicioTuristico::mostrarInformacion);
    }
}
