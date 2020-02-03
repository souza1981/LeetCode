package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        if (matrix.length == 0) return new ArrayList<>();

        int primeiraLinha = 0;
        int ultimaLinha = matrix.length-1;
        int primeiraColuna = 0;
        int ultimaColuna = matrix[0].length-1;

        List<Integer> resultado = new ArrayList<>();

        while (resultado.size() != matrix.length * matrix[0].length){
            for (int i = primeiraColuna; i <= ultimaColuna; i++) {
                resultado.add(matrix[primeiraLinha][i]);
            }
            for (int i = primeiraLinha + 1; i < ultimaLinha; i++) {
                resultado.add(matrix[i][ultimaColuna]);
            }
            if (resultado.size() == matrix.length * matrix[0].length) {
                break;
            }
            for (int i = ultimaColuna; i >= primeiraColuna; i--) {
                resultado.add(matrix[ultimaLinha][i]);
            }

            if (resultado.size() == matrix.length * matrix[0].length) {
                break;
            }
            for (int i = ultimaLinha-1; i > primeiraLinha; i--) {
                resultado.add(matrix[i][primeiraColuna]);
            }

            primeiraLinha++;
            ultimaLinha--;
            primeiraColuna++;
            ultimaColuna--;

        }

        return resultado;
    }

    public static void main(String[] args) {
        //int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}}
        //int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] matrix = new int[][]{{7},{9},{6}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + i + "," + j +"]" + matrix[i][j]);
            }
            System.out.println("");
        }

        SpiralMatrix spiralMatrix = new SpiralMatrix();

        System.out.println(spiralMatrix.spiralOrder(matrix));


    }
}
