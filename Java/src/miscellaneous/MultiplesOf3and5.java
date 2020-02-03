package miscellaneous;

public class MultiplesOf3and5 {
    public int sumMultiples(int max){
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum+= i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        MultiplesOf3and5 multiplesOf3and5 = new MultiplesOf3and5();
        System.out.println(multiplesOf3and5.sumMultiples(1000));

    }
}
