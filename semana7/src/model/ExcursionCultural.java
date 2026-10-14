package model;

/**
 * Representa una excursión cultural.
 * Su atributo propio es lugarHistorico.
 */
public class ExcursionCultural extends ServicioTuristico {
    private String lugarHistorico;

    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras);
        setLugarHistorico(lugarHistorico);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(
                "=== Excursión Cultural ===\n" +
                        "Nombre: " + super.getNombre() +
                        " - Duración: " + super.getDuracionHoras() +
                        " h - Lugar Histórico: " + lugarHistorico + "\n");
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        if (lugarHistorico == null || lugarHistorico.isBlank()) {
            throw new IllegalArgumentException("El Lugar Histórico no puede estar vacío.");
        }
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString() + " | Lugar histórico: " + lugarHistorico + "\n";
    }
}
