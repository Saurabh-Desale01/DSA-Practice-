package common;

public class Fibonacci {

	public static void main(String[] args) {
	
		int n=7;
		
		if(n==0 || n==1) {
			System.out.println(1);
		}
		
		int a = 0;
		int b = 1;
		for(int j=2; j<=n; j++) {
			int sum = a+b;
			System.out.println(a+b);
			a = b;
			b = sum;
			
		}

	}

}
