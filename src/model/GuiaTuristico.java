package model;

// Primero extends y luego implements
public class GuiaTuristico extends Persona implements Registrable {
    private String idiomaSecundario;

    public GuiaTuristico(String nombre, int edad, String idiomaSecundario) {
        super(nombre, edad);
        this.idiomaSecundario = idiomaSecundario;
    }

    @Override
    public String mostrarResumen() {
        return "Nombre: " + super.getNombre() +
                " | Edad: " + super.getEdad() +
                " | Idioma Secundario: " + idiomaSecundario + "\n";
    }

    public String getIdiomaSecundario() {
        return idiomaSecundario;
    }

    public void setIdiomaSecundario(String idiomaSecundario) {
        if (idiomaSecundario == null || idiomaSecundario.isBlank()) {
            throw new IllegalArgumentException("El guía debe tener un idioma secundario. ");
        }
        this.idiomaSecundario = idiomaSecundario;
    }
}
