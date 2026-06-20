package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a un guía turístico encargado de realizar paseos para turistas.
 * <p>
 * Sus atributos propios son circuitoTuristico (ruta que el guía conoce y realiza)
 * e idiomas (que habla).
 */
public class GuiaTuristico extends Empleado {

    private String circuitoTuristico;
    private List<String> idiomas;

    public GuiaTuristico(String nombre, int edad,
                         String calle, String sector, String ciudad,
                         String numeroTelefono, String correoElectronico,
                         double sueldo,
                         String circuitoTuristico, List<String> idiomas) {

        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico, sueldo);
        setCircuitoTuristico(circuitoTuristico);
        setIdiomas(idiomas);
    }

    public String getCircuitoTuristico() {
        return circuitoTuristico;
    }

    public void setCircuitoTuristico(String circuitoTuristico) {
        if (circuitoTuristico == null || circuitoTuristico.isBlank()) {
            throw new IllegalArgumentException("Error en los datos del circuito del guía. ");
        }
        this.circuitoTuristico = circuitoTuristico;
    }

    public List<String> getIdiomas() {
        return this.idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        if (idiomas == null || idiomas.isEmpty()) {
            throw new IllegalArgumentException("Error en ingreso de datos en idiomas. ");
        }
        this.idiomas = new ArrayList<>(idiomas);
    }

    @Override
    public String toString() {

        String listaIdiomas = String.join(", ", this.idiomas);

        return super.toString() + "Guía turístico: " + circuitoTuristico +
                " (" + listaIdiomas + ")\n\n";
    }
}
