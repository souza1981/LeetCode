public class RotateImagem {
/*
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int first=0, last=rows-1; first<last; first++,last--) {
            int[] tmp = matrix[first];
            matrix[first] = matrix[last];
            matrix[last] = tmp;
        }
        for(int i = 0; i < rows; i++){
            for(int j = i+1; j < cols; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }*/

    public void rotate(int[][] matrix) {

        int ultimaLinha = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            if (i >= ultimaLinha) break;
            ultimaLinha--;
            for (int j = 0; j < matrix[i].length; j++) {
                int aux = matrix[i][j];
                matrix[i][j] = matrix[ultimaLinha][j];
                matrix[ultimaLinha][j] = aux;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int aux = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = aux;
            }
        }
    }


//[[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
    public static void main(String[] args) {
        //int [][] matrix = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int [][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        RotateImagem rotateImagem = new RotateImagem();
        rotateImagem.rotate(matrix);
    }
}
