# E03 · Compilado, interpretado y máquina virtual

Ejecuta el mismo programa escrito en Java, Python y C, observa qué genera cada traducción y clasifica los tres lenguajes. Después, clasifica los diez primeros lenguajes del índice TIOBE.

**CE:** RA1 c, d, e

## Entorno de trabajo

Necesitas el **JDK que usas en Programación** (versión 17 o posterior; no instales otro), **Python 3** y la **terminal** (en Windows, PowerShell). También necesitas un **compilador de C**. Python y el compilador de C se instalan sin privilegios de administrador: si te falta algo, sigue el apartado «Antes de empezar» del [índice de ejercicios](../../03-ejercicios.md).

Abre la terminal en la carpeta de este ejercicio. Los tres programas ya están hechos y hacen lo mismo: cuentan los números primos menores que 10 000.

| Fichero | Lenguaje |
|---------|----------|
| `Primos.java` | Java |
| `primos.py` | Python |
| `primos.c` | C |

En Windows, Python se ejecuta con `python` (si usas el paquete *embeddable*, con la ruta completa de su `python.exe`); en GNU/Linux y macOS, con `python3`. Comprueba las versiones con `java -version` y `python --version` (o `python3 --version`).

**No tienes que programar**: compara los tres ficheros, ejecútalos y observa qué ficheros aparecen en la carpeta tras cada paso.

## Requisitos

1. **Java.** Compila y ejecuta:

   ```bash
   javac Primos.java
   java Primos
   ```

   Anota en la tabla de la sección «Qué genera cada lenguaje» qué fichero nuevo aparece y qué hace falta para ejecutarlo.
2. **Python.** Ejecuta el programa:

   ```bash
   python primos.py
   ```

   ¿Aparece algún fichero nuevo? Después, pide a Python que guarde el *bytecode* del programa y mira qué se crea:

   ```bash
   python -m py_compile primos.py
   ```

3. **C.** Compila y ejecuta el programa con tu compilador de C (en Windows, w64devkit; en GNU/Linux, `gcc`; en macOS, las herramientas de Xcode). En Windows, escribe las órdenes en la terminal de w64devkit (`w64devkit.exe`), o en PowerShell si has añadido su carpeta `bin` al `Path` de tu cuenta (en PowerShell, el programa se ejecuta con `.\primos.exe`):

   ```bash
   gcc primos.c -o primos
   ./primos
   ```

   Anota qué fichero aparece en la carpeta y qué hace falta para ejecutarlo.
4. Completa la tabla de la sección «Clasificación» con el paradigma, el tipado y la forma de ejecución de los tres lenguajes (tema 2).
5. Consulta el [índice TIOBE](https://www.tiobe.com/tiobe-index/) y completa la tabla de la sección «Los diez primeros del índice TIOBE»: para cada lenguaje, su paradigma principal, su tipado, su forma de ejecución y un uso habitual. Indica la fecha de consulta y el mes del índice.
6. Responde a las preguntas de la sección «Preguntas».

## Contrato de entrega

Respeta estos nombres y formatos: la corrección los busca exactamente aquí, se haga en clase, con la solución o con una rúbrica.

| Elemento | Debe ser |
|----------|----------|
| Código | `Primos.java`, `primos.py` y `primos.c`, sin cambios |
| README | Las secciones de la plantilla, en el mismo orden, con sus tablas |
| Tabla TIOBE | Diez filas, en el orden del índice, con la fecha de consulta y el mes del índice |
| Valores de «Forma de ejecución» | `Compilado`, `Interpretado` o `Máquina virtual`, con una aclaración si hace falta |

## Comprueba tu solución

- Los tres programas muestran exactamente la misma línea: `Primos menores que 10000: 1229`.
- Java genera `Primos.class` (*bytecode*) y para ejecutarlo hace falta la JVM. No genera ningún `.exe`.
- `python primos.py` no genera ningún fichero nuevo. `python -m py_compile primos.py` crea la carpeta `__pycache__` con un fichero `primos.cpython-3XX.pyc` (las cifras son las de tu versión de Python): Python también compila a *bytecode*, aunque normalmente no lo guarda para el programa principal.
- C genera un ejecutable nativo que se ejecuta sin ningún otro programa.
- En tu clasificación, Java es de máquina virtual, C es compilado y Python es interpretado, con la aclaración de que compila antes a *bytecode*. Java y C tienen tipado estático; Python, dinámico.
- La tabla TIOBE tiene diez filas, el mes del índice y la fecha en que lo consultaste.

En la solución de referencia la tabla TIOBE es de una fecha concreta: si la tuya es de otro mes, las posiciones pueden cambiar.

## Criterios de evaluación

- ✅ Ejecutas los programas y anotas su salida
- ✅ Identificas qué genera la traducción en cada lenguaje y qué hace falta para ejecutarlo
- ✅ Clasificas Java, Python y C con los criterios del tema 2
- ✅ Clasificas los diez primeros lenguajes del índice TIOBE, con su fecha
- ✅ Explicas las diferencias entre compilado, interpretado y máquina virtual al responder a las preguntas
