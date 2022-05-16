package chivita;

import java.util.ArrayList;
import java.util.Collection;

public class Proximo {
    
    /**
     * Nombre del animal que se está llamando actualmente para sacar al asignado
     * en la key del map aQuienHayQueLlamar
     */

    private String proximoActual;
    /**
     * Esta lista representan todos los animales que pueden fueron llamados
     * para sacar al animal asignado en la key del map aQuienHayQueLlamar
     * 
     */
    private ArrayList<String> proximos;
    /**
     * Representa el indice del animal en la lista de proximos para poder llamarlo
     * a sacar al animal asignado en la key del map aQuienHayQueLlamar
     */
    private Integer indiceActual;

    public Proximo() {
        this.proximoActual = "";
        this.proximos = new ArrayList();
        this.indiceActual = 0;
    }

    public String getProximoActual() {
        return proximoActual;
    }

    public void setProximoActual(String proximoActual) {
        this.proximoActual = proximoActual;
    }

    public ArrayList<String> getProximoLista() {
        return proximos;
    }

    public void setProximoLista(ArrayList<String> proximoLista) {
        this.proximos = proximoLista;
    }

    public Integer getIndiceProximo() {
        return indiceActual;
    }

    public void setIndiceProximo(Integer indiceProximo) {
        this.indiceActual = indiceProximo;
    }

    /**
     * Agrega el nombre del animal actual, obtenido de forma aleotaria, a la
     * lista de proximos
     */
    public void agregarProximoActualALaLista() {
        this.proximos.add(this.proximoActual);
    }

    /**
     * Busca el siguiente animal de la lista de proximos utilizando el
     * indiceActual y luego actualiza el indiceActual al siguiente valor.
     *
     * @return Nombre del animal actual;
     */
    public String llamarAlProximoDeLaLista() {
        this.proximoActual = this.proximos.get(this.indiceActual);
        this.indiceActual++;
        return this.proximoActual;
    }

    /**
     * Reinicia el indiceActual a 0 a toda una Colección de Proximo que es
     * pasada como parámetro
     *
     * @param proximos
     */
    public static void reiniciarIndiceActualACero(Collection<Proximo> proximos) {
        proximos.forEach(proximo -> proximo.setIndiceProximo(0));
    }

}
