package model;

/**
 *  Representa los datos de contacto de las personas
 *  para poder comunicarse con ellas.
 *
 *  Los atributos son numeroTelefono y correoElectronico.
 */
public class Contacto {

    private String numeroTelefono;
    private String correoElectronico;

    public Contacto(String numeroTelefono, String correoElectronico) {

        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }


    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Teléfono: " + numeroTelefono + " | Correo electrónico: " + correoElectronico;
    }
}
