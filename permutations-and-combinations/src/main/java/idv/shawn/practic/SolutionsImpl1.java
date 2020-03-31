package idv.shawn.practic;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SolutionsImpl1 implements Solutions {

	@Override
	public List<int[]> permutations(int[] numbers) {
		return Permutations.of(numbers).is();
	}

	@Override
	public List<int[]> combinations(int[] numbers) {
		return Combinations.of(numbers).is();
	}

}
