package BinarySearch;

public class SqrtX {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid; // number * number -> big possibility of an integer overflow. Casting to long solves the issue.
            if (square == x) {
                return mid;
            } else if (square < x) {
                left = mid +1;
            }
            else {
                right = mid -1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        SqrtX sqrtX = new SqrtX();
        System.out.println(sqrtX.mySqrt(2147395599));
    }
}
