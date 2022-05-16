package chivita;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author GUSTAVO ADRIÁN HERNÁNDEZ https://github.com/adriangh1321/ChivitaDesafio.git
 */

public class Chivita {

    /**
     * MODO DE USO: Ingrese el valor de repeticiones que la canción realizará
     * aquí en la variable N y ejecute el programa. Al finalizar podra ver en
     * consola el tiempo total necesario que tomó imprimir las lineas de la
     * canción (suponiendo que cada linea demora 1 milisegundo) Pruebe con N =
     * 1,10 ,50 y 200 debe obtener un tiempo = 4 ,76 ,1376 y 20501
     * respectivamente.
     *
     */
    private static final Integer N = 3;

    /**
     * DESCRIPCIÓN DEL PROGRAMA: Este programa es una version ampliada y
     * randomizada de la canción infantil "Sal de ahí chivita". Imprime en
     * pantalla las lineas de dicha canción de manera que el orden de cada uno
     * de los animales es seleccionado de forma aleotaria. La lista de 100
     * animales diferentes puede verse en el enum Animales. El programa cuenta
     * con una variable 'tiempo' como contador númerico que se actualiza sumando
     * 1 cada vez que se imprime por pantalla una linea, de esta forma como cada
     * linea toma 1 milisegundo entonces el valor final de la variable
     * representa el tiempo total necesario.
     *
     * @param args
     */
    public static void main(String[] args) {
        
        Integer tiempo = 0;

        Map<String, Proximo> aQuienHayQueLlamar = new HashMap();

        System.out.println("Sal de ahí chivita chivita, sal de ahí de ese lugar");
        tiempo++;
        String ahora = "la chiva";
        for (int i = 0; i < N; i++) {

            Proximo proximo = aQuienHayQueLlamar.containsKey(ahora) ? aQuienHayQueLlamar.get(ahora) : new Proximo();
            proximo.setProximoActual(Animales.obtenerAnimalRandom());
            proximo.agregarProximoActualALaLista();
            aQuienHayQueLlamar.put(ahora, proximo);
            System.out.println("Hay que llamar a " + proximo.getProximoActual() + " para que saque a " + ahora);
            tiempo++;
            ahora = proximo.getProximoActual();
            ArrayList<String> sacar = new ArrayList();
            String cursor = "la chiva";

            while (aQuienHayQueLlamar.containsKey(cursor) && sacar.size() <= i) {

                proximo = aQuienHayQueLlamar.get(cursor);
                sacar.add(0, proximo.llamarAlProximoDeLaLista() + " no quiere sacar a " + cursor);
                cursor = proximo.getProximoActual();

            }

            for (String linea : sacar) {
                System.out.println(linea);
                tiempo++;
            }

            Proximo.reiniciarIndiceActualACero(aQuienHayQueLlamar.values());

            System.out.println("La chiva no quiere salir de ahí. Sal de ahí chivita chivita, sal de ahí de ese lugar....\n");
            tiempo++;

        }

        System.out.println("///////// TIEMPO DE EJECUCIÓN: " + tiempo + " milisegundos ////////////");

    }

}
