package model;

import util.EdadInvalidaException;
import util.SueldoInvalidoException;

/**
 *  Representa a un guía turístico encargado de realizar paseos para turistas.
 *
 *  Sus atributos propios son circuitoTuristico (ruta que el guía conoce y realiza)
 *  e idiomaSecundario (idioma que habla el guía además de Español,
 *  en próximas versiones se puede usar ArrayList)
 */
public class GuiaTuristico extends Empleado {

    private String circuitoTuristico;
    private String idiomaSecundario;

    public GuiaTuristico(String nombre, int edad,
                         String calle, String sector, String ciudad,
                         String numeroTelefono, String correoElectronico,
                         double sueldo,
                         String circuitoTuristico, String idioma)

                         //  Las clases hijas también deben lanzar la excepción
                         throws SueldoInvalidoException,
                                EdadInvalidaException {

        super(nombre, edad, calle, sector, ciudad, numeroTelefono, correoElectronico, sueldo);
        this.circuitoTuristico = circuitoTuristico;
        this.idiomaSecundario = idioma;
    }

    public String getCircuitoTuristico() {
        return circuitoTuristico;
    }

    public void setCircuitoTuristico(String circuitoTuristico) {
        this.circuitoTuristico = circuitoTuristico;
    }

    public String getIdioma() {
        return idiomaSecundario;
    }

    public void setIdioma(String idioma) {
        this.idiomaSecundario = idioma;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ocupación: Guía turístico\nCircuito: " + circuitoTuristico +
                " | Idioma: " + idiomaSecundario + "\n\n";
    }
}
