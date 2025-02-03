## Segundo Laboratorio de CVDS

**Objetivo:**  
El objetivo de este laboratorio es aprender como se utiliza **Maven** para proyectos

---

## HERRAMIENTA MAVEN

### Cuál es su mayor utilidad
La mayor utilidad de Maven es que ayuda a gestionar proyectos o dependecias de este mismo ya que puede manejar la compilacion, los informes y la documentacíon lo que ayuda en la mejorar el mantenimiento y reusabilidad.

### Fases de Maven
Las fases de compilación representan cada etapa de ciclo de vida en este caso se dividen en 7 que son:
 -**`Validate`**
    Valida que el proyecto este correctamente y toda su información este disponible

 -**`Compile`**
    Se encarga de compilar todo el codigo fuente del proyecto

 -**`test`**
    Este se hace para probar el codigo fuente haciendo uso de las pruebas unitarias pero hay que tener en cuenta que las pruebas no deden estar empaquetadas

 -**`Package`**
    Se apropia de codigo compilado y empaquetado en su formato distribuible 

 -**`Verify`**
    Ejecuta cada fase del ciclo de vidapara comprabar los resultados de las pruebas de integración que garanticen que cumpla con los criterios de calidad

 -**`install`**
    Instalar el paquete en el repositorio local para utilizarlo como  dependencias en otros proyectos locales   

 -**`Validate`**
    Se encarga de Copiar el paquete final al repositorio remoto para compartirlo con otros desarrolladores   

### Ciclo de vida de la construcción
 -**`Clean`**
    Se encarga de limpiar la compilación del proyecto.

 -**`Default`**
    Controla el proceso de construcción del proyecto.

 -**`Site`**
    Se encarga de comprobar la creacion de la documentación del proyecto.

### Para qué sirven los plugins
 Los plugin son componentes que realizan una tarea durante un proceso de construcción por ejemplo
 -Compilar el codigo
 -Crear un archivo Jar
 -Generar la documentación de un proyecto
Es decir que son una pieza de software que permite a otro sistema informatico realizar acciones que no están incluidas en el código.

### Qué es y para qué sirve el repositorio central de maven
El repositorio cebtral de Maven se usa para el almacenamiento de bibliotecas Java,Complementos y otros artefactos de la construcción de un proyecto una pequeña observación es que los repositorios pueden ser locales o remotos y se diferencian en:
 - El local es un directorio en la computadora donde se ejecuta Maven. Almacena en caché las descargas remotas y contiene artefactos de compilación temporales que aún no ha publicado.
 - El remoto hace referencia a cualquier otro tipo de repositorio al que se accede mediante una variedad de protocolos, como file://y https://.


## CREAR UN PROYECTO CON MAVEN
Buscar cómo se crea un proyecto maven con ayuda de los arquetipos (archetypes) y buscar cómo ejecutar desde línea de comandos el objetivo "generate" del plugin "archetype", con los siguientes parámetros:

El arqueotipo es el siguiente:

 mvn archetypes:generate -DgroupId=edu.eci.cvds -DartifactId=Patterns -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.0 -Dpackage=edu.eci.cvds.patterns.archetype -DinteractiveMode=False

![Texto](Imagenes_README/conf_maven.png)

Para ver el conjunto de archivos y directorios creados por el comando mvn ejecute el comando tree.

![Texto](Imagenes_README/tree.png)


---