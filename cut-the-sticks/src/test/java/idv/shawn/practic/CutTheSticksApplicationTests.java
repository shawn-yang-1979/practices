package idv.shawn.practic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CutTheSticksApplicationTests {

	@Test
	void test(@Autowired Solutions solutionsImpl1) {
		Assertions.assertArrayEquals(//
				new int[] { 3, 2, 1 }, //
				solutionsImpl1.cutTheSticks(new int[] { 1, 2, 3 }));
		Assertions.assertArrayEquals(//
				new int[] { 6, 4, 2, 1 }, //
				solutionsImpl1.cutTheSticks(new int[] { 5, 4, 4, 2, 2, 8 }));
	}

}
