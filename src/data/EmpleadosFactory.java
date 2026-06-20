package data;

import model.Empleado;
import model.GuiaTuristico;
import model.Transportista;
import util.LineaInvalidaException;

import java.util.List;

public class EmpleadosFactory {

    public static Empleado crearEmpleado(String[] partes, String linea, int contadorLineas) {
        if (partes.length < 9) {
            throw new LineaInvalidaException("Datos insuficientes. Verifique el archivo " +
                    "(linea " + contadorLineas + ": " + linea + ")");
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

        // En caso de que sea un guía se siguen añadiendo partes
        if (tipo.equals("Guía")) {

            if (partes.length != 11) {
                throw new LineaInvalidaException("Formato no válido para guía: " +
                        "(linea " + contadorLineas + ": " + linea + ")");
            }

            String circuitoTuristico = partes[9];
            List<String> idiomas = List.of(partes[10].split("\\|"));

            return new GuiaTuristico(
                    nombre, edad,
                    calle, sector, ciudad,
                    numeroTelefono, correoElectronico,
                    sueldo, circuitoTuristico, idiomas
            );

            // Y aquí se agregan las partes a transportista
        } else if (tipo.equals("Transportista")) {

            if (partes.length != 11) {
                throw new LineaInvalidaException("Formato no válido para transportista: " +
                        "(linea " + contadorLineas + ": " + linea + ")");
            }

            String vehiculo = partes[9];
            int capacidadMaxima = Integer.parseInt(partes[10]);

            return new Transportista(
                    nombre, edad,
                    calle, sector, ciudad,
                    numeroTelefono, correoElectronico,
                    sueldo, vehiculo, capacidadMaxima
            );

        } else {
            throw new LineaInvalidaException("Empleo no válido. Verifique " +
                    "que esté escrito correctamente y sea un empleo válido.\n" +
                    "(línea: " + contadorLineas + ": " + linea + ")");
        }
    }
}
