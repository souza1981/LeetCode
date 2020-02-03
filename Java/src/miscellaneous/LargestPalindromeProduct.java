package miscellaneous;

public class LargestPalindromeProduct {

    public int solution(int digits){
        int largest = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                int aux = i * j;
                if (aux < 1000) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(aux);
                if (stringBuilder.toString().equals(stringBuilder.reverse().toString())){
                    if (aux > largest){
                        largest = aux;
                    }
                }
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        LargestPalindromeProduct largestPalindromeProduct = new LargestPalindromeProduct();

        System.out.println(largestPalindromeProduct.solution(2));
    }
}
