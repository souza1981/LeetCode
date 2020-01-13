package Alura.Conjuntos;

import java.util.LinkedList;

public class Conjunto {

    private LinkedList<LinkedList> tabela = new LinkedList<>();

    public Conjunto(){
        for (int i = 0; i < 26; i++) {
            tabela.add(new LinkedList());

        }
    }
    public void adiciona(String nome){

    }

    private int calculaIndiceDeTabela(String palavra){
        return palavra.toLowerCase().charAt(0) % 26;
    }
}
