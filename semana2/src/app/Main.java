package app;

// Importación de las clases necesarias desde el paquete 'model'
import model.Dueno;
import model.Mascota;

/**
 * Simula la creación de mascotas y sus dueños con el objetivo de llevar un registro.
 *
 * @author Alonso Bonansco
 * @version 4.0.0
 * @since Semana 2
 */
public class Main {
    public static void main(String[] args) {

        // Creación de instancias de las clases e impresión en consola

        Dueno dueno1 = new Dueno("Juan", "56564376", "Salvador 123", "Valdivia", "XIV Region");
        Mascota mascota1 = new Mascota("Félix", "Felino", 8, dueno1);
        System.out.println(mascota1);

        Dueno dueno2 = new Dueno("María", "32145678", "O'Higgins 456", "Puerto Montt", "X Region");
        Mascota mascota2 = new Mascota("Jack", "Canino", 4, dueno2);
        System.out.println(mascota2);
    }
}