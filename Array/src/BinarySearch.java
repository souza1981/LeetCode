public class BinarySearch {
    public int search(int[] nums, int target) {
        int middle = (int)nums.length/2;
        int left = 0;
        int right = nums.length - 1;
        do {

            if (target < nums[middle]){
                right = middle;
                middle = (int) (left + right)/2;

            } else if (target > nums[middle]) {
                left = middle;
                middle = (int)(left + right) /2;

            }
            if (nums[middle] == target) return middle;
            if (nums[right] == target) return right;
            if (nums[left] == target) return left;

        } while(left != middle && right != middle);
        return -1;
    }

    public static void main(String[] args) {
        //int[] array = new int[]{-1,0,3,5,9,12};
        //int[] array = new int[]{5};
        int[] array = new int[]{-1,0,5};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(array, -1));
        System.out.println(binarySearch.search(array, 0));
        System.out.println(binarySearch.search(array, 3));
        System.out.println(binarySearch.search(array, 5));
        System.out.println(binarySearch.search(array, 9));
        System.out.println(binarySearch.search(array, 12));
        System.out.println(binarySearch.search(array, 13));
    }
}
