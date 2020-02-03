package miscellaneous;

public class FindPrime {

    private boolean isPrime(int num){
        for (int i = 2; i < num ; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public int positionPrime(int position){
        int atualPrime = 1;
        int num = 2;
        boolean isPrime;
        while (true){
            if (num + 1 > Integer.MAX_VALUE) break;
            isPrime = isPrime(num);
            if (isPrime && atualPrime == position) return num;
            if (isPrime) atualPrime++;
            num++;
        }

        return -1;
    }

    public static void main(String[] args) {
        FindPrime findPrime = new FindPrime();
        System.out.println(findPrime.positionPrime(10001));
    }
}
