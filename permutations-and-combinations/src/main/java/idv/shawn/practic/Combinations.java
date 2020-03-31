package idv.shawn.practic;

import java.util.LinkedList;
import java.util.List;

public class Combinations {

	private List<int[]> output = new LinkedList<>();
	private int[] input;

	private Combinations() {
	}

	public static Combinations of(int[] input) {
		Combinations instance = new Combinations();
		instance.input = input;
		return instance;
	}

	/**
	 * Refer to this YouTuber: https://www.youtube.com/watch?v=xTNFs5KRV_g
	 * 
	 * @return
	 */
	public List<int[]> is() {
		this.process(0, new int[0]);
		return output;
	}

	private void process(int startIndex, int[] previous) {
		for (int i = startIndex; i < input.length; i++) {
			int[] result = new int[previous.length + 1];
			System.arraycopy(previous, 0, result, 0, previous.length);
			result[result.length - 1] = input[i];
			output.add(result);
			this.process(i + 1, result.clone());
		}
	}

}