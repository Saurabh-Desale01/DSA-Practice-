package pattern;

public class StarPattern {

	public static void main(String args[]) {
		
		int row=4;
		int col=4;
		
	   /* ****
          ****
          ****
          **** */
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		
	 /*  ****
         *  *
         *  *
         **** */
		
		
		for(int i=0; i<=row; i++) {
			for(int j=0; j<=col; j++) {
				if((i==0 || i==col) || (j==0 || j==col)) {
					//System.out.print("*");
				}else {
					//System.out.print(" ");
				}
			}
			//System.out.println();
		}
		
		/* ****
            ****
             ****
              **** */
		
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<i; j++) {
				//System.out.print(" ");
			}
			for(int k=0; k<col; k++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		
		/* ****
          ****
         ****
        **** */
		
		for(int i=0; i<row; i++) {
			for(int j=row-1; j>i; j--) {
				//System.out.print(" ");
			}
			for(int k=0; k<col; k++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		
		/* *
           **
           ***
           **** */
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		
		/*    *
             ***
            *****
           ******* */
		
		for(int i=0; i<row; i++) {
			for(int k=col-1; k>i; k--) {
				//System.out.print(" ");
			}
			for(int l=0; l<i; l++) {
				//System.out.print("*");
			}
			for(int j=0; j<=i; j++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		
		/*    *
             * *
            *   *
           ******* */
		
		
	  /*   *******
            *****
             ***
              * */
		
		for(int i=0; i<row; i++) {
			for(int l=0; l<i; l++) {
				//System.out.print(" ");
			}
			for(int k=0; k<col-i; k++) {
				//System.out.print("*");
			}
			for(int j=1; j<col-i; j++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		
		/* *
           **
           ***
           ****
           ***
           **
           * */
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		for(int i=0; i<row; i++) {
			for(int j=1; j<col-i; j++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		
		/*   *
            ***
           *****
          *******
           *****
            ***
             * */
		
		for(int i=0; i<row; i++) {
			for(int k=col-1; k>i; k--) {
				//System.out.print(" ");
			}
			for(int l=0; l<i; l++) {
				//System.out.print("*");
			}
			for(int j=0; j<=i; j++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		for(int i=0; i<row; i++) {
			for(int l=0; l<=i; l++) {
				//System.out.print(" ");
			}
			for(int k=1; k<col-i-1; k++) {
				//System.out.print("*");
			}
			for(int j=1; j<col-i; j++) {
				//System.out.print("*");
			}
			//System.out.println();
		}
		
	}
}
