package util;

/**
 * Clase con herramientas de texto para reutilizar donde sea necesario.
 */
public class TextoUtil {
    public static String ignorarTildes(String texto) {
        if (texto == null || texto.isBlank()) return "";
        return texto.toLowerCase()
                .replace("á", "a")
                .replace("é", "e")
                .replace("í", "i")
                .replace("ó", "o")
                .replace("ú", "u");
    }
}
