package jyooo.com.xworks.programs.pattransprograms.stars;

//
//      *  
//     * * 
//   * * * 
//  * * * * 
//* * * * * 
//

public class Pattran11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int lines=5;
	     int space = lines-1;
	     
	     for(int i=0; i<lines ;i++) {
	    	 for(int j=0; j<space; j++) {
	    		 System.out.print("  ");
	    		 
	    	 }
	    	 for (int k=lines-space; k>0; k--) {
	    		
	    			 System.out.print("* ");
	    	 }
	    		 space--;
	    	
	    		 
	    	 System.out.println();
	     }
		
	
	}
}
