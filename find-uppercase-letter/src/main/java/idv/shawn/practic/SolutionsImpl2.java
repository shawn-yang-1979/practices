package idv.shawn.practic;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SolutionsImpl2 implements Solutions {

	public List<Character> extractUppercase(String str) {
		List<Character> results = new LinkedList<>();
		char[] strChars = str.toCharArray();
		for (int i = 0; i < strChars.length; i++) {
			if (Character.isUpperCase(strChars[i])) {
				results.add(strChars[i]);
			}
		}
		return results;
	}

}
