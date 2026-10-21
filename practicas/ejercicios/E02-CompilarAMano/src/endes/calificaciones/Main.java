package endes.calificaciones;

/**
 * Muestra la calificación de varias notas de ejemplo.
 */
public class Main {

    /**
     * Recorre las notas de ejemplo y muestra la calificación de cada una.
     *
     * @param args no se usan
     */
    public static void main(String[] args) {
        System.out.println("Tabla de calificaciones");
        double[] notas = {3.5, 5.0, 6.5, 8.0, 9.5, 11.0};
        for (double nota : notas) {
            System.out.println(nota + " -> " + Calificacion.calificar(nota));
        }
    }
}
