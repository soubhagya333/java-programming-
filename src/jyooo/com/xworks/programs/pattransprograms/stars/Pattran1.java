package jyooo.com.xworks.programs.pattransprograms.stars;
//*  *  *  * 
//*          * 
//*          * 
//*  *  *  * 


public class Pattran1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines =4;
		for (int i  = 0; i<lines ; i++) {
			for (int j= 0; j<lines ; j++) {
				if( i== 0 || i==3 || j==0 || j==3)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}
}

