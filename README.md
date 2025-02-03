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


---