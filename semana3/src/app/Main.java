package app;

import model.GuiaTuristico;
import model.Transportista;
import util.CapacidadMaximaInvalidaException;
import util.EdadInvalidaException;
import util.SueldoInvalidoException;

/**
 * Simula la creación de tres empleados con diversas ocupaciones y sus datos
 * dentro de una Agencia de Turismo.
 *
 * @author Alonso Bonansco
 * @version 1.0.0
 * @since Semana 3
 *
 */
public class Main {
    public static void main(String[] args) {

        try {
            Transportista transportista1 = new Transportista(
                    "José", 57,
                    "Los Carrera 123", "Los Pellines", "Llanquihue",
                    "123456789", "No aplica",
                    450000, "Van", 12
            );

            GuiaTuristico guiaTuristico1 = new GuiaTuristico(
                    "María", 45,
                    "Jorge Alessandri 456", "Frutillar alto", "Frutillar",
                    "987654321", "maria@gmail.com",
                    550000, "Teatro del Lago", "Inglés"
            );

            GuiaTuristico guiaTuristico2 = new GuiaTuristico(
                    "Ricardo", 35,
                    "Ruta V-695 s/n", "Ensenada", "Puerto Varas",
                    "321987456", "ricardo@gmail.com",
                    800000, "Trekking volcán Osorno", "Alemán"
            );

            System.out.println(transportista1);
            System.out.println(guiaTuristico1);
            System.out.println(guiaTuristico2);

        } catch (SueldoInvalidoException |
                 CapacidadMaximaInvalidaException |
                 EdadInvalidaException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }
}