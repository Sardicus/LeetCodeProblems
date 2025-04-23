package BinarySearch;

public class FindInMountainArray {

    public static int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = findPeak(mountainArr);
        int ascSearch = binarySearch(target, mountainArr, peak, true); // Search in the first half then the second half if not found.
        if (ascSearch != -1) {
            return ascSearch;
        }
        return binarySearch(target, mountainArr, peak, false);
    }

    private static int findPeak(MountainArray nums) {
        int left = 0;
        int right = nums.length() - 1;

        while (left < right) { // when left == right, it means we found the peak.
            int mid = left + (right - left) / 2;
            if (nums.get(mid) > nums.get(mid + 1)) {
                right = mid; // possible peak.
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private static int binarySearch(int target, MountainArray nums, int peak, boolean isAsc) {
        int left = isAsc ? 0 : peak + 1;
        int right = isAsc ? peak : nums.length() - 1;


        if (nums.length() == 0) return -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = nums.get(mid);

            if (midVal == target) return mid;

            if (isAsc) {
                if (midVal < target) left = mid + 1;
                else right = mid - 1;
            } else {
                if (midVal > target) left = mid + 1;
                else right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 10, 12, 15, 5, 2};
        MountainArray mountainArr = new MountainArrayImpl(arr);
        int target = 5;
        System.out.println(findInMountainArray(target, mountainArr));
    }

}

interface MountainArray {
    int get(int index);

    int length();
}

class MountainArrayImpl implements MountainArray {
    private final int[] arr;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

