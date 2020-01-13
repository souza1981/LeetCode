package Alura;

import java.util.Arrays;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("André");
        Aluno a2= new Aluno("Isabela");

        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);


    }
}
