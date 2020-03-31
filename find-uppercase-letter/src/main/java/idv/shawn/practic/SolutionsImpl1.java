package idv.shawn.practic;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SolutionsImpl1 implements Solutions{

	public List<Character> extractUppercase(String str){
		List<Character> results = new LinkedList<>();
		
		int length = str.length();
		String lowerCaseStr = str.toLowerCase();
		char[] originalStrChars = str.toCharArray();
		char[] lowerCaseStrChars = lowerCaseStr.toCharArray();
		
		for (int i = 0; i< length; i++) {
			if (originalStrChars[i] != lowerCaseStrChars[i]) {
				results.add(new Character(originalStrChars[i]));
			}
		}
		return results;
	}
	
}
