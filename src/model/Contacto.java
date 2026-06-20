package model;

/**
 * Representa los datos de contacto de las personas
 * para poder comunicarse con ellas.
 * <p>
 * Los atributos son numeroTelefono y correoElectronico.
 */
public class Contacto {

    private String numeroTelefono;
    private String correoElectronico;

    public Contacto(String numeroTelefono, String correoElectronico) {

        setNumeroTelefono(numeroTelefono);
        setCorreoElectronico(correoElectronico);
    }


    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        if (numeroTelefono == null || numeroTelefono.isBlank()) {
            throw new IllegalArgumentException("Número de teléfono inválido. ");
        }
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if (correoElectronico == null || correoElectronico.isBlank()) {
            throw new IllegalArgumentException("Correo electrónico inválido. ");
        }
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return numeroTelefono + " | " + correoElectronico;
    }
}
