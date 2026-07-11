package app;

import data.GestorEntidades;
import ui.VentanaAgencia;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestorEntidades = new GestorEntidades();
        VentanaAgencia ventanaAgencia = new VentanaAgencia(gestorEntidades);
        ventanaAgencia.iniciarVentana();
    }
}
