package array;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            digits[i]++;
            if (digits[i] == 10){
                digits[i] = 0;
                if (i == 0){
                    int[] retorno = Arrays.copyOf(digits,digits.length+1);
                    retorno[0] = 1;
                    return retorno;
                }
            } else {
                return digits;
            }
        }
        return digits;
    }

    public static void main (String args[]){
        PlusOne plusOne = new PlusOne();
        //int[] array = new int[]{9};
        int[] array = new int[]{9,9};
        int[] retorno = plusOne.plusOne(array);
        for (int digito: retorno
             ) {
            System.out.println(digito);
        }
    }

}

