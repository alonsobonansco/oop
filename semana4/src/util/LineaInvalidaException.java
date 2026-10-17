package util;

/*  RuntimeException es unchecked (más flexible), no obliga a manejar con try-catch
 *   ni a que clases y métodos lancen la excepción (throw/s).
 *  Solo muestra la primera que encuentra, en caso de múltiples errores.
 */
public class LineaInvalidaException extends RuntimeException {
    public LineaInvalidaException(String mensaje) {
        super(mensaje);
    }
}
