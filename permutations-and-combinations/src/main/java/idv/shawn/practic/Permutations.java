package idv.shawn.practic;

import java.util.LinkedList;
import java.util.List;

public class Permutations {

	private List<int[]> output = new LinkedList<>();
	private int[] input;

	private Permutations() {
	}

	public static Permutations of(int[] input) {
		Permutations instance = new Permutations();
		instance.input = input;
		return instance;
	}

	public List<int[]> is() {
		this.process(new int[0]);
		return output;
	}

	private void process(int[] previousResult) {
		for (int i = 0; i < input.length; i++) {
			boolean contain = false;
			for (int resultItem : previousResult) {
				if (input[i] == resultItem) {
					contain = true;
					break;
				}
			}
			if (contain) {
				continue;
			}
			int[] result = new int[previousResult.length + 1];
			System.arraycopy(previousResult, 0, result, 0, previousResult.length);
			result[result.length - 1] = input[i];
			if (result.length == input.length) {
				output.add(result);
			} else {
				process(result);
			}
		}
	}

}