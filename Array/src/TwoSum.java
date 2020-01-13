import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] retorno = new int[2];
        for (int j = 0; j < nums.length; j++) {
            for (int k = j+1 ; k < nums.length; k++) {
                if (nums[j] + nums[k] == target){
                    retorno[0] = j;
                    retorno[1] = k;
                    return  retorno;
                }
            }
        }
        return retorno;
    }

    public int[] twoSum2(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[]{};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main (String args[]){
        int[] nums = new int[]{3,2,4};
        TwoSum twoSum = new TwoSum();
        int[] retorno = twoSum.twoSum2(nums,6);
        System.out.println(Arrays.toString(retorno));
    }
}
