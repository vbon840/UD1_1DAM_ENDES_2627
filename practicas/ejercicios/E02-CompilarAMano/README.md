# Compilar, ejecutar y empaquetar a mano

<!-- Completa cada sección. Borra los comentarios como este cuando termines.
     Respeta el formato de las tablas: así podrás compararlas con la solución. -->

## Versiones

<!-- Primera línea de «java -version» y de «javac -version». -->

```text

```

## Compilar

<!-- Ficheros que ha creado javac, con su ruta (por ejemplo, out/endes/…/Algo.class). -->

| Fichero creado | Qué contiene |
|----------------|--------------|
| | |

## Ejecutar

<!-- Salida de «java -cp out endes.calificaciones.Main». -->

```text

```

## El *bytecode*

<!-- Instrucciones de «calificar» de la 0 a la 16, tal como las muestra javap. -->

```text

```

Explicación:

<!-- Qué hacen esas instrucciones, paso a paso, y en qué se parecen y en qué se diferencian
     del ensamblador del tema 2. -->

## Empaquetar

<!-- Salida de «jar --list --file calificaciones.jar». -->

```text

```

¿Coincide la salida de `java -jar calificaciones.jar` con la del apartado «Ejecutar»?

## Errores provocados

<!-- «Tipo»: de compilación sintáctico, de compilación semántico o de ejecución.
     «Lo detecta»: javac o la JVM. -->

| # | Cambio | Primera línea del mensaje | Tipo | Lo detecta |
|---|--------|---------------------------|------|------------|
| 1 | Sin `;` en `return "Bien"` | | | |
| 2 | `califica` en lugar de `calificar` | | | |
| 3 | Sin `Calificacion.class` | | | |
| 4 | `java -cp out Main` | | | |

## Preguntas

1. En este ejercicio, ¿qué es el código fuente, qué hace el papel de código objeto y cuál es el «ejecutable»? ¿Lo puede ejecutar directamente el procesador?

   <!-- Tu respuesta -->

2. En el error 3, ¿por qué aparece `Tabla de calificaciones` antes del error?

   <!-- Tu respuesta -->

3. Si le pasas `calificaciones.jar` a alguien con otro sistema operativo, ¿le funcionará? ¿Qué necesita tener instalado?

   <!-- Tu respuesta -->

4. ¿Por qué los errores 1 y 2 no llegan a ejecutarse y los errores 3 y 4 sí?

   <!-- Tu respuesta -->
