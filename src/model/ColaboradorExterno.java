package model;

public class ColaboradorExterno extends Persona implements Registrable {
    private String cargo;

    public ColaboradorExterno(String nombre, int edad, String cargo) {
        super(nombre, edad);
        setCargo(cargo);
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Nombre: " + super.getNombre() +
                " | Edad: " + super.getEdad() +
                " | Cargo: " + cargo + "\n");
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo == null || cargo.isBlank()) {
            throw new IllegalArgumentException("Un colaborador debe tener un cargo. ");
        }
        this.cargo = cargo;
    }
}
