package idv.shawn.practic;

import java.util.Arrays;
import java.util.Comparator;

import org.springframework.stereotype.Component;

@Component
public class SolutionsImpl1 implements Solutions {

	@Override
	public int indexConverter(int index, int length) {
		if (index == 0) {
			return length / 2;
		}
		if (index % 2 == 0) {
			return indexConverter(index - 1, length) + index;
		} else {
			return indexConverter(index - 1, length) - index;
		}
	}

	@Override
	public int[] sortByMidForthBack(int[] numbers) {
		Arrays.sort(numbers);
		int[] reversed = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			reversed[reversed.length - 1 - i] = numbers[i];
		}
		int[] result = new int[reversed.length];
		for (int i = 0; i < reversed.length; i++) {
			result[this.indexConverter(i, reversed.length)] = reversed[i];
		}
		return result;
	}

}
