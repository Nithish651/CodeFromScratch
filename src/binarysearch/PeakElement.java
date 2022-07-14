package binarysearch;

public class PeakElement {

	//Input: nums = [1,2,3,1]
	public static int findPeakElement(int[] nums) {

		int left = 0, right = nums.length - 1, mid = 0;

		while (left <= right) {
			mid = left + (right - left) / 2;

			if ((mid == 0 || nums[mid - 1] <= nums[mid]) && (mid == nums.length - 1 || nums[mid] >= nums[mid + 1]))
				return mid;
			else if (mid > 0 && nums[mid - 1] > nums[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}

		return mid;

	}
	
	public static void main(String[] args) {
		int [] nums = {1,2,1,3,5,6,4};
		System.out.println(findPeakElement(nums));
	}
}
