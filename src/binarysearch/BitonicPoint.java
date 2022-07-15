package binarysearch;

public class BitonicPoint {

	// Input: n = 9 ,arr[] = {1,15,25,45,42,21,17,12,11}
	public static int findMaximum(int[] arr, int n) {
		int left = 0, right = n - 1, mid = 0;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == n - 1 || arr[mid] > arr[mid + 1])) {
				// the adjacent elements are less than the mid and hence bitonic point
				return arr[mid];
			} else if (arr[mid - 1] < arr[mid]) {
				// the previous element is lesser,so the higher element will be present on the
				// right side
				left = mid + 1;
			} else if (arr[mid - 1] > arr[mid]) {
				// the higher element will be present on left side
				right = mid - 1;
			}

		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 6,5,4,3,2,1};
		System.out.println(findMaximum(arr, arr.length));
	}
}
