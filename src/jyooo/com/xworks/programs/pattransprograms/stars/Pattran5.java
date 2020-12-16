package jyooo.com.xworks.programs.pattransprograms.stars;
//            *
//            *             
//            *             
//            *             
//*  *  *  *  *  *  *  * 
//            *             
//            *             
//            *             
//            *             



public class Pattran5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines =9;
		for (int i  = 0; i<lines ; i++) {
			for (int j = 0; j<lines ; j++) {
				if(i==lines/2 || j== lines/2) {
				
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
