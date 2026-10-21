# E07 · Radiografía de un proyecto de software libre (integrador)

Analiza un proyecto Java de software libre a partir de su repositorio en GitHub: qué es y cómo usa el sistema, en qué lenguajes está escrito, cómo se obtiene el ejecutable, qué fases del desarrollo se ven, si sigue prácticas ágiles y qué herramientas usa. Cada afirmación tiene que ir acompañada de un **enlace** que la demuestre. Junta todo lo visto en la unidad.

**CE:** RA1 a, b, c, d, e, f, g

## Entorno de trabajo

Solo necesitas un navegador y tu cuenta de GitHub. **No tienes que descargar ni ejecutar el proyecto**: todo se ve en la web de su repositorio.

Escribe tus respuestas en el `README.md` de esta carpeta. Si el profesor te pide entregarlo en GitHub Classroom, sigue el apartado «Entregar en GitHub» del [índice de ejercicios](../../03-ejercicios.md): todavía no has visto Git (UD3), así que se trabaja en la web de GitHub.

Las secciones del README se escriben en Markdown. Para ver cómo queda, usa la pestaña **Preview** (vista previa) del editor.

## El proyecto

Elige **uno** de estos proyectos. Todos son proyectos Java activos, de tamaño razonable, con pruebas, integración continua y un historial público:

| Proyecto | Repositorio | Qué es |
|----------|-------------|--------|
| jsoup | <https://github.com/jhy/jsoup> | Biblioteca para leer, analizar y modificar páginas HTML |
| Apache Commons Lang | <https://github.com/apache/commons-lang> | Biblioteca de utilidades para cadenas, números, fechas y objetos |
| JUnit | <https://github.com/junit-team/junit-framework> | El marco de pruebas de Java que usarás en la UD4 |
| Mockito | <https://github.com/mockito/mockito> | Biblioteca para crear dobles de prueba (UD4) |
| Checkstyle | <https://github.com/checkstyle/checkstyle> | Herramienta que revisa el estilo del código Java (UD5) |
| Spring PetClinic | <https://github.com/spring-projects/spring-petclinic> | Aplicación web de ejemplo para gestionar una clínica veterinaria |

Algunos datos están fuera de GitHub: Apache Commons Lang registra sus incidencias en el sistema de la fundación Apache (lo enlaza su README), y muchos proyectos tienen la documentación en su propia web. Puedes usar esas fuentes oficiales como evidencia.

## Requisitos

Completa el `README.md` siguiendo los comentarios de la plantilla. En todas las secciones, **cada afirmación sobre el proyecto lleva un enlace** a lo que la demuestra: un fichero del repositorio, una incidencia, un *pull request*, una versión publicada o una página de la documentación oficial. Usa enlaces a la página concreta, no a la portada del repositorio.

1. **Proyecto analizado.** Nombre, repositorio, licencia, la última versión publicada (con su fecha) y la fecha de consulta.
2. **El programa y el sistema** (tema 1). Qué tipo de software es (de sistema, de desarrollo o de aplicación) y qué tipo de aplicación o biblioteca, si es multiplataforma y por qué, y al menos **dos recursos del sistema** que usa (memoria, ficheros, red, procesador…), con el código o la documentación que lo demuestra.
3. **Lenguajes** (tema 2). Los lenguajes del repositorio según GitHub (en la portada del repositorio, a la derecha, apartado **Languages**) y para qué se usa cada uno en el proyecto. La clasificación del lenguaje principal: nivel, generación, paradigma, tipado y forma de ejecución.
4. **Del código al ejecutable** (tema 3). Con qué herramienta se construye y en qué fichero se configura, qué versión mínima de Java exige, qué se distribuye y dónde, y el camino completo desde el código fuente hasta que el programa se ejecuta en el ordenador de quien lo usa. Por qué el mismo fichero funciona en Windows, GNU/Linux y macOS.
5. **Fases del desarrollo** (tema 4). Para cada una de las siete fases, una evidencia en el repositorio o en la web oficial del proyecto y qué muestra. Un cambio de mantenimiento concreto, clasificado según su tipo.
6. **Metodología** (tema 5). Las evidencias de prácticas ágiles que encuentres (entregas frecuentes, revisión de los cambios, integración continua, planificación visible, participación de los usuarios) y tu conclusión: ¿sigue prácticas ágiles? ¿A qué metodología se parece más? ¿Encaja con este tipo de proyecto?
7. **Herramientas** (tema 6). Al menos **seis** herramientas que usa el proyecto, con su fase, para qué las usa y el fichero que lo demuestra. La evaluación de una de ellas con tres criterios del tema 6 y datos con fecha.
8. **Conclusión.** Lo que te ha enseñado este análisis sobre cómo se desarrolla el software de verdad, en tres a cinco líneas.

## Contrato de entrega

La corrección busca estos elementos exactamente aquí. **Respétalos**:

| Elemento | Debe ser |
|----------|----------|
| Fichero | `README.md` en la raíz del repositorio de la tarea; las capturas, si añades alguna, en `img/` |
| Proyecto | Uno de los seis de la lista |
| Secciones del README | `## Proyecto analizado`, `## 1. El programa y el sistema`, `## 2. Lenguajes`, `## 3. Del código al ejecutable`, `## 4. Fases del desarrollo`, `## 5. Metodología`, `## 6. Herramientas` y `## Conclusión`, en este orden |
| Tablas | Las de la plantilla, con sus columnas; puedes añadir filas, pero no quitar columnas |
| Evidencias | Enlaces completos (`https://…`) a la página concreta, en la columna o la línea que indica la plantilla |
| Fechas | La fecha de consulta en «Proyecto analizado», y la fecha de cada versión que cites |

## Comprueba tu solución

- El README tiene las ocho secciones del contrato, en orden, y ninguna tabla tiene celdas vacías.
- Cada evidencia es un enlace completo (`https://…`) que lleva a una página concreta: abre todos los enlaces y comprueba que muestran lo que dices. Ninguno es la portada del repositorio.
- La «última versión publicada» no termina en `-SNAPSHOT`: esa es la versión en desarrollo, no una publicada.
- La licencia es la del proyecto (su fichero `LICENSE`), no la de una de sus dependencias.
- En «Del código al ejecutable» aparecen el *bytecode*, el JAR, la JVM y el JIT, y explicas por qué el mismo fichero funciona en cualquier sistema.
- Las siete fases tienen evidencias distintas, y el cambio de mantenimiento tiene su tipo y su porqué.
- Tu conclusión sobre la metodología solo afirma lo que muestran las evidencias de la tabla: si no hay sprints ni eventos, no es Scrum.
- Hay al menos seis herramientas de fases distintas, y la herramienta evaluada tiene tres criterios con datos fechados y su fuente.

## Criterios de evaluación

- ✅ Relacionas el proyecto con el sistema: tipo de software, plataformas y recursos que usa, con evidencias
- ✅ Clasificas sus lenguajes con todos los criterios del tema 2
- ✅ Identificas el código fuente, lo que se compila y lo que se distribuye, con la herramienta que lo construye
- ✅ Explicas el papel del *bytecode* y de la JVM, y por qué el proyecto es multiplataforma
- ✅ Encuentras evidencias de las siete fases del desarrollo y clasificas un cambio de mantenimiento
- ✅ Identificas prácticas ágiles con evidencias y razonas tu conclusión
- ✅ Identificas al menos seis herramientas por su función y evalúas una con criterios y datos con fecha

La corrección **lee** tu README: comprueba que cada afirmación es correcta y que cada enlace apunta a lo que dices. Una afirmación sin enlace, o con un enlace a la portada del repositorio, cuenta como no demostrada.
