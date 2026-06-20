package data;

import model.Empleado;
import model.GuiaTuristico;
import model.Transportista;
import util.LineaInvalidaException;

import java.util.List;

/**
 * Clase encargada de tomar las líneas leídas desde el txt y transformarlas
 * en objetos dependiendo de qué tipo es. No añade a una List<>, pero devuelve
 * el objeto para que CargadorEmpleados termine el trabajo.
 */
public class EmpleadosFactory {

    public static Empleado crearEmpleado(String[] partes, String linea, int contadorLineas) {
        if (partes.length < 9) {
            throw new LineaInvalidaException("Datos insuficientes, verifique el archivo. ",
                    linea, contadorLineas);
        }

        // Corresponde al primer valor guardado en el txt, para poder distinguir empleos
        String tipo = partes[0];

        // Todos los atributos para el constructor de Empleado
        String nombre = partes[1];
        int edad = Integer.parseInt(partes[2]);
        String calle = partes[3];
        String sector = partes[4];
        String ciudad = partes[5];
        String numeroTelefono = partes[6];
        String correoElectronico = partes[7];
        double sueldo = Double.parseDouble(partes[8]);

        return switch (tipo) {

            // En caso de que sea un guía se siguen añadiendo partes
            case "Guía" -> {
                if (partes.length != 11) {
                    throw new LineaInvalidaException("Formato no válido para guía. ",
                            linea, contadorLineas);
                }

                String circuitoTuristico = partes[9];
                List<String> idiomas = List.of(partes[10].split("\\|"));

                // yield: palabra clave que retorna el valor al switch
                yield new GuiaTuristico(
                        nombre, edad,
                        calle, sector, ciudad,
                        numeroTelefono, correoElectronico,
                        sueldo, circuitoTuristico, idiomas
                );
            }

            // Aquí se añaden las partes al transportista
            case "Transportista" -> {
                if (partes.length != 11) {
                    throw new LineaInvalidaException("Formato no válido para transportista. ",
                            linea, contadorLineas);
                }

                String vehiculo = partes[9];
                int capacidadMaxima = Integer.parseInt(partes[10]);

                yield new Transportista(
                        nombre, edad,
                        calle, sector, ciudad,
                        numeroTelefono, correoElectronico,
                        sueldo, vehiculo, capacidadMaxima
                );
            }

            default -> throw new LineaInvalidaException("Empleo no válido. " +
                    "Verifique que esté escrito correctamente y sea un empleo válido.\n",
                    linea, contadorLineas);
        };

    }
}
