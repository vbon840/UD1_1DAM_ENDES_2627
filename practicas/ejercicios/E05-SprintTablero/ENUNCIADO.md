# E05 · Un sprint en un tablero

Investiga una metodología ágil y resúmela en una ficha. Después, prepara el primer sprint del proyecto del Polideportivo Los Álamos: historias de usuario con sus criterios de aceptación, la pila del producto ordenada y un tablero en GitHub Projects.

**CE:** RA1 g

## Entorno de trabajo

Necesitas una **cuenta de GitHub** (la misma con la que entregas las tareas del curso) y un navegador. GitHub Projects se explica en el tema 5, apartado 5.9. La interfaz de GitHub está en inglés: el tema te da los nombres de cada opción y su traducción.

## El caso

Es el mismo proyecto del ejercicio E04. En resumen: el Ayuntamiento quiere una aplicación para que los vecinos reserven las pistas del **Polideportivo Municipal Los Álamos** (pádel, tenis y fútbol sala) desde el móvil o el ordenador, por tramos de una hora entre las 9:00 y las 22:00, con un máximo de dos reservas pendientes por persona y un precio reducido para las personas empadronadas. El personal del mostrador quiere ver la ocupación del día. El pago todavía no está decidido. El equipo trabajará con **Scrum**, en sprints de dos semanas, y puede terminar unos **8 puntos de historia por sprint**.

## Requisitos

1. **Ficha de una metodología.** Elige una: Scrum, Kanban, programación extrema (XP), Lean, Crystal, DSDM o FDD. Investígala en al menos **dos fuentes** y completa la tabla de la sección «Ficha de la metodología» del `README.md` con tus palabras. En «Fuentes», pon el título, el enlace y la fecha de consulta de cada una.
2. **Historias de usuario.** Escribe **cinco** historias de usuario del caso con la plantilla «Como…, quiero…, para…» (tema 5, apartado 5.7.1). Cada una con:
   - una **estimación** en puntos de historia: 1, 2, 3, 5 u 8;
   - al menos **dos criterios de aceptación** con el formato Dado, Cuando, Entonces: uno del caso normal y otro de un caso que falla o es límite (apartado 5.7.2).
3. **Pila del producto.** Ordena las cinco historias por valor para el Ayuntamiento y justifica el orden.
4. **Primer sprint.** Escribe el objetivo del sprint, elige las historias que caben en **8 puntos** empezando por arriba de la pila y escribe una definición de terminado con al menos tres condiciones.
5. **Tablero en GitHub Projects.** Crea un proyecto con la plantilla **Board** (tablero):
   1. Llámalo `Polideportivo Los Álamos - <tu usuario de GitHub>`.
   2. Añade un elemento por cada historia, con el título de la historia y, en la descripción, la historia completa y sus criterios de aceptación.
   3. Añade un campo numérico llamado `Puntos` y pon la estimación de cada historia.
   4. Fija un límite de **2** elementos en la columna **In Progress** (en curso).
   5. Simula el inicio del sprint: pasa una historia del sprint a **In Progress** y otra a **Done** (hecho); el resto se queda en **Todo** (pendiente).
   6. Haz el proyecto **público** desde su configuración (**Settings**).

   Pon el enlace al proyecto en la sección «Tablero» y una captura del tablero en `img/tablero.png`.
6. Responde a las preguntas de la sección «Preguntas».

## Contrato de entrega

Respeta estos nombres y formatos: la corrección los busca exactamente aquí, se haga en clase, con la solución o con una rúbrica.

| Elemento | Debe ser |
|----------|----------|
| README | Las secciones de la plantilla, en el mismo orden |
| Ficha | Las filas de la tabla de la plantilla, sin quitar ninguna; dos fuentes o más, con enlace y fecha de consulta |
| Historias | `H1` a `H5`, cada una con su historia, su estimación y sus criterios en bloques `text` |
| Pila del producto | Las cinco historias en orden, con sus puntos |
| Tablero | Proyecto público de GitHub Projects con la plantilla Board, el campo `Puntos` y el límite de 2 en **In Progress** |
| Captura | `img/tablero.png`, con las tres columnas y las cinco tarjetas visibles |

## Comprueba tu solución

- Cada historia tiene las tres partes: **quién** (un tipo de usuario del caso: vecino, persona del mostrador…), **qué** quiere y **para qué**. Si falta el «para…», no sabes qué valor aporta.
- Ninguna historia habla de cómo se programa («crear la tabla de reservas en la base de datos»): las historias se escriben desde el punto de vista del usuario.
- Cada historia tiene un escenario normal y uno que falla o es límite. Por ejemplo, para la regla de las dos reservas: qué pasa con una reserva pendiente y qué pasa al intentar la tercera.
- Ninguna historia cuesta más de 8 puntos: si una no cabe en un sprint, hay que dividirla.
- Las historias del primer sprint suman **8 puntos o menos** y son las primeras de la pila.
- El objetivo del sprint es una frase sobre el **valor** que se entrega («que los vecinos puedan…»), no una lista de tareas.
- Abre el enlace del tablero en una ventana privada del navegador (sin iniciar sesión): si lo ves, es público.
- La ficha explica con tus palabras **cuándo encaja** la metodología y **cuándo no**, y las fuentes tienen fecha.

## Criterios de evaluación

- ✅ Resumes una metodología ágil con tus palabras y con fuentes fechadas
- ✅ Escribes historias de usuario completas, estimadas y con criterios de aceptación
- ✅ Ordenas la pila del producto y preparas el primer sprint
- ✅ Creas el tablero en GitHub Projects y respondes a las preguntas
