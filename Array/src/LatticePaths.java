public class LatticePaths {

    public long solution(int dimensao){
        long [][] matrix = new long[dimensao+1][dimensao+1];
        for (int i = 0; i < dimensao ; i++) {

                matrix[i][dimensao] = 1;
                matrix[dimensao][i] = 1;


        }

        for (int i = dimensao-1; i >= 0; i--) {
            for (int j = dimensao-1; j >= 0; j--) {

                    matrix[i][j] += matrix[i+1][j] + matrix[i][j+1];


            }
        }
        return matrix[0][0];
    }

    public static void main(String[] args) {
        LatticePaths latticePaths = new LatticePaths();
        System.out.println(latticePaths.solution(20));
    }
}
