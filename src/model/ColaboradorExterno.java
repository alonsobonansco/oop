package model;

public class ColaboradorExterno extends Persona implements Registrable {
    private String cargo;

    public ColaboradorExterno(String nombre, int edad, String cargo) {
        super(nombre, edad);
        this.cargo = cargo;
    }

    @Override
    public void mostrarResumen() {

    }
}
