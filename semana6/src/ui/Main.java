package ui;

import data.GestorServicios;

/**
 * Punto de entrada de la aplicación. Llama a GestorServicios
 * y luego a sus métodos.
 *
 * @author Alonso Bonansco
 * @version 1.1.0
 * @since Semana 6
 */
public class Main {
    public static void main(String[] args) {
        GestorServicios gestorServicios = new GestorServicios();
        gestorServicios.crearTours();
        System.out.println(gestorServicios.mostrarTours());
    }
}
