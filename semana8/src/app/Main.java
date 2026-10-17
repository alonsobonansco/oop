package app;

import data.GestorEntidades;
import ui.VentanaAgencia;

/**
 * Punto de entrada de la aplicación. Crea un objeto GestorEntidades y se lo
 * manda a VentanaAgencia.
 *
 * @author Alonso Bonansco
 * @version 1.0.0
 * @since Semana 8
 */
public class Main {
    public static void main(String[] args) {
        GestorEntidades gestorEntidades = new GestorEntidades();
        VentanaAgencia ventanaAgencia = new VentanaAgencia(gestorEntidades);
        ventanaAgencia.iniciarVentana();
    }
}
