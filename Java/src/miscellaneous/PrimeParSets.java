package miscellaneous;

public class PrimeParSets {

    public boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeParSets primeParSets = new PrimeParSets();
        int num = 109109;
        //int[] primos = new int[]{3,7,109,673};
        int[] primos = new int[]{3,7,109,673};
        boolean ePrimo = true;

        for (int i = 674; i <= 100000; i++) {
            if (primeParSets.isPrime(i)){
                for (int x:
                     primos) {
                    if (x > i) break;
                    int aux1 = Integer.parseInt(Integer.toString(x) + Integer.toString(i));
                    int aux2 = Integer.parseInt(Integer.toString(i) + Integer.toString(x));
                    if (!primeParSets.isPrime(aux1) || !primeParSets.isPrime(aux2)) {
                        ePrimo = false;
                        break;
                    }
                }
                if (ePrimo){
                    System.out.println("Encontrado o primo: " + i);
                }
                ePrimo = true;
            }
        }
        System.out.println(String.format("%s é primo? %s",num,primeParSets.isPrime(num)));

    }

}
