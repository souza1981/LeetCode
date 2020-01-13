public class SumSquareDifference {

    private int square(int num){
        return num * num;
    }

    private int squareSequenceIndividual(int maxNumber){
        int sum = 0;
        for (int i = 1; i <= maxNumber ; i++) {
            sum += square(i);
        }
        return sum;
    }

    private int squareSequence(int maxNumber){
        int sum = 0;
        for (int i = 1; i <= maxNumber ; i++) {
            sum += i;
        }
        return square(sum);
    }

    public int solution(int maxNumber){
        return squareSequence(maxNumber) - squareSequenceIndividual(maxNumber);
    }

    public static void main(String[] args) {
        SumSquareDifference sumSquareDifference = new SumSquareDifference();
        System.out.println(sumSquareDifference.solution(100));
    }
}
