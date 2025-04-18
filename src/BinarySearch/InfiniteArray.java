package BinarySearch;

public class InfiniteArray {

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = 1;

        while (nums[right] < target) { // Interval for searching is increased exponentially to find the target in an infinite array.
            left = right;
            right *= 2;
        }

        while(left <= right){
            int mid = left + (right -left)/2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid +1;
            else right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] realArray = {1, 3, 5, 7, 9, 12, 15, 20, 25, 30, 35, 40, 45, 50};
        int target = 20;
        System.out.println(search(realArray, target));
    }
}
