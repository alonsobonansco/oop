package data;

import model.Empleado;
import util.LineaInvalidaException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para leer desde archivo txt. Manda cada línea a EmpleadosFactory,
 * esta devuelve un objeto construido y se van añadiendo a una List<> Empleado.
 */
public class CargadorEmpleados {
    public List<Empleado> cargarEmpleados(String ruta) {
        List<Empleado> empleados = new ArrayList<>();

        try (InputStream is = CargadorEmpleados.class.getResourceAsStream(ruta)) {
            if (is == null) {
                System.err.println("Error. No se encontró " + ruta);
                return empleados;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
                String linea;
                int contadorLineas = 0;

                while ((linea = reader.readLine()) != null) {
                    contadorLineas++;

                    // Actualización a .isBlank()
                    if (linea.isBlank()) continue;

                    try {
                        String[] partes = linea.split(";");

                        Empleado nuevoEmpleado = EmpleadosFactory.crearEmpleado(partes, linea, contadorLineas);
                        empleados.add(nuevoEmpleado);

                    } catch (LineaInvalidaException e) {
                        System.err.println(e.getMessage());

                    } catch (IllegalArgumentException e) {

                        String tipoError = e.getClass().getSimpleName();

                        System.err.println("[" + tipoError + "] " + e.getMessage() +
                                " (Línea " + contadorLineas + ": " + linea + ")");
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el archivo.");
        }

        return empleados;
    }
}
