package string;

import java.util.HashMap;
import java.util.Map;

public class StringQuestions {

	public static void main(String[] args) {
		
			String result = reverseString("Hello java");
			
			char max = maximumOccurrenceCharacter("geek for geeks");
			
			System.out.println(max);
	}
	
	//reverse a String
	public static String reverseString(String str) {
		
		char[] strArray = str.toCharArray();
		
		String reverse = "";
		
		for(char ch: strArray) {
			reverse = ch + reverse;
		}
		return reverse;
	}
	
	//maximum occurrence character in string 
	public static char maximumOccurrenceCharacter(String str) {
		
		Map<Character, Integer> hash = new HashMap<>();
		
		char[] strArray = str.toCharArray();
		//int index=1;
		char maxChar = ' ';
		int maxCount = 0;
		for(char ch: strArray) {
			  hash.put(ch, hash.getOrDefault(ch, 0) + 1);
	            
	            if (maxCount < hash.get(ch)) {
	                maxCount = hash.get(ch);
	                maxChar = ch;
	            }
		}
		
		return maxChar;
	}

}
