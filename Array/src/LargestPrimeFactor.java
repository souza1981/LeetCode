import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestPrimeFactor {
    public boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> primos (int maximo){
        List<Integer> primos = new ArrayList<>();
        for (int i = 1; i <= maximo; i++) {
            if (isPrime(i)){
                primos.add(i);
            }
        }
        BigInteger num = new BigInteger("600851475143"); //600.851.475.143
        return primos;
    }

    public static void main(String[] args) {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        List<Integer> primos = largestPrimeFactor.primos(1000000);
        System.out.println(Arrays.toString(primos.toArray()));

    }
}
