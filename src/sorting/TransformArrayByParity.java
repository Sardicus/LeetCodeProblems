package sorting;

import java.util.Arrays;

public class TransformArrayByParity {
    public static int[] transformArray(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
                zeroCount++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
           if (j < zeroCount) {
               nums[j] = 0;
           }
           else  {
               nums[j] = 1;
           }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,1,4,2};
        System.out.println(Arrays.toString(transformArray(arr)));
    }
}
