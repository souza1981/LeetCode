public class RotateArray {

    public void rotate(int[] nums, int k) {
        int prev = 0;
        int aux = 0;
        for (int i = 0; i < k; i++) {
            prev = nums[nums.length-1];
            for (int j = 0; j < nums.length; j++) {
                aux = nums[j];
                nums[j] = prev;
                prev = aux;
            }
        }
    }

    public static void main(String[] args) {

    }

}
