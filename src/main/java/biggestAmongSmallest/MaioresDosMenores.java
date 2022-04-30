package biggestAmongSmallest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MaioresDosMenores {

	private static int segment(int x, List<Integer> space) {

		boolean newSegment = true;
		int minor = 0;
		List<Integer> minors = new ArrayList<>();
		List<Integer> aux = new ArrayList<>();

		// iterate over X times
		for (int i = 0; i <  x; i++) {
			// iterate to create a segment
			for (int j = i + 1; j <= (i + x); j++) {
//				minor = space.get(j - 1) < space.get(j) ? space.get(j - 1) : space.get(j);
				aux.add(space.get(j - 1));

//				if (1=1) {
//					
//				} else {
////					if (minors.add(space.get(i)) {
//						minors.add(space.get(i));
//						
////					}
//				}
			}
			Collections.sort(aux);
			minors.add(aux.get(0));
			aux.clear();
//			newSegment = true;
		}
		// ordenar e selecionar o maior dos menores
		return x;
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 5, 4, 6, 8);
		System.out.println("Result: " + segment(3, list));

	}

}
