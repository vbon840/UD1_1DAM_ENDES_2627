import java.util.Scanner;

/**
 * Calcula la media de varias notas enteras que escribe el usuario.
 *
 * <p>Ejercicio E01: no tienes que cambiar este programa, solo ejecutarlo y observar qué pasa.
 */
public class Media {

    /**
     * Calcula la media de las notas.
     *
     * @param notas notas enteras de 0 a 10
     * @return la media de las notas
     */
    static double calcularMedia(int[] notas) {
        // suma y nota son variables locales: van en la trama de este método, en la pila
        int suma = 0;
        for (int nota : notas) {
            suma = suma + nota;
        }
        return (double) suma / notas.length;
    }

    /**
     * Pide las notas al usuario y muestra su media.
     *
     * @param args no se usan
     */
    public static void main(String[] args) {
        // Crea un objeto Scanner que lee lo que se escribe en el teclado
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuántas notas? ");
        int cantidad = entrada.nextInt();

        // Crea un array (un objeto) con sitio para todas las notas
        int[] notas = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }

        double media = calcularMedia(notas);
        System.out.println("Media: " + media);
    }
}
