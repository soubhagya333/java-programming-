package jyooo.com.xworks.programs.pattransprograms.numbers;

//      1  
//   2  2  2  
//3  3  3  3  3  
//


public class Assingment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfLines=7;
		int mid = noOfLines/2;
		
		int space = mid;
		int n=1;
		for (int i=1; i<noOfLines-mid; i++) {
			for(int j=0; j<=space; j++) {
				System.out.print("   ");

	}
		for (int k=1;k<=n; k++) {
			System.out.print(i +"  ");
		}
		if(i<mid) {
			space--;
			n=n+2;
			
		}
		System.out.println();
		
	}

}
}