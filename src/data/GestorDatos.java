package data;

import model.Tour;
import util.LineaInvalidaException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase que hace la gestión de los datos. Carga los datos del archivo txt,
 * los convierte donde sea necesario, crea un objeto tour y lo añade a una ArrayList datosTour.
 */
public class GestorDatos {

    // static: pertenece a la clase en sí y no a los objetos que se crean de ella,
    // permite no crear un objeto en el main para poder llamar al método
    public static ArrayList<Tour> leerDatos(String ruta) {

        ArrayList<Tour> datosTour = new ArrayList<>();

        try (InputStream is = GestorDatos.class.getResourceAsStream(ruta)) {

            if (is == null) {
                System.err.println("Error. No se encontró tours.txt");

                //  En caso de que no exista, 'retorna' una lista vacía y CORTA el proceso
                return datosTour;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
                //  Forma alternativa: = new BufferedReader(new FileReader("resources/tours.txt")

                String linea;
                int contadorLineas = 0;

                while ((linea = reader.readLine()) != null) {

                    contadorLineas++;
                    //  Se salta las líneas en blanco
                    if (linea.trim().isEmpty()) continue;

                    String[] partes = linea.split(";");

                    //  Si hay un error en el formato guardado lanza una excepción personalizada detallada.
                    if (partes.length != 3) {
                        throw new LineaInvalidaException(
                                "Error de formato en el archivo (línea " + contadorLineas +
                                        ": " + linea + ")"
                        );

                    }

                    String nombreCircuito = (partes[0]);
                    int cantidadPersonas = Integer.parseInt(partes[1]);
                    double duracion = Double.parseDouble(partes[2]);

                    Tour nuevoTour = new Tour(nombreCircuito, cantidadPersonas, duracion);
                    datosTour.add(nuevoTour);
                }

                //  Redundante o por extra precaución?
                reader.close(); // Cierre en cadena, BufferedReader(InputStreamReader(InputStream))
            }

            /* La barra " | " permite agrupar distintas excepciones.
               A veces es bueno ponerlos en bloques individuales
               para escribir un mensaje 'Error:' más personalizado */
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return datosTour;


    }

}
