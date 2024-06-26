package common;

/* Write a program to find the index of first occurrence and last 
occurrence of an element in the array in a single iteration. */

public class FirstAndLastOccurance {

	public static void main(String args[]) {

		int[] arr = { 1, 2, 3, 2, 4 };
		int target = 2;

		int fIndex = -1;
		int lIndex = -1;
		boolean found = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				if (!found) {
					fIndex = i;
					lIndex = i;
					found = true; // found for the first time
				} else {
					lIndex = i;
				}
			}
		}

		if (found == false) {
			System.out.println("The element does not exist in the array");
		} else {
			System.out.println("First Index = " + fIndex + " Last Index = " + lIndex);
		}
	}
}
