public class NumberLetterCounts {
    public int digitTextLen(int num){
        switch (num){
            case 0: return 4;
            case 1: return 3;
            case 2: return 3;
            case 3: return 5;
            case 4: return 4;
            case 5: return 4;
            case 6: return 3;
            case 7: return 5;
            case 8: return 5;
            case 9: return 4;
            default: return 0;
        }
    }

}
