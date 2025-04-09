package BinarySearch;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target ? 0 : -1;
        int pivot = 0;
        for (int i = 0; i < nums.length; i++){
            if (i != nums.length-1 && nums[i] > nums[i+1]) {
                pivot = i;
            }
        }

        if (nums[pivot] == target) return pivot;
        int lowerHalf = binarySearch(nums, target, 0, pivot);
        if (lowerHalf != -1) return lowerHalf;
        int upperHalf = binarySearch(nums, target, pivot+1, nums.length-1);
        return upperHalf;


    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        if (nums[start] == target) return start;
        if (nums[end] == target) return end;

        while(start <= end){
            int mid = start + (end-start)/2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid +1;
            else end = mid - 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(search(nums, target));
    }
}


//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
// [,6,7,0,1,2,4,5]