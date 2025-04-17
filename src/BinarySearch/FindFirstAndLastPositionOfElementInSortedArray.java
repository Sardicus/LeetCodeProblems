package BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
       int[] result = {-1,-1};

       int left = searchCeilAndFloor(nums, target, false);
       int right = searchCeilAndFloor(nums, target, true);

       result[0] = left;
       result[1] = right;

        return result;
    }

    public static int searchCeilAndFloor(int[] nums, int target, boolean ceiling) {
        int left = 0;
        int right = nums.length - 1;
        int answer = -1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid +1;
            else {
               answer = mid;
               if (ceiling) left = mid + 1; // looking if left part has an occurrence of the target. Looking left if we are searching for floor and looking right otherwise;
               else right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
