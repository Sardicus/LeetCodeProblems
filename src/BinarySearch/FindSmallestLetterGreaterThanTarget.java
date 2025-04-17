package BinarySearch;

public class FindSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        int ceiling = 0; // This is correct but using fewer variables makes it more optimal memory-wise.

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                ceiling = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return letters[ceiling];
    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
    }

}
