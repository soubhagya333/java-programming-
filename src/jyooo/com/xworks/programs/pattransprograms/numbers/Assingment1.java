package jyooo.com.xworks.programs.pattransprograms.numbers;

//         1
//      1  2  3
//   1  2  3  4  5
//1  2  3  4  5  6  7  



public class Assingment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfLines=7;
		int mid = noOfLines/2;
		int space = mid;
		int n=1;
		for (int i=0; i<noOfLines-mid; i++) {
			for(int j=0; j<=space; j++) {
				System.out.print("   ");

	}
		for (int k=1;k<=n; k++) {
			System.out.print(k + "  ");
		}
		if(i<mid) {
			space--;
			n=n+2;
			
		}
		System.out.println();
		
}
}
}