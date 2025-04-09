package BinarySearch;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (nums.length == 0) return -1;

        while(start <= end){
            int mid = start + (end-start)/2; // The reason for calculating mid like this is if start and end integers are very big integers, sum of these numbers could exceed the int limit.

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid +1;
            else end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }
}
