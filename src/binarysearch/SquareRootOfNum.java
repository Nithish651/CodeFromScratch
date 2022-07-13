package binarysearch;

public class SquareRootOfNum {

	public static long mySqrt(long x) {

		if (x == 1)
			return 1;

		long left = 1, right = x / 2, mid = 0, result = 0; // search space from 1 to x/2, the maximum can go only till
															// half of the number.

		while (left <= right) {
			mid = left + (right - left) / 2;
			long square = mid * mid;

			if (square == x)
				return mid;
			else if (square < x) {
				result = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return result;
	}

	// method where integer is passed
	// to avoid lossy conversion error
	public static int mySqrt1(int x) {

		if (x == 1 || x == 0)
			return x;

		int left = 1, right = x / 2, mid = 0, result = 0;

		while (left <= right) {
			mid = left + (right - left) / 2;
			if (mid <= x / mid) {
				result = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return result;
	}

	public static void main(String[] args) {

		System.out.println(mySqrt1(0));
	}
}
