import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res^=nums[i];
        }
        return res;/*
        Map<Integer,Boolean> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           mapa.put(nums[i],mapa.containsKey(nums[i]));
        }
        for (Map.Entry<Integer,Boolean> entry: mapa.entrySet()
             ) {
            if (!entry.getValue()){
                return entry.getKey();
            }
        }
        return -1;*/
    }

    public static void main(String[] args) {

        int[] nums = new int[]{4,1,2,1,2};
        SingleNumber singleNumber = new SingleNumber();

        System.out.println(singleNumber.singleNumber(nums));

    }

}
