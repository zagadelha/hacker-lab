package smallestExcludingOthers;

import java.util.Arrays;

public class SmallestExcludingOthers {
	
	public static void main(String[] args) {
	
		int[] numbers = { 1, 3, 6, 4, -1, 2 };
		int result = solution(numbers);
		System.out.println("Result is: " + result);
	}
	
	public static int solution(int[] A) {
		
		Arrays.sort(A);
		for (int i = 1; i < 100; i++) {
			if (!found(A, i)) {
				return i;
			}
		}
		return -1;
    }
	
	//FIXME: Change this method by Arrays.binarySearch
	public static boolean found(int[] intArray, int searchedValue) {		
		for(int x : intArray){
			if(x == searchedValue){
		        return true;
		    }
		}
		return false;
	}

}
