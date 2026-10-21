package endes.calificaciones;

/**
 * Convierte una nota numérica en su calificación con texto.
 */
public class Calificacion {

    /**
     * Devuelve la calificación de una nota.
     *
     * @param nota nota de 0 a 10
     * @return «Insuficiente», «Suficiente», «Bien», «Notable» o «Sobresaliente», o «Nota no
     *     válida» si la nota está fuera del intervalo de 0 a 10
     */
    public static String calificar(double nota) {
        if (nota < 0 || nota > 10) {
            return "Nota no válida";
        } else if (nota < 5) {
            return "Insuficiente";
        } else if (nota < 6) {
            return "Suficiente";
        } else if (nota < 7) {
            return "Bien";
        } else if (nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}
