package BinarySearch;

public class PeakIndexInAMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) { // when left == right, it means we found the peak.
            int mid = left + (right - left)/2;
            if (arr[mid] > arr[mid +1]){
                right = mid; // possible peak.
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {0,10,12,15,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
