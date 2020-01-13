public class SummationPrimes {

    private boolean isPrime(int number){
        double q = Math.floor(Math.sqrt(number));
        for (int i = 2; i <= q; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public long solution(int maxNumber){
        long sum = 0;
        for (int i = 2; i < maxNumber; i++) {

            int sumMultiple3 = 0;
            int sumMultiplo11Par = 0;
            int sumMultiplo11Impar = 0;

            //if (i != 2 && i % 2 == 0) continue;
            //if (i != 5 && i % 5 == 0) continue;
            /*
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                int digito = Character.getNumericValue(String.valueOf(i).charAt(j));
                sumMultiple3 += digito;
                if (digito % 2 == 0){
                    sumMultiplo11Par += digito;
                } else {
                    sumMultiplo11Impar += digito;
                }
            }
            */

            //1179908154
            //Correto: 142913828922
            //if (i != 3 && sumMultiple3 % 3 == 0) continue;
            //if (i != 11 && (sumMultiplo11Par - sumMultiplo11Impar) % 11 == 0) continue;

            if (isPrime(i) && i < maxNumber){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        SummationPrimes summationPrimes = new SummationPrimes();
        System.out.println(summationPrimes.solution(2000000));
    }
}
