package ui;

import data.GestorEntidades;

public class Main {
    public static void main(String[] args) {
        GestorEntidades gestorEntidades = new GestorEntidades();
        gestorEntidades.crearRegistrables();
        gestorEntidades.mostrarRegistrables();
    }
}