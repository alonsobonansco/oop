package ui;

import model.Empleado;
import model.GuiaTuristico;
import model.Transportista;
import service.GestorAgencia;

import java.util.List;
import java.util.Scanner;

/**
 * Menú simple de la agencia para navegar entre algunas opciones.
 */
public class Menu {
    // palabra clave final: optimización, inmutable
    private final Scanner sc;
    private final GestorAgencia gestorAgencia;
    private final List<Empleado> listaEmpleados;

    // Se pasa el scanner como atributo. Cualquier método puede utilizarlo
    public Menu(Scanner sc, GestorAgencia gestorAgencia, List<Empleado> listaEmpleados) {
        this.sc = sc;
        this.gestorAgencia = gestorAgencia;
        this.listaEmpleados = listaEmpleados;
    }

    /**
     * Inicia el menú que se muestra al usuario y permite ingresar datos de entrada
     * para hacer búsquedas.
     */
    public void iniciar() {
        int opcion;

        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println();
                    // Nueva forma de recorrer una lista. "Referencia a Método"
                    listaEmpleados.forEach(System.out::print);
                    System.out.println("--------------------------------------------------\n");
                }

                case 2 -> {
                    System.out.print("¿Qué idioma desea buscar? ");
                    String idiomaBuscado = sc.nextLine();

                    List<GuiaTuristico> guiasEncontrados =
                            gestorAgencia.buscarGuiasPorIdioma(listaEmpleados, idiomaBuscado);

                    if (guiasEncontrados.isEmpty()) {
                        System.out.println("\nNo se encontraron guías que hablen el idioma requerido.\n");
                    } else {
                        System.out.println("\n--- Guías encontrados ---\n");
                        guiasEncontrados.forEach(System.out::print);
                        System.out.println("--------------------------------------------------\n");
                    }
                }

                case 3 -> {
                    System.out.print("¿Qué tipo de vehículo necesita? ");
                    String vehiculoBuscado = sc.nextLine();

                    List<Transportista> transportistasEncontrados =
                            gestorAgencia.buscarTransportistasPorVehiculo(listaEmpleados, vehiculoBuscado);

                    if (transportistasEncontrados.isEmpty()) {
                        System.out.println("\nNo se encontraron transportistas con el vehículo requerido.\n");
                    } else {
                        System.out.println("\n--- Transportistas encontrados ---\n");
                        transportistasEncontrados.forEach(System.out::print);
                        System.out.println("--------------------------------------------------\n");
                    }
                }

                case 4 -> System.out.println("Saliendo de LlanquihueTourApp...");

                default -> System.out.println("Opción no válida.\n");
            }
        } while (opcion != 4);

        cerrar();
    }

    /**
     * Muestra el menú en consola y captura las opciones del usuario.
     *
     * @return La opción ingresada por el usuario.
     */
    private int mostrarMenu() {
        // De StringBuilder pasó a String y finalmente a Text Block (""" triple comillas)
        String textoMenu = """ 
                === Llanquihue Tour ===
                1. Mostrar todos los empleados
                2. Buscar guía turístico por idioma
                3. Buscar transportista por tipo de vehículo
                4. Salir de la aplicación
                
                Ingrese su opción:\s"""; // \s espacio en blanco
        System.out.print(textoMenu);

        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ingrese solo números enteros.");
            return -1; // Número seguro para retornar (por los case del switch)
        }
    }

    public void cerrar() {
        sc.close();
    }
}
