package data;

import model.*;

import java.util.ArrayList;

public class GestorEntidades {
    private final ArrayList<Registrable> listaRegistrables;

    public GestorEntidades() {
        this.listaRegistrables = new ArrayList<>();
        crearRegistrables();
    }

    public void crearRegistrables() {
        listaRegistrables.add(new Chofer("José", 32, "A2"));
        listaRegistrables.add(new ColaboradorExterno("María", 45, "Hospedaje"));
        listaRegistrables.add(new Chofer("Roberto", 34, "B"));
        listaRegistrables.add(new GuiaTuristico("Javiera", 28, "Alemán"));
        listaRegistrables.add(new GuiaTuristico("Jaime", 31, "Francés"));
        listaRegistrables.add(new ColaboradorExterno("Tamara", 55, "Lavandería"));
        listaRegistrables.add(new Vehiculo("Van", "ASDF99", 16));
        listaRegistrables.add(new Vehiculo("Camioneta", "QWER77", 5));
    }

    public void agregarRegistrable(Registrable registrable) {
        if (registrable != null) {
            this.listaRegistrables.add(registrable);
        }
    }

    public String mostrarRegistrables() {
        StringBuilder sb = new StringBuilder("Lista objetos\n");

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

    public ArrayList<Registrable> getListaRegistrables() {
        return listaRegistrables;
    }
}
