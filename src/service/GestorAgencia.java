package service;

import model.Empleado;
import model.GuiaTuristico;
import model.Transportista;

import java.util.List;

import static util.TextoUtil.ignorarTildes;


public class GestorAgencia {

    /**
     *
     * @param empleados     La lista de empleados
     * @param idiomaBuscado El idioma buscado para filtrar
     */
    public void buscarGuiasPorIdioma(List<Empleado> empleados, String idiomaBuscado) {

        System.out.println();
        boolean guiaEncontrado = false;

        for (Empleado e : empleados) {

            // Si empleado (e) se construyó como un guía entonces da verdadero
            if (e instanceof GuiaTuristico guia) {

                for (String idioma : guia.getIdiomas()) {

                    if (ignorarTildes(idioma).contains(ignorarTildes(idiomaBuscado))) {
                        System.out.println(guia);
                        guiaEncontrado = true;
                        break; // Se deja de escanear a este individuo en específico si lo encuentra
                    }
                }
            }
        }
        if (!guiaEncontrado) {
            System.out.println("No se encontraron guías que hablen " + idiomaBuscado + "\n");
        }

    }

    /**
     *
     * @param empleados       La lista de empleados
     * @param vehiculoBuscado El tipo de vehículo buscado para filtrar
     */
    public void buscarTransportistasPorVehiculo(List<Empleado> empleados, String vehiculoBuscado) {

        System.out.println();
        boolean tranportistaEncontrado = false;

        for (Empleado e : empleados) {
            if (e instanceof Transportista transportista) {

                if (ignorarTildes(transportista.getVehiculo()).contains(ignorarTildes(vehiculoBuscado))) {
                    System.out.println(transportista);
                    tranportistaEncontrado = true;
                }
            }
        }
        if (!tranportistaEncontrado) {
            System.out.println("\nNo se encontraron tranportistas con el vehículo requerido.\n");
        }

    }


}
