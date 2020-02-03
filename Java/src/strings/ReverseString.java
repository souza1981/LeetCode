package strings;

import java.util.Arrays;

public class ReverseString {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        char aux;
        while (start < end){
            aux = s[start];
            s[start] = s[end];
            s[end] = aux;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] array = new char[]{'h','e','l','l','o'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(array);
        System.out.println(Arrays.toString(array));
    }
}
