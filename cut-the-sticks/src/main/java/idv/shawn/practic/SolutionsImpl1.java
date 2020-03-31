package idv.shawn.practic;

import org.springframework.stereotype.Component;

@Component
public class SolutionsImpl1 implements Solutions {

	@Override
	public int[] cutTheSticks(int[] arr) {
		// find min int
		int minInt = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= minInt) {
				minInt = arr[i];
			}
		}
		// cut by min int and keep non zero result in tempArr
		int[] tempArr = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			int afterCut = arr[i] - minInt;
			if (afterCut > 0) {
				tempArr[index] = afterCut;
				index++;
			}
		}
		if (index == 0) {
			int[] lastResult = new int[1];
			lastResult[0] = arr.length;
			return lastResult;
		} else {
			int[] nextArr = new int[index];
			for (int i = 0; i < index; i++) {
				nextArr[i] = tempArr[i];
			}
			int[] nestedResult = cutTheSticks(nextArr);
			int[] result = new int[nestedResult.length + 1];
			result[0] = arr.length;
			for (int i = 0; i < nestedResult.length; i++) {
				result[i + 1] = nestedResult[i];
			}
			return result;
		}
	}
}
