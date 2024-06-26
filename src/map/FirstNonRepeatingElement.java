package map;

import java.util.HashMap;
import java.util.Map;

//Find first non repeating element in string 
public class FirstNonRepeatingElement {
	
	public static void main(String args[]) {
		
	String str = "a green apple";
	Map<Character, Integer> freqMap = new HashMap<>();
	
	for(char ch: str.toCharArray()) {
		if(freqMap.containsKey(ch)) {
			freqMap.put(ch, freqMap.get(ch)+1);
		}else {
			freqMap.put(ch, 1);
		}
	}
	
	for(char ch1: str.toCharArray()) {
		if(freqMap.get(ch1)>1) {
			System.out.println(ch1);
			break;
		}
	}
	}
}
