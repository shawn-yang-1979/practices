package idv.shawn.practic;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PermutationsAndCombinationsApplicationTests {

	@Test
	void test1(@Autowired Solutions solutions) {
		List<int[]> result = solutions.combinations(new int[] { 1, 2, 3 });
		Assertions.assertArrayEquals(new int[] { 1 }, result.get(0));
		Assertions.assertArrayEquals(new int[] { 1, 2 }, result.get(1));
		Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, result.get(2));
		Assertions.assertArrayEquals(new int[] { 1, 3 }, result.get(3));
		Assertions.assertArrayEquals(new int[] { 2 }, result.get(4));
		Assertions.assertArrayEquals(new int[] { 2, 3 }, result.get(5));
		Assertions.assertArrayEquals(new int[] { 3 }, result.get(6));
	}

	@Test
	void test2(@Autowired Solutions solutions) {
		List<int[]> result = solutions.permutations(new int[] { 1, 2, 3 });
		Assertions.assertArrayEquals(new int[] { 1, 2, 3 }, result.get(0));
		Assertions.assertArrayEquals(new int[] { 1, 3, 2 }, result.get(1));
		Assertions.assertArrayEquals(new int[] { 2, 1, 3 }, result.get(2));
		Assertions.assertArrayEquals(new int[] { 2, 3, 1 }, result.get(3));
		Assertions.assertArrayEquals(new int[] { 3, 1, 2 }, result.get(4));
		Assertions.assertArrayEquals(new int[] { 3, 2, 1 }, result.get(5));
	}

}
