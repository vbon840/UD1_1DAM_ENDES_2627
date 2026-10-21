/**
 * Cuenta los números primos menores que un límite.
 */
public class Primos {

    /** Límite superior (no incluido). */
    static final int LIMITE = 10000;

    /**
     * Indica si un número es primo.
     *
     * @param n número que se comprueba
     * @return {@code true} si {@code n} es primo
     */
    static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int divisor = 2; divisor * divisor <= n; divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Cuenta los primos menores que {@link #LIMITE} y muestra cuántos hay.
     *
     * @param args no se usan
     */
    public static void main(String[] args) {
        int contador = 0;
        for (int n = 2; n < LIMITE; n++) {
            if (esPrimo(n)) {
                contador++;
            }
        }
        System.out.println("Primos menores que " + LIMITE + ": " + contador);
    }
}
