package Alura.LinkedList;

public class Celula {

    private Object elemento;

    public Object getElemento() {
        return elemento;
    }

    public Celula getProxima() {
        return proxima;
    }

    private Celula proxima;


    public Celula(Object elemento, Celula proxima) {
        this.elemento = elemento;
        this.proxima = proxima;
    }


    public void setProximo(Celula nova) {
        this.proxima = nova;
    }
}
