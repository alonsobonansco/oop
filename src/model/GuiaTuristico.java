package model;

// Primero extends y luego implements
public class GuiaTuristico extends Persona implements Registrable {
    private String idioma;

    public GuiaTuristico(String nombre, int edad, String idioma) {
        super(nombre, edad);
        this.idioma = idioma;
    }

    @Override
    public void mostrarResumen() {

    }
}
