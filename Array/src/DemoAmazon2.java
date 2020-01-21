public class DemoAmazon2 {
    public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
        if (arr.length == 1) return arr[0];
        int maiorValor = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maiorValor ){
                maiorValor = arr[i];
            }
        }
        for (int i = maiorValor; i >= 2; i--) {
            boolean found = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % i != 0){
                    found = false;
                    break;
                }
            }
            if (found){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        DemoAmazon2 demoAmazon2 = new DemoAmazon2();
        int[] nums = new int[]{5,2,8,1,6,3};
        System.out.println(demoAmazon2.generalizedGCD(6,nums));
    }
}
