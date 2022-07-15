package binarysearch;

public class MinimumElementInRotatedSortedArray {

	// Input: nums = [3,4,5,1,2]
	// Minimum number will be present in unsorted part
	// or it will be the first element if the array is sorted/rotated 'n' times.
	public static int findMin(int[] nums) {

		if (nums.length == 1)
			return nums[0];

		int left = 0, right = nums.length - 1, mid = 0;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if (mid > 0 && nums[mid - 1] > nums[mid])
				return nums[mid];
			else if (nums[mid] > nums[mid + 1])
				return nums[mid + 1];
			else if (nums[left] > nums[mid]) {
				// left side is not sorted.move towards left
				right = mid - 1;
			} else if (nums[mid] > nums[right]) {
				// right side is not sorted. move towards right
				left = mid + 1;
			} else {
				// the array is sorted between left and right
				// so the minimum element is the first element
				return nums[left];
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 8 };
		System.out.println(findMin(nums));
	}
}
