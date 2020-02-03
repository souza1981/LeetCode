package miscellaneous;

public class EvenFibonacciNumbers {
    public int solution(int max){
        int sum = 0;
        int anterior = 0;
        int atual = 1;
        int proximo = 0;
        while (true){
            if (atual % 2 == 0){
                sum += atual;
            }
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            if (proximo > 4000000) break;
            //System.out.println(atual);
        }
        return sum;
    }
    public static void main(String[] args) {
        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        System.out.println(evenFibonacciNumbers.solution(4000000));
    }
}
