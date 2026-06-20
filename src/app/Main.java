package app;

import data.CargadorEmpleados;
import model.Empleado;
import service.GestorAgencia;
import ui.Menu;

import java.util.List;
import java.util.Scanner;

/**
 * Simula la creación de empleados con diversas ocupaciones y sus datos
 * dentro de una Agencia de Turismo. Se procede a filtrar dependiendo
 * de las necesidades.
 *
 * @author Alonso Bonansco
 * @version 2.0.0
 * @since Semana 3 (Actualizado en Semana 5)
 *
 */
public class Main {
    public static void main(String[] args) {

        // Crea un scanner y se lo presta a ui.Menu
        Scanner sc = new Scanner(System.in);

        CargadorEmpleados cargadorEmpleados = new CargadorEmpleados();
        GestorAgencia gestorAgencia = new GestorAgencia();

        List<Empleado> listaEmpleados = cargadorEmpleados.cargarEmpleados("/empleados.txt");

        // Aquí ocurre el préstamo
        Menu menu = new Menu(sc, gestorAgencia, listaEmpleados);

        menu.iniciar();
    }
}