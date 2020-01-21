public class TriangularNumber {

    private int qtdDivisors(long number){
        if (number == 1) return 1;
        int numberSqrt = (int) Math.sqrt(number);
        int count = 0;
        for (int i = 1; i <= numberSqrt; i++) {
            if (number % i == 0) {
                count += 2;
            }
        }
        if (numberSqrt * numberSqrt == number){
            count--;
        }
        return count;
    }
    
    public long solution(){
        long trianguleNumber = 0;
        for (int i = 1; i < 1000000; i++) {
            trianguleNumber += i;
            //trianguleNumber = 76576500;
            if (qtdDivisors(trianguleNumber) == 500){
                return trianguleNumber;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        TriangularNumber triangularNumber = new TriangularNumber();
        System.out.println(triangularNumber.solution());
    }
}
