package miscellaneous;

import java.math.BigInteger;

public class PowerDigitSum {


    public BigInteger potencia(int number, int potencia){
        if (potencia == 0) return new BigInteger("1");
        return potencia (number,potencia-1).multiply(new BigInteger(String.valueOf(number)));
    }

    public int solution(int number, int potencia){
        String resultado = potencia(number,potencia).toString();
        int sum = 0;
        for (int i = 0; i < resultado.length(); i++) {
            sum+= Character.getNumericValue(resultado.charAt(i));

        }
        return sum;

    }


    public static void main(String[] args) {
        PowerDigitSum powerDigitSum = new PowerDigitSum();
        System.out.println(powerDigitSum.solution(2,1000));
    }


}
