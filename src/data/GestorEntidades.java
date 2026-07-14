package data;

import model.*;

import java.util.ArrayList;

/**
 * Clase que se encarga de administrar los objetos registrables.
 */
public class GestorEntidades {
    private final ArrayList<Registrable> listaRegistrables;

    public GestorEntidades() {
        this.listaRegistrables = new ArrayList<>();
        crearRegistrablesPredeterminados();
    }

    /**
     * Método que crea objetos de tipo Registrable y añade a una ArrayList.
     */
    public void crearRegistrablesPredeterminados() {
        listaRegistrables.add(new Chofer("José", 32, "A2"));
        listaRegistrables.add(new ColaboradorExterno("María", 45, "Hospedaje"));
        listaRegistrables.add(new Chofer("Roberto", 34, "B"));
        listaRegistrables.add(new GuiaTuristico("Javiera", 28, "Alemán"));
        listaRegistrables.add(new GuiaTuristico("Jaime", 31, "Francés"));
        listaRegistrables.add(new ColaboradorExterno("Tamara", 55, "Lavandería"));
        listaRegistrables.add(new Vehiculo("Van", "ASDF99", 16));
        listaRegistrables.add(new Vehiculo("Camioneta", "QWER77", 5));
    }

    /**
     * Método
     * @param registrable Objeto creado con los datos ingresados por parte del usuario.
     */
    public void agregarRegistrable(Registrable registrable) {
        if (registrable != null) {
            this.listaRegistrables.add(registrable);
        }
    }

    /**
     * Método que diferencia entre las distintas clases que conforman la interfaz
     * Registrable. Añade la información de mostrarResumen de cada una de las clases
     * a un StringBuilder.
     *
     * @return Un Stringbuilder con la información de los objetos Registrable
     */
    public String mostrarRegistrables() {
        StringBuilder sb = new StringBuilder();

        for (Registrable r : listaRegistrables) {
            if (r instanceof Chofer chofer) {
                sb.append("- Chofer -\n");
            } else if (r instanceof ColaboradorExterno colaborador) {
                sb.append("- Colaborador externo -\n");
            } else if (r instanceof GuiaTuristico guia) {
                sb.append("- Guía -\n");
            } else {
                sb.append("- Vehículo -\n");
            }

            sb.append(r.mostrarResumen()).append("\n");
        }

        return sb.toString();
    }
}
