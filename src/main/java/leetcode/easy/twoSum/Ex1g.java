package leetcode.easy.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution by Leetcode
 */
public class Ex1g {

	public static void main(String[] args) {

		long start = System.nanoTime();

		int[] intArray = { 0, 3, -3, 4, -1 };
		int[] outArray = new Ex1g().twoSum(intArray, -1);

		long elapsedTime = System.nanoTime() - start;
		System.out.println("Execution Time: " + elapsedTime + " | Result: " + outArray[0] + " - " + outArray[1]);
	}

	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				result[1] = i;
				result[0] = map.get(target - numbers[i]);
				return result;
			}
			map.put(numbers[i], i);
		}
		return result;
	}

}
