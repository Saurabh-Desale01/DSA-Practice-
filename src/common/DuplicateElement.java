package common;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 4, 5, 6, 8, 9, 0};
		
		Map<Integer, Integer> hash = new HashMap<>();
		
		int maxCount = 0;
		int duplicate = 0;
		
		for(int i: arr) {
			hash.put(i, hash.getOrDefault(i, 0) + 1);
			
			if(duplicate < hash.get(i)) {
				duplicate = hash.get(i);
				maxCount = i;
			}
		}
		System.out.println(maxCount);
	}	

}
