# Programacion2

Carlos Mariño
Joaquin Romero
Lauraro Gorostordoy

Bloque 1: Pilas (LIFO - Last In, First Out)

1-Se apilan URLs visitadas. Al presionar “Atrás” → Desapilar() retorna la última URL (LIFO)

2-Se apila el estado previo del sistema en cada modificación. Desapilar() restaura el estado anterior

3-Se emplea una pila para almacenar símbolos de apertura “(” mediante Apilar() cada vez que aparecen. Al encontrar un “)”, se verifica que la pila no esté vacía y se realiza Desapilar() para validar correspondencia

4-El string se recorre secuencialmente apilando cada carácter con Apilar(). Posteriormente, al aplicar Desapilar() de manera iterativa, los caracteres se obtienen en orden inverso, construyendo así el string invertido gracias a la propiedad LIFO de la estructura

5-Cada invocación de función genera un registro de activación que se inserta en la pila mediante Apilar(), quedando en el Tope() la función actualmente en ejecución; por ejemplo, si Main() llama a CalcularPromedio() y esta a Sumar(), durante la ejecución de esta última, Sumar() se encuentra en el tope de la pila

6-Se modela mediante una pila de rutas donde cada acceso a un nuevo directorio implica Apilar(rutaActual). Al ejecutar la acción de “subir un nivel”, se realiza Desapilar() para eliminar la ruta actual y retornar a la inmediatamente anterior

Bloque 2: Colas y Colas con Prioridad (FIFO + Ranking)

1-Se modela como una cola FIFO, donde cada cliente se inserta mediante Acolar() respetando el orden de llegada, y la atención se realiza con Desacolar(), garantizando que el primer cliente en ingresar sea el primero en ser atendido, sin criterios adicionales de prioridad

2-Se utiliza una cola FIFO donde cada archivo enviado se agrega con Acolar() y se procesa en orden de llegada mediante Desacolar(), asegurando que los trabajos se impriman en la misma secuencia en que fueron recibidos

3-Se implementa una cola de prioridad, donde cada paciente es insertado mediante AcolarPrioridad() asignando un valor numérico según la gravedad (por ejemplo: leve = 10, moderado = 50, crítico = 100), y la atención se realiza con Desacolar() priorizando siempre el mayor valor, independientemente del orden de llegada

4-Se modela con una cola de prioridad, donde los alumnos promocionados tienen mayor prioridad (por ejemplo, 10) que los regulares (por ejemplo, 5), por lo que al ejecutar Desacolar() se atiende primero al de mayor prioridad aunque haya llegado más tarde

5-Se utiliza una cola FIFO, donde cada cliente se inserta con Acolar() al final de la estructura, impidiendo inserciones intermedias y asegurando que el orden de atención respete estrictamente el orden de llegada

6-Se modela como una cola de prioridad, donde los procesos del sistema tienen mayor prioridad (por ejemplo, 50) que los de usuario (por ejemplo, 10); el planificador ejecuta primero los de mayor prioridad, pudiendo generar fenómenos como starvation en procesos de baja prioridad bajo alta carga

7-Se implementa como una cola de prioridad, donde los pasajeros se agrupan por niveles de prioridad (movilidad reducida, business, economy) y, en caso de igualdad de prioridad, se respeta un comportamiento FIFO entre los elementos del mismo nivel

8-Se utiliza una cola de prioridad, donde incidentes críticos como la caída de un servidor reciben valores extremadamente altos (por ejemplo, 999), mientras que problemas menores reciben valores bajos (por ejemplo, 0), garantizando que Desacolar() atienda primero los casos más urgentes

Bloque 3: Conjuntos (Sin Duplicados)

1-Se modela mediante un conjunto de legajos, donde antes de permitir el voto se verifica con Pertenece(legajo) si el alumno ya participó; si el elemento ya existe, se rechaza la operación, evitando duplicaciones y garantizando unicidad

2-Al intentar Agregar() un elemento ya existente en el conjunto, la operación no produce cambios, ya que los conjuntos no admiten duplicados, por lo tanto el tamaño del conjunto permanece invariante

3-Se utiliza un conjunto de palabras prohibidas, donde para cada palabra del mensaje entrante se evalúa Pertenece(palabra); si alguna pertenece al conjunto, el correo se clasifica como spam

4-Se modela con un conjunto de etiquetas, ya que no se requiere orden y se evita la duplicación de tags; a diferencia de una pila, no interesa la secuencia de inserción sino la unicidad de los elementos

5-Se implementa mediante un conjunto, donde cada legajo se almacena una única vez; si un alumno se registra en múltiples contextos, el sistema verifica con Pertenece() antes de Agregar(), evitando la duplicación de identificadores

6-La operación Elegir() retorna un elemento arbitrario sin eliminarlo del conjunto, por lo que invocaciones consecutivas pueden devolver el mismo valor; en cambio, Sacar() elimina efectivamente el elemento seleccionado modificando el estado del conjunto

Bloque 4: Diccionarios Simples y Múltiples (Clave-Valor)

1-Se modela mediante un diccionario simple, donde cada entrada asocia una clave única [Nombre] con un único valor [Teléfono], utilizando operaciones como Agregar(), Eliminar() y Recuperar(), garantizando que no existan claves duplicadas

2-Se implementa como un diccionario múltiple, donde cada clave [Palabra] se asocia a un conjunto de valores [Sinónimos], permitiendo múltiples asociaciones por clave y evitando duplicados dentro del conjunto

3-Se modela con un diccionario simple, donde la clave es [Usuario] y el valor es [Puntaje máximo], asegurando una única asociación por jugador y permitiendo actualización del valor ante nuevos récords

4-Se recomienda un diccionario múltiple, ya que una misma clave [Palabra] puede mapear a múltiples valores [Traducciones] dependiendo del contexto, permitiendo almacenar todas las interpretaciones posibles

5-Se implementa como un diccionario múltiple, donde la clave es [Término] y el valor es un conjunto de [Páginas], permitiendo múltiples referencias para una misma entrada sin duplicación

6-Se modela con un diccionario múltiple, donde la clave [Legajo] se asocia a un conjunto de [Materias], representando la relación uno a muchos entre alumno y cursadas

7-Se implementa como un diccionario simple, donde la clave es [Dominio] y el valor es [Dirección IP], permitiendo resolver de manera eficiente nombres de dominio a direcciones numéricas

8-Se modela como un diccionario simple, donde la clave [Orden ID] se asocia a un valor [Script de resolución], permitiendo recuperar automáticamente la lógica correspondiente a cada caso

Bloque 5: Mix de Modelado y Estrategias de Implementación

1-El sistema se modela combinando dos TDAs: una cola de prioridad para la atención de pacientes mediante AcolarPrioridad() y Desacolar(), donde se prioriza según gravedad, y una pila asociada a cada paciente para gestionar su historial de síntomas mediante Apilar() y Desapilar(), permitiendo acceder rápidamente al último síntoma registrado

2-Se implementa mediante un diccionario múltiple, donde la clave es [Carrera] y el valor es un conjunto de materias obligatorias, garantizando unicidad de materias y permitiendo recuperar todas las correlativas asociadas a cada carrera mediante Recuperar()

3-Existen tres enfoques con arreglos: (1) arreglo + contador, donde el índice apunta a la próxima posición libre permitiendo Apilar() y Desapilar() en tiempo O(1); (2) arreglo con desplazamiento, donde el tope está en la posición 0 y cada inserción requiere desplazar elementos, incrementando el costo; y (3) arreglo con tamaño en posición 0, donde se almacena la cantidad de elementos en el índice inicial, permitiendo calcular dinámicamente la posición del tope

4-La estrategia 2 (arreglo con desplazamiento) es la más ineficiente, ya que cada operación Apilar() implica desplazar todos los elementos existentes una posición, lo que genera una complejidad temporal O(n), a diferencia de las otras estrategias que operan en O(1) para inserción y eliminación
