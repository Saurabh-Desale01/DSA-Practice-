package common;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 35, 1, 10, 34, 1, };
		
//		Arrays.sort(arr);
//		int n = arr.length-1;
//		System.out.println(arr[n-1]);
		
		int second = arr[0];
		int max = arr[0];
		//int largest = second = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			//largest = Math.max(largest, arr[i]);
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		//second = max;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != max) {
				//second = Math.max(second, arr[i]);
				if(second<arr[i]) {
					second=arr[i];
				}
			}
		}
		
		System.out.println(second);
		
	}

}
