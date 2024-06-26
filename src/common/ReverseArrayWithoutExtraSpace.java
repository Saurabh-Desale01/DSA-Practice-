package common;

import java.util.Arrays;

public class ReverseArrayWithoutExtraSpace {

	public static void main(String args[]) {
		  
		int[] arr = {1, 2, 3, 5, 6, 7, 9};
		
		int i=0;
		int j=arr.length-1;
		
		while(j>i) {
			swap(arr, i, j);
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
