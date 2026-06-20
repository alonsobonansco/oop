package service;

import model.Empleado;
import model.GuiaTuristico;
import model.Transportista;

import java.util.ArrayList;
import java.util.List;

import static util.TextoUtil.ignorarTildes;


public class GestorAgencia {

    /**
     *
     * @param empleados     La lista de empleados
     * @param idiomaBuscado El idioma buscado
     * @return Una lista con los guías que hablen el idioma buscado.
     */
    public List<GuiaTuristico> buscarGuiasPorIdioma(List<Empleado> empleados, String idiomaBuscado) {

        List<GuiaTuristico> guiasEncontrados = new ArrayList<>();

        for (Empleado e : empleados) {

            // Si empleado (e) se construyó como un guía entonces da verdadero
            if (e instanceof GuiaTuristico guia) {

                for (String idioma : guia.getIdiomas()) {

                    if (ignorarTildes(idioma).contains(ignorarTildes(idiomaBuscado))) {
                        guiasEncontrados.add(guia);
                        break; // Se deja de escanear a este individuo en específico si lo encuentra
                    }
                }
            }
        }

        return guiasEncontrados;
    }

    /**
     *
     * @param empleados       La lista de empleados
     * @param vehiculoBuscado El vehículo buscado
     * @return Una lista con los transportistas que tengan el vehículo buscado.
     */
    public List<Transportista> buscarTransportistasPorVehiculo(List<Empleado> empleados, String vehiculoBuscado) {

        List<Transportista> transportistasEncontrados = new ArrayList<>();

        for (Empleado e : empleados) {
            if (e instanceof Transportista transportista) {

                if (ignorarTildes(transportista.getVehiculo()).contains(ignorarTildes(vehiculoBuscado))) {
                    transportistasEncontrados.add(transportista);
                }
            }
        }
        return transportistasEncontrados;

    }


}
