package leetcode.easy.twoSum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation with ArrayList
 */
public class Ex1b {

	public static void main(String[] args) {

		long start = System.nanoTime();

		int[] intArray = { 2, 7, 11, 15 };
		int[] outArray = new Ex1b().twoSum(intArray, 9);

		long elapsedTime = System.nanoTime() - start;
		System.out.println("Execution Time: " + elapsedTime + " | Result: " + outArray[0] + " - " + outArray[1]);
	}

	public int[] twoSum(int[] nums, int target) {

		int lenNums = nums.length;
		double targetMin = Math.pow(-10, 9);
		double targetMax = Math.pow(10, 9);
		boolean sizeValid = lenNums >= 2 && lenNums <= (Math.pow(10, 4));
		boolean targetValid = target >= targetMin && target <= targetMax;

		if (sizeValid && targetValid) {
			List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

			for (Integer num : list) {
				int diff = target - num; // dif value to achieve the target

				if (num >= targetMin && num <= targetMax) {
					if (list.contains(diff)) {
						int[] myArray = new int[2];
						myArray[0] = list.indexOf(num);
						myArray[1] = list.indexOf(diff);
						return myArray;
					}
				}
			}
		}
		return null;
	}

}
