public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        int maxIndex = -1;
        int maxNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNum){
                maxIndex = i;
                maxNum = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != maxNum && maxNum < 2*nums[i]) return -1;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{3, 6, 1, 0};
        int[] nums = new int[]{1,2,3,4};
        LargestNumberAtLeastTwiceOfOthers largestNumberAtLeastTwiceOfOthers = new LargestNumberAtLeastTwiceOfOthers();
        System.out.println(largestNumberAtLeastTwiceOfOthers.dominantIndex(nums));
    }
}
