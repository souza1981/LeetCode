package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return new int[0];
        }

        int N = matrix.length;
        int M = matrix[0].length;

        int[] resultado = new int[M * N];

        List<Integer> arrayAux = new ArrayList<>();

        int posLinha = 0;
        int posColuna = 0;
        int k = 0;

        for (int i = 0; i < M + N -1; i++) {

            arrayAux.clear();
            posLinha = i < M ? 0 : i - M + 1;
            posColuna = i < M ? i : M - 1;

            while (posLinha < N && posColuna > -1){
                arrayAux.add(matrix[posLinha][posColuna]);
                posLinha++;
                posColuna--;
            }

            if (i % 2 == 0){
                Collections.reverse(arrayAux);
            }

            for (int j = 0; j < arrayAux.size(); j++) {
                resultado[k] = arrayAux.get(j);
                k++;
            }
        }

        return resultado;

    }

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = new int[][]{{3,2}};
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse();
        System.out.println(Arrays.toString(diagonalTraverse.findDiagonalOrder(matrix)));
    }
}
