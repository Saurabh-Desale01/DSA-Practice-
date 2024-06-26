package common;

public class FindMissingNumber {

	public static void main(String args[]) {
		
		int[] arr = {1,2,6,3,4,8,7};
		
		//approach 1
//		for(int i=0; i<arr.length; i++) {
//			if(i+1!=arr[i]) {
//				System.out.println(i+1);
//				break;
//			}
//		}
		
		//approach 2
		int n = arr.length+1;
		//addition first n natural numbers 
		int totalSum = n*(n+1)/2;
		int sum=0;
		
		for(int i:arr) {
			sum += i;
		}
		
		System.out.println(totalSum-sum);
	}
}
