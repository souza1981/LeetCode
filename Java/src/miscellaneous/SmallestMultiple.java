package miscellaneous;

public class SmallestMultiple {

    public int solution(int startNum){
        for (int i = startNum; i < 900000000; i++) {
            int j = 1;
            for (j = 1; j <= 20; j++) {
                 if (i % j != 0) break;
            }
            if (j == 21) return i;
        }

        return 0;
    }

    public static void main(String[] args) {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        System.out.println(smallestMultiple.solution(21));
    }
}
