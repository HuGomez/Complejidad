**Si deseas ver esta información un poco menos aburrida, visita http://hugomez.github.com/Complejidad/ Si no es así, puedes continuar leyendo :D

##Complejidad

Para calcular la complejidad algorítmica se tienen en cuenta ciertos factores como el lenguaje, la máquina y el algoritmo utilizados. Para lo anterior se piden ciertas pruebas con una cantidad determinada de entradas, implementando los siguientes algoritmos:

1. Bubble Sort.
2. Insertion Sort.
3. Heap Sort.
4. Quick Sort.
5. Counting Sort.

##Análisis

**Eficiencia de Tiempo**

Para cada una de los algoritmos se deberá calcular la complejidad temporal (el tiempo de ejecución). Luego se debe ejecutar cada algoritmo implementado con diferentes tamaños de entradas, tomando las medidas de tiempo de ejecución para cada uno. Esto implicará generar un número grande de ejemplos de prueba, al azar y guardarlos en un archivo, para poder probar todas los algoritmos de ordenamiento con los mismos datos
de entrada. El análisis debe estar contenido en una tabla donde, para cada algoritmo, se tomen muestras de diferentes tamaños (unas dos o tres muestras por cada n).

**Números a ordenar**

Este proyecto está destinado a ordenar números enteros sin signo generados aleatoriamente entre 0 (cero) y 6’000.000 (seis millones).

**Tamaños de las entradas para todos los algoritmos**

Todos los algoritmos de ordenamiento se tienen que probar con entradas de tamaño:

Para algoritmos de complejidad Θ(n^2): 20.000, 40.000, 60.000, 80.000, ... , 300.000.

Para el resto de algoritmos: 100.000, 200.000, 300.000, 400.000, ... , 1’500.000.

El tiempo se debe medir en milisegundos (ms).

**Inferir tiempos de ejecución esperados**

Con los factores constantes calculados, estimar el tiempo de ejecución para entradas de tamaño:

Para algoritmos de complejidad Θ(n^2): 30.000, 50.000, 70.000, 90.000, ... , 310.000.

Para el resto de algoritmos: 150.000, 250.000, 350.000, 450.000, ... , 1’550.000.

Luego se debe correr el algoritmo con estas tallas y tomar el tiempo real de ejecución. La comparación entre los tiempos estimados y los tiempos reales de ejecución debe ser parte del informe.

Luego se debe estimar cuanto tiempo les tomaría a los algorimos ordenar arreglos de tamaño: 30’000.000, 40’000.000, 60’000.000, ... , 200’000.000.

##Autores
Hugo Andrés Gómez @cauchoroto | Douglas Hernández @fullarukad