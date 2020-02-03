package array;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int x: nums
             ) {
            sum += x;
        }
        int leftsum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            else {
                leftsum+= nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        PivotIndex pivotIndex = new PivotIndex();
        System.out.println(pivotIndex.pivotIndex(nums));
    }
}
