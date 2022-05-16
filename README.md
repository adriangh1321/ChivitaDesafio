# CHIVITA DESAFIO
Desafío desarrollado para una oferta laboral

# DESCRIPCIÓN DEL PROGRAMA: 
Este programa es una version ampliada y
randomizada de la canción infantil "Sal de ahí chivita". Imprime en
pantalla las lineas de dicha canción de manera que el orden de cada uno
de los animales es seleccionado de forma aleotaria. La lista de 100
animales diferentes puede verse en el enum Animales. El programa cuenta
con una variable 'tiempo' como contador númerico que se actualiza sumando
1 cada vez que se imprime por pantalla una linea, de esta forma como cada
linea toma 1 milisegundo entonces el valor final de la variable
representa el tiempo total necesario.

# MODO DE USO:
Ingrese el valor de repeticiones que la canción realizará
en la variable ``private static final Integer N`` dentro de ``src\chivita\Chivita.class`` y ejecute el programa. Al finalizar podra ver en
consola el tiempo total necesario que tomó imprimir las lineas de la
canción (suponiendo que cada linea demora 1 milisegundo) Pruebe los valores de N a continuación y deberá obtener los siguiente tiempos:
| N    | Tiempo |
| ---- | -------|
| 1    | 4      |
| 10   | 76     |
| 50   | 1376   |
| 200  |20501   |
