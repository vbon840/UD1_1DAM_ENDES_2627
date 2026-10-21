# Un programa por dentro

<!-- Completa cada sección. Borra los comentarios como este cuando termines.
     Respeta el formato de las tablas: así podrás compararlas con la solución. -->

## Versión de Java

<!-- Pega la primera línea de la salida de «java -version». -->

```text
Las pruebas se realizaron en dos equipos: el del centro educativo (Java 22.0.1) y el personal (Java 25.0.3).
```

## Salida del programa

<!-- Pega lo que aparece en la terminal al ejecutar «java Media.java» con 4 notas: 6, 8, 9 y 5. -->

```text
¿Cuántas notas? 4
Nota 1: 6
Nota 2: 8
Nota 3: 9
Nota 4: 5
Media: 7.0

```

## El proceso

<!-- Con el programa esperando la cantidad de notas. La captura va en img/proceso.png. -->

| Dato | Valor |
|------|-------|
| Sistema operativo | Windows 11 Pro Education |
| Herramienta que has usado | Símbolo del sistema |
| Nombre del proceso | java.exe |
| Identificador (PID) |18328, 7248 |
| Memoria que ocupa | 1.2.. K, 66.432 K |
| Procesador (%) | 00 |
| Estado en que está, según el tema 1, y por qué | Bloqueado. Este proceso está esperando que el usuario introduzca un dato por teclado. Mientras espera, prácticamente no utiliza la CPU, pero sigue ocupando memoria RAM. |

![Proceso de Java en el administrador de procesos](img/proceso.png)

## Componentes en cada paso

<!-- «Componentes»: procesador (ALU, registros), memoria, teclado, pantalla, sistema operativo…
     «Zona de memoria»: código, datos estáticos, montículo, pila, o «—» si no se crea nada. -->

| # | Paso del programa | Qué ocurre | Componentes que intervienen | Zona de memoria |
|---|-------------------|------------|-----------------------------|-----------------|
| 1 | Escribes `java Media.java` y pulsas Intro | El sistema operativo crea un proceso Java. Se compila el código fuente y la JVM comienza la ejecución del programa. | SSD, SO, RAM, CPU y JVM. | código, datos, Pila y Montículo. |
| 2 | `Scanner entrada = new Scanner(System.in);` | Se crea un objeto para leer la entrada. | RAM, CPU y JVM. | Pila, Montículo. |
| 3 | `System.out.print("¿Cuántas notas? ");` | Se muestrael mensaje en pantalla. | pantalla, SO, RAM, CPU y JVM | Código, datos estáticos y Montículo. |
| 4 | `int cantidad = entrada.nextInt();` | Se lee un número entero del teclado. El proceso espera si no hay datos disponibles. | teclado, SO, RAM, CPU y JVM | Pila |
| 5 | `int[] notas = new int[cantidad];` | Se crea un array de cantidad elementos, inicializados a cero. | CPU, RAM y JVM. | Pila, Montículo |
| 6 | El bucle que pide y lee cada nota | El bucle pide y guarda las notas en el array. | CPU, RAM, JVM, SO, teclado y pantalla. | Código, Pila, Montículo |
| 7 | `double media = calcularMedia(notas);` | Se crea una trama de método en la pila, el método lee los elementos del array en el montón, calcula el promedio y devuelve el resultado a main(). | CPU, RAM, JVM | Código, Pila, Montículo |
| 8 | `System.out.println("Media: " + media);` | Se muestra en pantalla el texto «Media: » junto con el valor calculado. | pantalla, SO, RAM, CPU y JVM | Código, datos estáticos, Pila y Montículo. |
| 9 | Termina `main` | Termina el método main(), finaliza el proceso y se liberan sus recursos. | CPU, RAM, JVM y SO. | Pila |

## Cuando se acaba la memoria

<!-- Pega las dos primeras líneas del error y explica qué ha pasado y en qué zona de memoria. -->

```text
Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at Media.main(Media.java:38)
```

Explicación:
El programa intenta crear un array de 100 millones de enteros. Cada int ocupa 4 bytes, por lo que el array necesita aproximadamente 400 MB. Como hemos limitado el montículo a 64 MB con -Xmx64m, no hay memoria suficiente y se produce OutOfMemoryError: Java heap space.

## Preguntas

1. ¿Cuántas tramas hay en la pila mientras se ejecuta `calcularMedia`? ¿De qué métodos son?

   2 tramas: main(String[] args) → calcularMedia(int[] notas).

2. ¿Por qué el proceso casi no usa el procesador mientras espera que escribas?

   <!-- Tu respuesta --> Cuando el proceso está bloqueado esperando que el usuario introduzca un número por teclado, no necesita utilizar la CPU, por lo que el sistema operativo puede asignarla a otros procesos.

3. Si ejecutas el programa dos veces a la vez, en dos terminales, ¿cuántos programas y cuántos procesos hay? ¿Comparten la memoria?

   <!-- Tu respuesta --> Hay un programa y dos procesos, porque se ejecuta el mismo programa dos veces. Cada proceso tiene su propio espacio de memoria y trabaja con sus propios datos. No comparten directamente la memoria.

4. El programa escribe en la pantalla con `System.out`. ¿Por qué no puede escribir directamente en ella?

   <!-- Tu respuesta --> El programa no accede directamente al hardware. Utiliza `System.out` para enviar datos a la salida estándar, y la JVM y el sistema operativo se encargan de gestionar la comunicación con el terminal y la pantalla.
