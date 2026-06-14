package ui;

import data.GestorDatos;
import model.Tour;

import java.util.ArrayList;

/**
 *
 *  @author Alonso Bonansco
 *  @version 1.0.0
 *  @since Semana 4
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Tour> listaTours = GestorDatos.leerDatos();

        if (listaTours.isEmpty()) {
            System.out.println("Error: ");
            return;
        }

        int contadorDuracion = 0;

        //  Ayuda de salida formateada para mejor presentación en consola
        System.out.println("\n\n====== TODOS LOS RESULTADOS =======\n");
        System.out.printf("%-30s %-10s %-10s%n", "CIRCUITO", "PERSONAS", "DURACIÓN(h)");
        System.out.println("---------------------------------------------------------");

        //  Muestra todos los elementos de la colección
        for (Tour tour : listaTours) {
            System.out.println(tour);
            if (tour.getDuracion() > 2) {
                contadorDuracion++;
            }
        }

        if (contadorDuracion > 0) {
            System.out.println("\n\n====== RESULTADOS FILTRADOS (MAYORES A 2h) =======\n");
            System.out.printf("%-30s %-10s %-10s%n", "CIRCUITO", "PERSONAS", "DURACIÓN(h)");
            System.out.println("---------------------------------------------------------");

            for (Tour tour : listaTours) {

                //  Filtra por condición. Se muestra solo si el circuito turístico dura más de 2 horas
                if (tour.getDuracion() > 2) {
                    System.out.println(tour);
                }
            }
        }



    }
}