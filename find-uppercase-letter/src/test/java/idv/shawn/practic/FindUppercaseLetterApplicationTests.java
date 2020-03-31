package idv.shawn.practic;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FindUppercaseLetterApplicationTests {

	@Test
	void test1(@Autowired Solutions solutionsImpl1) {
		List<Character> results = solutionsImpl1.extractUppercase("Practices for You!");
		Assertions.assertEquals(2, results.size());
		Assertions.assertEquals('P', results.get(0));
		Assertions.assertEquals('Y', results.get(1));
	}
	
	@Test
	void test2(@Autowired Solutions solutionsImpl2) {
		List<Character> results = solutionsImpl2.extractUppercase("Practices for You!");
		Assertions.assertEquals(2, results.size());
		Assertions.assertEquals('P', results.get(0));
		Assertions.assertEquals('Y', results.get(1));
	}

}
