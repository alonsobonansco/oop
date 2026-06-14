package data;

import model.Tour;
import util.LineaInvalidaException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GestorDatos {

    // static: pertenece a la clase en sí y no a los objetos que se crean de ella
    public static ArrayList<Tour> leerDatos() {

        ArrayList<Tour> datosTour = new ArrayList<>();

        try (InputStream inputStream = GestorDatos.class.getResourceAsStream("/tours.txt")) {

            if (inputStream == null) {
                System.err.println("Error. No se encontró tours.txt");

                //  En caso de que no exista, 'retorna' una lista vacía y CORTA el proceso
                return datosTour;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

                String linea;
                int contadorLineas = 0;

                while((linea = reader.readLine()) != null) {

                    contadorLineas++;
                    //  Se salta las líneas en blanco
                    if (linea.trim().isEmpty()) continue;

                    String[] partes = linea.split(";");

                    //  Si hay un error en el formato guardado lanza una excepción
                    if (partes.length != 3) {
                        throw new LineaInvalidaException(
                                "Error de formato en el archivo (línea " + contadorLineas +
                                        ": " + linea + ")"
                        );

                    }

                    String nombreCircuito = (partes[0]);
                    int cantidadPersonas = Integer.parseInt(partes[1]);
                    double duracion = Double.parseDouble(partes[2]);

                    Tour nuevoTour = new Tour(nombreCircuito,cantidadPersonas,duracion);
                    datosTour.add(nuevoTour);
                }

                //  Redundante o por extra precaución?
                reader.close();

                    //  La barra " | " permite agrupar distintas excepciones
                    //  A veces es bueno ponerlos en bloques individuales
                    //   para que el mensaje 'Error:' sea más personalizado
        } } catch (IOException | NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return datosTour;


    }

}
