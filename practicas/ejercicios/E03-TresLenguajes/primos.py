"""Cuenta los números primos menores que un límite."""

LIMITE = 10000


def es_primo(n):
    """Indica si un número es primo."""
    if n < 2:
        return False
    divisor = 2
    while divisor * divisor <= n:
        if n % divisor == 0:
            return False
        divisor += 1
    return True


contador = 0
for n in range(2, LIMITE):
    if es_primo(n):
        contador += 1
print(f"Primos menores que {LIMITE}: {contador}")
