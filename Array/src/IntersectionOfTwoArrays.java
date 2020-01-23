import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public int[] intersectionWithSet(Set<Integer> nums1, Set<Integer> nums2){

        int[] resultado = new int[nums2.size()];
        int indiceArray = 0;

        for (Integer num: nums2
             ) {
            if (nums1.contains(num)) resultado[indiceArray++] = num;
        }

        return Arrays.copyOfRange(resultado,0,indiceArray);

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> nums1Set = new HashSet<>();
        Set<Integer> nums2Set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            nums2Set.add(nums2[i]);
        }

        if (nums1.length > nums2.length){
            return intersectionWithSet(nums1Set,nums2Set);
        } else {
            return intersectionWithSet(nums2Set,nums1Set);
        }

    }

    public static void main(String[] args) {

        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();

        System.out.println(Arrays.toString(intersectionOfTwoArrays.intersection(nums1,nums2)));

    }
}
