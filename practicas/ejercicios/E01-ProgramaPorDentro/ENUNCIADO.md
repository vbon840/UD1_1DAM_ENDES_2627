# E01 · Un programa por dentro

Ejecuta un programa Java que ya está hecho y sigue qué componentes del sistema (procesador, memoria, periféricos y sistema operativo) intervienen en cada paso.

**CE:** RA1 a

## Entorno de trabajo

Solo necesitas el **JDK que usas en Programación** (versión 17 o posterior; no instales otro) y la **terminal** (en Windows, PowerShell). Si tienes dudas sobre el JDK, mira el apartado «Antes de empezar» del [índice de ejercicios](../../03-ejercicios.md).

Abre la terminal en la carpeta de este ejercicio, la que contiene `Media.java`, y comprueba la versión de Java:

```bash
java -version
```

Debe ser la 17 o posterior: es el JDK que usas en Programación. El programa se ejecuta con `java Media.java`: desde Java 11, la orden `java` compila el fichero en memoria y lo ejecuta, sin generar ningún `.class` (tema 1, apartado 1.5).

**No tienes que programar**: `Media.java` ya está hecho y comentado. Lee el código antes de empezar; aunque todavía no sepas Java, los comentarios te dicen qué hace cada parte.

## Requisitos

1. Ejecuta el programa, pide **4** notas y escribe `6`, `8`, `9` y `5`. Copia lo que aparece en la terminal en la sección «Salida del programa» del `README.md`.
2. Ejecuta el programa otra vez y, cuando pregunte `¿Cuántas notas?`, **no escribas nada**. Con el programa esperando, abre el administrador de procesos de tu sistema:
   - Windows: **Administrador de tareas** (`Ctrl` + `Mayús` + `Esc`), pestaña **Detalles**.
   - macOS: **Monitor de Actividad** (en Aplicaciones, Utilidades).
   - GNU/Linux: el **Monitor del sistema** de tu escritorio, o la orden `ps aux | grep Media` en otra terminal.

   Localiza el proceso de Java que ejecuta el programa y rellena la tabla de la sección «El proceso». Haz una captura en la que se vea el proceso y guárdala como `img/proceso.png`. Después vuelve a la terminal, escribe `1` y una nota para que termine.
3. Completa la tabla de la sección «Componentes en cada paso»: para cada paso del programa, qué ocurre, qué componentes intervienen y en qué zona de memoria se guarda lo que se crea (tema 1, apartados 1.4 y 1.5).
4. Ejecuta el programa limitando el montículo a 64 MB y pide cien millones de notas:

   ```bash
   java -Xmx64m Media.java
   ```

   Escribe `100000000` cuando pregunte la cantidad. Copia las dos primeras líneas del error en la sección «Cuando se acaba la memoria» y explica qué ha pasado.
5. Responde a las preguntas de la sección «Preguntas».

## Contrato de entrega

Respeta estos nombres y formatos: la corrección los busca exactamente aquí, se haga en clase, con la solución o con una rúbrica.

| Elemento | Debe ser |
|----------|----------|
| README | Las secciones de la plantilla, en el mismo orden, con sus tablas |
| Salida del programa | Un bloque de código con lo que aparece en la terminal, sin cambiar nada |
| Componentes en cada paso | Las nueve filas de la plantilla, sin quitar ninguna |
| Captura | `img/proceso.png`, con el proceso de Java visible |

## Comprueba tu solución

- La salida del requisito 1 termina con la línea `Media: 7.0`. (Si sale otra media, revisa las notas que has escrito.)
- En el administrador de procesos, el proceso de Java usa **casi 0 % de procesador** mientras espera: está **bloqueado** esperando el teclado. En cambio, sí ocupa memoria (decenas de megabytes, que son sobre todo de la JVM).
- En tu tabla, los objetos creados con `new` (el `Scanner` y el array `notas`) están en el **montículo**, y las variables `cantidad`, `notas`, `media`, `suma` y `nota` están en la **pila**, en la trama de su método. La variable `notas` está en la pila, aunque el array al que apunta esté en el montículo.
- La llamada a `calcularMedia` crea una **trama nueva** en la pila, que desaparece al devolver la media.
- Las líneas que muestran texto y las que leen del teclado pasan por el **sistema operativo** (llamadas al sistema y controladores).
- El error del requisito 4 es `java.lang.OutOfMemoryError: Java heap space`, en la línea que crea el array (`new int[cantidad]`): cien millones de enteros ocupan unos 400 MB y el montículo solo tiene 64 MB.

## Criterios de evaluación

- ✅ Ejecutas el programa y copias su salida sin cambios
- ✅ Localizas el proceso de Java y explicas su estado mientras espera el teclado
- ✅ Relacionas cada paso del programa con los componentes que intervienen y con su zona de memoria
- ✅ Explicas el error de memoria agotada y respondes a las preguntas sobre la pila, los procesos y el sistema operativo
