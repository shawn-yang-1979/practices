package idv.shawn.practic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MidForthBackSortApplicationTests {

	@Test
	void test1(@Autowired Solutions solutions) {
		Assertions.assertEquals(2, solutions.indexConverter(0, 5));
		Assertions.assertEquals(1, solutions.indexConverter(1, 5));
		Assertions.assertEquals(3, solutions.indexConverter(2, 5));
		Assertions.assertEquals(0, solutions.indexConverter(3, 5));
		Assertions.assertEquals(4, solutions.indexConverter(4, 5));
	}

	@Test
	void test2(@Autowired Solutions solutions) {
		Assertions.assertArrayEquals(new int[] { 2, 4, 5, 3, 1 },
				solutions.sortByMidForthBack(new int[] { 1, 3, 4, 2, 5 }));
		Assertions.assertArrayEquals(new int[] { 2, 3, 5, 6, 4, 2 },
				solutions.sortByMidForthBack(new int[] { 6, 2, 2, 3, 4, 5 }));
	}

}
