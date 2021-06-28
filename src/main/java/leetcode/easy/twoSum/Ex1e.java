//package leetcode.easy.twoSum;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * Solution by Leetcode using Hashtable
// */
//public class Ex1e {
//
//	public static void main(String[] args) {
//
//		long start = System.nanoTime();
//
//		int[] intArray = { 0, 3, -3, 4, -1 };
//		int[] outArray = new Ex1e().twoSum(intArray, -1);
//
//		long elapsedTime = System.nanoTime() - start;
//		System.out.println("Execution Time: " + elapsedTime + " | Result: " + outArray[0] + " - " + outArray[1]);
//	}
//
//	public int[] twoSum(int[] nums, int target) {
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			map.put(nums[i], i);
//		}
//		for (int i = 0; i < nums.length; i++) {
//			int complement = target - nums[i];
//			if (map.containsKey(complement) && map.get(complement) != i) {
//				return new int[] { i, map.get(complement) };
//			}
//		}
//		throw new IllegalArgumentException("No two sum solution");
//	}
//
//}
