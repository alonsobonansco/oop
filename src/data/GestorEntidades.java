package data;

import model.Chofer;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;

import java.util.ArrayList;

public class GestorEntidades {
    private final ArrayList<Registrable> listaRegistrables;

    public GestorEntidades() {
        this.listaRegistrables = new ArrayList<>();
        crearRegistrables();
    }

    public void crearRegistrables() {
        listaRegistrables.add(new Chofer("José", 32, "Van"));
        listaRegistrables.add(new ColaboradorExterno("María", 45, "Hospedaje"));
        listaRegistrables.add(new Chofer("Roberto", 34, "Camioneta"));
        listaRegistrables.add(new GuiaTuristico("Javiera", 28, "Alemán"));
        listaRegistrables.add(new GuiaTuristico("Jaime", 31, "Francés"));
        listaRegistrables.add(new ColaboradorExterno("Tamara", 55, "Lavandería"));
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
                sb.append("↓ Es un chofer\n");
            } else if (r instanceof ColaboradorExterno colaborador) {
                sb.append("↓ Es un colaborador externo\n");
            } else {
                sb.append("↓ Es un guía\n");
            }

            sb.append(r.mostrarResumen()).append("\n");
        }

        return sb.toString();
    }

    public ArrayList<Registrable> getListaRegistrables() {
        return listaRegistrables;
    }
}
