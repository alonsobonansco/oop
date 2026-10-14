package model;

/**
 * Representa una mascota y su información.
 * Sus atributos son: nombre, especie, edad, dueño.
 * Aplica agregación con Dueño.
 */
public class Mascota {

    // Atributos privados
    private String nombre;
    private String especie;
    private int edad;
    // =================
    private Dueno dueno;                // Integración de la clase Dueño como atributo
    // =================

    /**
     *  Constructor de la Mascota (con parámetros): inicializa una
     *  nueva instancia de la clase con sus datos correspondientes.
     *
     * @param nombre    Nombre de la mascota
     * @param especie   Especie del animal
     * @param edad      Edad del animal en años
     * @param dueno     Información sobre el dueño
     */
    public Mascota(String nombre, String especie, int edad, Dueno dueno) {

        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        // ================
        this.dueno = dueno;         // Agregación (relación débil "has-a")
        // ================
    }

    // Métodos getters y setters

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getEspecie() {return especie;}

    public void setEspecie(String especie) {this.especie = especie;}

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}

    public Dueno getDueno() {return dueno;}

    public void setDueno(Dueno dueno) {this.dueno = dueno;}


    // Método toString()
    @Override
    public String toString() {
        return  " --- DATOS DEL REGISTRO ---\n" +
                "Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + "\n" + dueno     ;
    }
}
