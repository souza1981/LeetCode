package miscellaneous;

public class LongestCollatzSequence {

    private long even(long number){
        return number/2;
    }

    private long odd(long number){
        return (3 * number) + 1;

    }

    private long solution(long startNumber){

        int maiorSequencia = 0;
        long numberoMaiorSequencia = startNumber;
        for (long i = startNumber; i > 0; i--){
            long aux = i;
            int totalSequencias = 1;
            while (aux != 1){
                if (aux % 2 == 0){
                    aux = even(aux);
                } else {
                    aux = odd(aux);
                }
                totalSequencias++;
            }
            totalSequencias++;
            if (totalSequencias > maiorSequencia){
                maiorSequencia = totalSequencias;
                numberoMaiorSequencia = i;
            }
        }
        return numberoMaiorSequencia;
    }

    public static void main(String[] args) {
        LongestCollatzSequence longestCollatzSequence = new LongestCollatzSequence();
        System.out.println(longestCollatzSequence.solution(1000000));
    }
}
