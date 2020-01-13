package Alura;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDosAlunos = 0;

    public void adiciona(Aluno aluno){
/*        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        }*/
        this.alunos[totalDosAlunos] = aluno;
        totalDosAlunos++;

    }

    public Aluno pega(int posicao){
        return alunos[posicao];
    }

    public void remove (int posicao){

    }

    public boolean contem (Aluno aluno){
        return false;
    }

    public int tamanho(){
        return totalDosAlunos;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "alunos=" + Arrays.toString(alunos) +
                '}';
    }
}
