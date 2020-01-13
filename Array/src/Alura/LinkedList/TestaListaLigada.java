package Alura.LinkedList;

public class TestaListaLigada {
    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);

        lista.adicionaNoComeco("André");
        System.out.println(lista);
        lista.adicionaNoComeco("Luiz");
        System.out.println(lista);
        lista.adicionaNoComeco("Machado");
        System.out.println(lista);

        lista.adiciona("Souza");
        System.out.println(lista);

    }
}
