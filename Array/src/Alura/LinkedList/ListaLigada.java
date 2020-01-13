package Alura.LinkedList;

public class ListaLigada {

    Celula primeira = null;
    private int totalDeElementos = 0;
    private Celula ultimo = null;

    public void adicionaNoComeco(Object elemento){
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        if (this.totalDeElementos == 0){
            this.ultimo = this.primeira;
        }

        this.totalDeElementos++;
    }

    @Override
    public String toString() {
        if (this.totalDeElementos == 0){
            return "[]";
        }
        Celula atual = primeira;

        StringBuilder build = new StringBuilder("[");
        for (int i = 0; i < totalDeElementos; i++) {
            build.append(atual.getElemento());
            build.append(",");
            atual = atual.getProxima();
        }
        build.append("]");
        return build.toString();
    }

    public void adiciona(Object elemento){
        if (this.totalDeElementos == 0){
            adicionaNoComeco(elemento);
        } else {
            Celula nova = new Celula(elemento,null);
            this.ultimo.setProximo(nova);
            this.ultimo = nova;
            this.totalDeElementos++;
        }
    }

    private Celula pegaCelula(int posicao){
        Celula atual = primeira;

        for (int i = 0; i < posicao; i++) {
            atual = atual.getProxima();
        }
        return atual;
    }


}
