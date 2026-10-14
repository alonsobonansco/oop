package app;

import data.CargadorEmpleados;
import model.Empleado;
import service.GestorAgencia;
import ui.Menu;

import java.util.List;
import java.util.Scanner;

/**
 * Punto de entrada de LlanquihueTourApp. Simula la creación de empleados
 * con diversas ocupaciones y sus datos dentro de la agencia de turismo.
 *
 * @author Alonso Bonansco
 * @version 2.1.1
 * @since Semana 3 (Actualizado en Semana 5)
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CargadorEmpleados cargadorEmpleados = new CargadorEmpleados();

        GestorAgencia gestorAgencia = new GestorAgencia();

        List<Empleado> listaEmpleados = cargadorEmpleados.cargarEmpleados("/empleados.txt");

        // Se mandan scanner, el gestor y la lista de empleados a la clase Menu
        Menu menu = new Menu(sc, gestorAgencia, listaEmpleados);

        menu.iniciar();
    }
}