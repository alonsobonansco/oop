package data;

import model.Chofer;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;

import java.util.ArrayList;

public class GestorEntidades {
    ArrayList<Registrable> listaRegistrables;

    public GestorEntidades() {
        this.listaRegistrables = new ArrayList<>();
    }

    public void crearRegistrables() {
        listaRegistrables.add(new Chofer("José", 32, "Van"));
        listaRegistrables.add(new ColaboradorExterno("María", 45, "Hospedaje"));
        listaRegistrables.add(new Chofer("Roberto", 34, "Camioneta"));
        listaRegistrables.add(new GuiaTuristico("Javiera", 28, "Alemán"));
        listaRegistrables.add(new GuiaTuristico("Jaime", 31, "Francés"));
        listaRegistrables.add(new ColaboradorExterno("Tamara", 55, "Lavandería"));
    }

    public void mostrarRegistrables() {
        for (Registrable r : listaRegistrables) {
            if (r instanceof Chofer chofer) {
                System.out.println("↓ Es un chofer!");
                r.mostrarResumen();
            } else if (r instanceof ColaboradorExterno colaborador) {
                System.out.println("↓ Es un colaborador!");
                r.mostrarResumen();
            } else {
                System.out.println("↓ Y este otro es un guía!!");
                r.mostrarResumen();
            }
        }
    }
}
