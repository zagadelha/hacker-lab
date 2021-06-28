package leetcode.easy.twoSum;

import java.util.Arrays;

/**
 * DONT WORK! Because binary search change de array order.
 */
public class Ex1c {

	public static void main(String[] args) {

		long start = System.nanoTime();

		int[] intArray = { 3, 2, 4 };
		int[] outArray = new Ex1c().twoSum(intArray, 6);

		long elapsedTime = System.nanoTime() - start;
		System.out.println("Execution Time: " + elapsedTime + " | Result: " + outArray[0] + " - " + outArray[1]);
	}

	public int[] twoSum(int[] nums, int target) {

		int lenNums = nums.length;
		double targetMin = Math.pow(-10, 9);
		double targetMax = targetMin * (-1);
		boolean sizeValid = lenNums >= 2 && lenNums <= (Math.pow(10, 4));
		boolean targetValid = target >= targetMin && target <= targetMax;

		if (sizeValid && targetValid) {

			Arrays.sort(nums);
			for (int i = 0; i < lenNums; i++) { // iterate all elements

				int diff = target - nums[i]; // dif value to achieve the target
				int res = Arrays.binarySearch(nums, diff); // execute a binary search to check if number exists in array

				if (res >= 0 && nums[i] >= targetMin && nums[i] <= targetMax) {
					int[] myArray = new int[2];
					myArray[0] = i;
					myArray[1] = findIndex(nums, diff, i);
					return myArray;
				}
			}
		}
		return null;
	}

	// Linear-search function to find the index of an element
	public static int findIndex(int arr[], int t, int ignore) {

		// if array is Null
		if (arr == null) {
			return -1;
		}

		// find length of array
		int len = arr.length;
		int i = 0;

		// traverse in the array
		while (i < len) {

			// if the i-th element is t
			// then return the index
			if (arr[i] == t && i != ignore) {
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

}
