package jyooo.com.xworks.programs.pattransprograms.stars;

//*  *  *  *  *  *  * 
//*  *      *      *  * 
//*      *  *  *      * 
//*  *  *  *  *  *  * 
//*      *  *  *      * 
//*  *     *       *  * 
//*  *  *  *  *  *  * 



public class Pattran10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines =7;
		for (int i  = 0; i<lines ; i++) {
			for (int j = 0; j<lines ; j++) {
				if( i==0|| i==lines-1|| i==3 || i==j || j==0 || j==lines-1 || j==3 ||i+j==lines-1) {
				
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
