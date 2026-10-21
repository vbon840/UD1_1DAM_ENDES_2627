# E02 · Compilar, ejecutar y empaquetar a mano

Obtén el *bytecode* de un programa Java de dos clases, ejecútalo, mira su *bytecode*, empaquétalo en un JAR y provoca a propósito errores de compilación y de ejecución para ver quién los detecta.

**CE:** RA1 c, d

## Entorno de trabajo

Solo necesitas el **JDK que usas en Programación** (versión 17 o posterior; no instales otro) y la **terminal** (en Windows, PowerShell). Si tienes dudas sobre el JDK, mira el apartado «Antes de empezar» del [índice de ejercicios](../../03-ejercicios.md).

Abre la terminal en la carpeta de este ejercicio, la que contiene `src/`. Todas las órdenes se escriben desde ahí. El programa ya está hecho:

```text
src/
└── endes/
    └── calificaciones/
        ├── Calificacion.java   ← convierte una nota en su calificación
        └── Main.java           ← muestra la calificación de seis notas de ejemplo
```

**No tienes que programar**: solo compilar, ejecutar, observar y provocar errores siguiendo los pasos. Es lo que viste en el tema 3, apartado 3.7.

## Requisitos

1. Comprueba que tienes un JDK: `java -version` y `javac -version` deben responder con la misma versión, la 17 o posterior. Copia sus primeras líneas en la sección «Versiones» del `README.md`.
2. **Compila** las dos clases dejando el *bytecode* en la carpeta `out`:

   ```bash
   javac -d out src/endes/calificaciones/Calificacion.java src/endes/calificaciones/Main.java
   ```

   Anota en la sección «Compilar» qué ficheros se han creado y en qué carpetas.
3. **Ejecuta** el programa con la ruta de clases y el nombre completo de la clase, y copia la salida:

   ```bash
   java -cp out endes.calificaciones.Main
   ```

4. **Mira el *bytecode*** de `Calificacion`:

   ```bash
   javap -c -cp out endes.calificaciones.Calificacion
   ```

   Copia en la sección «El *bytecode*» las instrucciones de `calificar` desde la `0` hasta la `16` (la primera comprobación, la de la nota no válida) y explica qué hacen.
5. **Empaqueta** el programa en un JAR ejecutable, lista su contenido y ejecútalo:

   ```bash
   jar --create --file calificaciones.jar --main-class endes.calificaciones.Main -C out .
   jar --list --file calificaciones.jar
   java -jar calificaciones.jar
   ```

6. **Provoca cuatro errores**, de uno en uno, y anota cada uno en la tabla de la sección «Errores provocados»: la primera línea del mensaje, el tipo de error (de compilación sintáctico, de compilación semántico o de ejecución) y qué herramienta lo detecta. **Deshaz cada cambio** antes de pasar al siguiente.
   1. En `Calificacion.java`, quita el punto y coma de `return "Bien";` y compila de nuevo con la orden del paso 2.
   2. En `Main.java`, cambia `Calificacion.calificar(nota)` por `Calificacion.califica(nota)` y compila.
   3. Compila bien, borra el fichero `out/endes/calificaciones/Calificacion.class` (en PowerShell o en la terminal de GNU/Linux y macOS, `rm out/endes/calificaciones/Calificacion.class`) y ejecuta el programa con la orden del paso 3. Después, vuelve a compilar.
   4. Ejecuta el programa sin el nombre del paquete: `java -cp out Main`.
7. Responde a las preguntas de la sección «Preguntas».

## Contrato de entrega

Respeta estos nombres y formatos: la corrección los busca exactamente aquí, se haga en clase, con la solución o con una rúbrica.

| Elemento | Debe ser |
|----------|----------|
| Código | `src/endes/calificaciones/Calificacion.java` y `Main.java`, sin cambios al terminar |
| Carpeta de *bytecode* | `out/`, con la estructura de carpetas del paquete |
| JAR | `calificaciones.jar`, con `endes.calificaciones.Main` como clase principal |
| README | Las secciones de la plantilla, en el mismo orden, con sus tablas |

## Comprueba tu solución

- La salida del programa tiene siete líneas: `Tabla de calificaciones` y una por nota, de `3.5 -> Insuficiente` a `11.0 -> Nota no válida`. `java -jar calificaciones.jar` muestra exactamente lo mismo.
- En `out/endes/calificaciones/` hay dos ficheros: `Calificacion.class` y `Main.class`. No hay ningún `.exe`: el *bytecode* no es código máquina de tu procesador.
- `jar --list` muestra `META-INF/MANIFEST.MF` y los dos `.class` dentro de `endes/calificaciones/`.
- Las primeras instrucciones de `calificar` son `dload_0`, `dconst_0`, `dcmpg` e `iflt`: cargan la nota y el 0, los comparan y saltan a devolver «Nota no válida» si la nota es menor que 0.
- Los errores 1 y 2 los detecta `javac`, y no se genera el `.class`. El 1 dice `';' expected` y el 2, `cannot find symbol`.
- Los errores 3 y 4 los detecta la JVM al ejecutar. En el 3, **sí** aparece la línea `Tabla de calificaciones` antes del error `NoClassDefFoundError`: la JVM no busca `Calificacion` hasta que la necesita. En el 4, el error es `Could not find or load main class Main`.

## Criterios de evaluación

- ✅ Compilas y ejecutas el programa desde la terminal e identificas los ficheros que se generan
- ✅ Lees el *bytecode* con `javap` y explicas qué hacen sus instrucciones
- ✅ Empaquetas el programa en un JAR ejecutable
- ✅ Clasificas cada error provocado y dices quién lo detecta
- ✅ Explicas el papel del *bytecode* y de la JVM al responder a las preguntas
