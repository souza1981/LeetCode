import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoAmazon1 {
    public List<Integer> cellCompete(int[] states, int days)
    {
        if (states.length == 1) return new ArrayList<>();
        int prevVal = 0;
        // WRITE YOUR CODE HERE
        for (int i = 0; i < days; i++) {

            for (int j = 0; j < states.length; j++) {

                if (j == 0) {
                    prevVal = states[j];
                    if (states[j+1] == 0) {
                        states[j] = 0;
                    } else {
                        states[j] = 1;
                    }
                } else if (j == states.length-1)  {
                    if (prevVal == 0){
                        states[j] = 0;
                    } else {
                        states[j] = 1;
                    }
                } else {

                    if (prevVal == states[j+1]){
                        prevVal = states[j];
                        states[j] = 0;
                    } else {
                        prevVal = states[j];
                        states[j] = 1;
                    }
                }

            }
        }
        List<Integer> result = Arrays.stream(states).boxed().collect(Collectors.toList());
        return result;
    }
    public static void main(String[] args) {
        //int[] states = new int[]{1,0,0,0,0,1,0,0};
        int[] states = new int[]{1,1,1,0,1,1,1,1};
        DemoAmazon1 demoAmazon1 = new DemoAmazon1();
        System.out.println(demoAmazon1.cellCompete(states,2));
    }

}
