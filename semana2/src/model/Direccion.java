package model;

/**
 * Representa una dirección física del dueño de la mascota.
 * Sus atributos son: calle, ciudad, región.
 */
public class Direccion {

    private String calle;
    private String ciudad;
    private String region;

    /**
     *  Constructor de la Direccion
     *
     * @param calle     La calle y número
     * @param ciudad    La ciudad de residencia
     * @param region    La región en números romanos
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }


    public String getCalle() {return calle;}

    public void setCalle(String calle) {this.calle = calle;}

    public String getCiudad() {return ciudad;}

    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

    public String getRegion() {return region;}

    public void setRegion(String region) {this.region = region;}


    @Override
    public String toString() {
        return calle + ", " + ciudad + " (" + region + ")";
    }
}
