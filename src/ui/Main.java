package ui;

import data.GestorDatos;
import model.Tour;

import java.util.List;

/**
 * Punto de ejecución de la aplicación LlanquihueTour.
 * Llama a GestorDatos para cargar los datos.
 * Luego muestra todos los resultados y, si hay, posteriormente los filtrados.
 *
 * @author Alonso Bonansco
 * @version 1.3.1
 * @since Semana 4
 */
public class Main {
    public static void main(String[] args) {

        //  Se manda el nombre del archivo aquí, la clase
        //  recibe un String ruta. Hace al GestorDatos
        //  flexible y reutilizable.
        List<Tour> listaTours = GestorDatos.leerDatos("/tours.txt");

        if (listaTours.isEmpty()) {
            System.out.println("Error al cargar los datos. Verifique que hayan datos en el archivo.");
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
            if (tour.getDuracion() < 4) {
                contadorDuracion++;
            }
        }

        if (contadorDuracion > 0) {
            System.out.println("\n\n====== RESULTADOS FILTRADOS (MENORES A 4h) =======\n");
            System.out.printf("%-30s %-10s %-10s%n", "CIRCUITO", "PERSONAS", "DURACIÓN(h)");
            System.out.println("---------------------------------------------------------");

            for (Tour tour : listaTours) {

                //  Filtra por condición. Se muestra solo si el circuito turístico dura menos de 4 horas
                if (tour.getDuracion() < 4) {
                    System.out.println(tour);
                }
            }
        }


    }
}