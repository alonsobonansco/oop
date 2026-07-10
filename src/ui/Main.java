package ui;

import data.GestorEntidades;
import gui.VentanaAgencia;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestorEntidades = new GestorEntidades();
        VentanaAgencia ventanaAgencia = new VentanaAgencia(gestorEntidades);
        ventanaAgencia.iniciarVentana();
    }
}
