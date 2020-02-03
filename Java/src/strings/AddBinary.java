package strings;

public class AddBinary {

    public String solution(String a, String b){
        char[] charAuxArray = new char[Math.max(a.length(),b.length())];



        String str1 = String.format("%1$" + Math.max(a.length(),b.length()) + "s",a).replace(" ","0");
        String str2 =String.format("%1$" + Math.max(a.length(),b.length()) + "s",b).replace(" ","0");

        int i = str1.length()-1;
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        String vaiUm = "0";
        while (i >= 0) {

            int soma = Integer.parseInt(String.valueOf(str1Char[i]),2) + Integer.parseInt(String.valueOf(str2Char[i]),2);
            soma += Integer.parseInt(vaiUm,2);
            String aux = Integer.toBinaryString(soma);
            if (aux.length() > 1) vaiUm = "1"; else vaiUm = "0";
            charAuxArray[i] = aux.charAt(aux.length()-1);
            i--;
        }

            if (vaiUm.equals("1")){
                return "1" + String.valueOf(charAuxArray).trim();
            }
            return String.valueOf(charAuxArray).trim();

    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        System.out.println(addBinary.solution("1010","1011"));
    }
}
