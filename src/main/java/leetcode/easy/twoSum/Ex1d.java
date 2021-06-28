package leetcode.easy.twoSum;

/**
 * Implementation with Linear Search with calculations in variable
 */
public class Ex1d {

	public static void main(String[] args) {

		long start = System.nanoTime();

		int[] intArray = { 0, 3, -3, 4, -1 };
		int[] outArray = new Ex1d().twoSum(intArray, -1);

		long elapsedTime = System.nanoTime() - start;
		System.out.println("Execution Time: " + elapsedTime + " | Result: " + outArray[0] + " - " + outArray[1]);
	}

	public int[] twoSum(int[] nums, int target) {

		double lenNums = nums.length;
		double targetMax = Math.pow(10, 9);
		double targetMin = targetMax * (-1);
		boolean sizeValid = lenNums >= 2 && lenNums <= (Math.pow(10, 4));
		boolean targetValid = target >= targetMin && target <= targetMax;

		if (sizeValid && targetValid) {
			for (int i = 0; i < lenNums; i++) { // iterate all elements
				for (int j = 0; j < lenNums; j++) { // iterate finding a target
					if (i != j && nums[i] >= targetMin && nums[i] <= targetMax) {
						if ((nums[i] + nums[j]) == target) {
							int[] myArray = new int[2];
							myArray[0] = i;
							myArray[1] = j;
							return myArray;
						}
					}
				}
			}
		}
		return null;
	}

}
