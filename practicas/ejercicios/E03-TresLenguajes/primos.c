/* Cuenta los números primos menores que un límite. */
#include <stdio.h>

#define LIMITE 10000

/* Devuelve 1 si n es primo y 0 si no lo es. */
int es_primo(int n) {
    if (n < 2) {
        return 0;
    }
    for (int divisor = 2; divisor * divisor <= n; divisor++) {
        if (n % divisor == 0) {
            return 0;
        }
    }
    return 1;
}

int main(void) {
    int contador = 0;
    for (int n = 2; n < LIMITE; n++) {
        if (es_primo(n)) {
            contador++;
        }
    }
    printf("Primos menores que %d: %d\n", LIMITE, contador);
    return 0;
}
