# E04 · Las fases de un proyecto

A partir de la descripción de un proyecto real, identifica sus requisitos, lo que se haría en cada fase del desarrollo y lo que saldría de ella, elige un modelo de ciclo de vida y resume todo en un mapa mental.

**CE:** RA1 b

## El caso: reservas del Polideportivo Los Álamos

El Ayuntamiento de una localidad mediana gestiona el **Polideportivo Municipal Los Álamos**, con cuatro pistas de pádel, dos de tenis y una de fútbol sala. Hoy las reservas se hacen por teléfono o en el mostrador y se apuntan en una hoja de cálculo. Hay reservas duplicadas, y mucha gente reserva y luego no aparece.

El Ayuntamiento quiere una aplicación para que los vecinos reserven las pistas desde el móvil o el ordenador, y para que el personal del polideportivo vea la ocupación del día. Esto es lo que se sabe:

- Las pistas se reservan por tramos de una hora, de 9:00 a 22:00. Cada persona puede tener, como mucho, dos reservas pendientes.
- Las personas empadronadas en la localidad pagan un precio reducido; el resto, el precio general.
- El concejal de Deportes quiere que la aplicación funcione dentro de cuatro meses, para la temporada de verano, aunque sea solo con lo básico.
- Todavía no se sabe si el pago se hará en la aplicación o en el mostrador: depende de un contrato con un banco que se negociará durante el proyecto.
- El personal del polideportivo no está acostumbrado a usar aplicaciones y quiere ver cómo será antes de decidir nada.
- La aplicación guardará datos personales (nombre, DNI y teléfono) y debe cumplir la normativa de protección de datos.
- La desarrollará un equipo de tres personas de la empresa municipal de informática.

## Requisitos

1. Escribe en la sección «Requisitos» del `README.md` al menos **cinco requisitos funcionales** y **tres no funcionales** del caso. Cada requisito tiene que poder **comprobarse**: indica cómo se comprobaría (tema 4, apartado 4.2.1).
2. Completa la tabla de la sección «Fases»: para cada una de las siete fases, al menos **dos actividades concretas** de este proyecto (no las del tema en general) y el **resultado** que saldría de ella.
3. Clasifica en la sección «Mantenimiento» las cuatro situaciones de la tabla según su tipo de mantenimiento, y justifica cada una.
4. Elige en la sección «Modelo de ciclo de vida» el modelo (o la combinación de modelos) que usarías. Justifícalo con al menos **tres características del caso** y explica por qué descartas otros **dos** modelos.
5. Haz en la sección «Mapa mental» un mapa mental del ciclo de vida del software en **Mermaid**, con el tipo `mindmap` (tema 7). Debe tener un nodo central y tres ramas: las **fases** (cada una con al menos un resultado), los **modelos de ciclo de vida** (cada uno con su idea clave) y los **tipos de mantenimiento**.
6. Responde a las preguntas de la sección «Preguntas».

GitHub dibuja los bloques `mermaid` del README. Para ver el mapa mientras lo escribes, pega el código en el editor en línea de Mermaid ([mermaid.live](https://mermaid.live)).

## Contrato de entrega

Respeta estos nombres y formatos: la corrección los busca exactamente aquí, se haga en clase, con la solución o con una rúbrica.

| Elemento | Debe ser |
|----------|----------|
| README | Las secciones de la plantilla, en el mismo orden, con sus tablas |
| Requisitos | Identificadores `RF1`, `RF2`… para los funcionales y `RNF1`, `RNF2`… para los no funcionales |
| Fases | Las siete filas de la plantilla, en orden |
| Mantenimiento | `Correctivo`, `Adaptativo`, `Perfectivo` o `Preventivo` en la columna «Tipo» |
| Mapa mental | Un bloque de código `mermaid` que empieza por `mindmap` |

## Comprueba tu solución

- Ningún requisito usa palabras que no se pueden comprobar, como «rápido», «fácil» o «bonito», sin un número o una condición. Por ejemplo, «la aplicación es rápida» no vale; «la lista de pistas libres aparece en menos de 2 segundos» sí.
- Los requisitos no funcionales hablan de **cómo** es el sistema (rendimiento, seguridad, usabilidad, plataformas, normativa), no de **qué** hace.
- Las dos reglas del caso (dos reservas pendientes por persona y el precio para empadronados) aparecen como requisitos funcionales.
- Cada fase tiene un resultado distinto. El de las pruebas no puede ser «que funcione»: es un plan, unos casos o un informe de pruebas.
- Las cuatro situaciones de mantenimiento son de cuatro tipos distintos.
- El modelo elegido tiene en cuenta el pago sin decidir, el plazo con «lo básico» y que el personal quiere ver la aplicación antes. Si eliges el modelo en cascada, revisa: el caso tiene requisitos que van a cambiar.
- El mapa mental se ve como un diagrama al abrir el README en GitHub (o en mermaid.live), no como texto.

## Criterios de evaluación

- ✅ Escribes requisitos funcionales y no funcionales del caso que se pueden comprobar
- ✅ Describes las actividades concretas y el resultado de cada fase
- ✅ Clasificas bien las cuatro situaciones de mantenimiento
- ✅ Eliges y justificas un modelo de ciclo de vida con las características del caso
- ✅ Resumes el ciclo de vida en un mapa mental en Mermaid
