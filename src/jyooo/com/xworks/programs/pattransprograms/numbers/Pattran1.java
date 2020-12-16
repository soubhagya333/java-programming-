package jyooo.com.xworks.programs.pattransprograms.numbers;
//
//      0
//    101
//  21012
//3210123

public class Pattran1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R = 4;
		int space = R-1;
		int C = 1;
		for (int i = 1;i<=R;i++) {
			int N = R-space-1;
			for (int j = 1; j<=space;j++) {
				System.out.print("  ");
			}
			for(int k=1; k<=C;k++) {
				System.out.print(N);
				if(k<=C/2)
					N--;
				else
					N++;
			}
			C+=2;
			space--;
			System.out.println();
			}
		

	}

}
