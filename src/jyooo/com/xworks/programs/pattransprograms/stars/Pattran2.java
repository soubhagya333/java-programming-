package jyooo.com.xworks.programs.pattransprograms.stars;
//
//*  *  *  *  *  *  * 
//*  *              *  * 
//*     *       *      * 
//*         *           * 
//*     *     *        * 
//*  *           *     * 
//*  *  *  *  *  *  * 

public class Pattran2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines =5;
		for (int i  = 0; i<lines ; i++) {
			for (int j= 0; j<lines ; j++) {
				if(i==0||j==0|| i==j || i==lines-1 || j == lines-1||i+j==lines-1)
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

