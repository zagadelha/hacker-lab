package leetcode.easy.twoSum;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Solution by Leetcode using Hashtable and feeding with CommonsLang
 */
public class Ex1f {

	public static void main(String[] args) {

		long start = System.nanoTime();

		int[] intArray = { 0, 3, -3, 4, -1 };
		int[] outArray = new Ex1f().twoSum(intArray, -1);

		long elapsedTime = System.nanoTime() - start;
		System.out.println("Execution Time: " + elapsedTime + " | Result: " + outArray[0] + " - " + outArray[1]);
	}

	public int[] twoSum(int[] nums, int target) {
		Map<Object, Long> map = Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, Math.toIntExact(map.get(complement)) };
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
