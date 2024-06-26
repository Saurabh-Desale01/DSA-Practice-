package common;

//Number that is equal to the sum of cube of its digits
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 154;
		int n = num;
		int rem =0;
		int sum =0;
		
		while(n!=0) {
			rem = n%10;
			sum += (rem*rem*rem);
			n = n/10;
		}
		
		if(num == sum) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is not Armstrong");
		}
		
		

	}

}
