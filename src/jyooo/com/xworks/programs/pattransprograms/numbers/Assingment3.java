package jyooo.com.xworks.programs.pattransprograms.numbers;

//
//      1  
//   2  2  2  
//3  3  3  3  3  
//   4  4  4  
//      5  
//      


public class Assingment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfLines=7;
		int mid = noOfLines/2;
		
		int space = mid;
		int n=1;
		for (int i=1; i<noOfLines; i++) {
			for(int j=0; j<=space; j++) {
				System.out.print("   ");

	}
		for (int k=1;k<=n; k++) {
			if(k==1 || k<=n)
	
			System.out.print(i  +"  ");
//			else {
//				
//			}
		}
		if(i<mid) {
			space--;
			n=n+2;
			
		}
		else{
			space++;
			n=n-2;
		}
		System.out.println();
		
	}


	}

}
