> [!IMPORTANT]
> NOTA: Agregado sistema de persistencia de datos básico y roles por usuario (Estudiante/Profesor).

# Respuesta a preguntas de sección 15:
1. ¿Qué ventaja tiene organizar el proyecto en paquetes?<br>
R// Permite ordenar el programa según responsabilidades, usando la arquitectura MVC.

2. ¿Qué problema podría surgir si toda la lógica estuviera en la clase Main?<br>
R// El programa sería más difícil de comprender y replicar, tendría un alto acoplamiento y si se llega a romper será un infierno arreglarlo.

3. ¿Qué diferencia existe entre una clase del modelo y una clase controladora?<br>
R// El controlador es el puente de comunicación entre la vista y el modelo, mientras que este último tiene los datos y reglas del programa.

4. ¿Qué diferencia existe entre asociación y dependencia?<br>
R// La diferencia es el tiempo de relación entre clases, la dependencia es temporal mientras que la asociación es estable.

5. ¿Por qué Prestamo debe ser una clase independiente?<br>
R// Porque tiene atributos propios que no coinciden ni con Libro ni con Usuario por sí solos, atributos como la fecha de devolución.

6. ¿Qué regla impide prestar dos veces el mismo libro?<br>
R// En el punto 5.3 del pdf está la regla del negocio 4 "Al registrar un préstamo, el libro queda no disponible."

7. ¿Qué clase debería encargarse de mostrar mensajes al usuario?<br>
R// Clase BibliotecaVista.

8. ¿Qué clase debería encargarse de modificar el estado de un libro?<br>
R// Clase Libro.

9. ¿Qué cambios serían necesarios para agregar persistencia en archivos?<br>
R// Agregar lógica de manejo de archivos y serialización básica.

10. ¿Qué cambios serían necesarios para transformar este sistema en una aplicación con interfaz gráfica?<br>
R// Hay que cambiar la clase BibliotecaVista por una interfaz gráfica y la clase BibliotecaController para que pueda recibir clics de botones, abrir popups, etc.

11. ¿Por qué la vista no debería acceder directamente a las listas internas de Biblioteca?<br>
R// No debe acceder a las listas internas porque rompe el encapsulamiento, su unica responsabilidad debe ser interactuar con el usuario.

12. ¿Qué ventajas tiene que Biblioteca retorne copias de sus listas?<br>
R// Sirve para evitar que otras clases cambien elementos de la colección original, obligando a que el flujo de trabajo pase por las reglas de validación de la clase Biblioteca.

---
El repositorio original de este proyecto se puede encontrar en [samuelsepulveda/mini_caso](https://github.com/samuelsepulveda/mini_caso).
