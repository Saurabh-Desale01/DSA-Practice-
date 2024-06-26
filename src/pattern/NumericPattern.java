package pattern;

public class NumericPattern {
	
	public static void main(String args[]) {
		
		int row=4;
		int col=4;
	 /* 1111
        2222
        3333
        4444 */
		
		for(int i=1; i<=row; i++) {
			for(int j=0; j<col; j++) {
				//System.out.print(i);
			}
			//System.out.println();
		}
		
		/* 333
           313
           323
           333 */
		
		for(int i=0; i<row; i++) {
			for(int j=1; j<col; j++) {
				if((i==0 || i==col-1) || (j==1 || j==col-1)) {
					//System.out.print(3);
				}else {
					//System.out.print(i);
				}
			}
			//System.out.println();
		}
		
		/* 1
           23
           456
           78910 */
		int count=1;
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				//System.out.print(count++);
			}
			//System.out.println();
		}
		
		/* 10987
           456
           32
           1 */
		
//		int num = 10;
//		for(int i=0; i<row; i++) {
//			if(i%2==i) {
//				for(int j=0; j<i; j++) {
//					System.out.print(num--);
//				}
//			}else {
//				for(int j=col-i; j>0; j--) {
//					System.out.print(num--);
//				}
//			}
//			System.out.println();
//		}
		
		/* 4444
           333
           22
           1 */
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col-i; j++) {
				//System.out.print(row-i);
			}
			//System.out.println();
		}
	
		/* 1 2 3 4
		 *   1 2 3
		 *     1 2
		 *       1 */
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<i; j++) {
				//System.out.print("  ");
			}
			for(int k=1; k<=col-i; k++) {
				//System.out.print(count++ + " ");
			}
			//System.out.println();
		}
		
		/*  1
            23
            456
            78910
            456
            23
            1 */
		
		int sum =1;
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(sum++);
			}
			System.out.println();
		}
		//count = count-row;
		for(int i=row-1; i>=1; i--) {
			sum -= i;
			for(int j=1; j<=i; j++) {
				System.out.print(sum++);
			}
			sum -= i;
			System.out.println();
		}
		
	}

}
