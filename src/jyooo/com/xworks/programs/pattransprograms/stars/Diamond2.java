package jyooo.com.xworks.programs.pattransprograms.stars;
//          *
//        ***
//      *  *  *
//    *    *    *
//  *      *      *
//***********
//  *      *      *
//    *    *    *
//      *  *  *
//        ***
//          *



public class Diamond2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 int lines=11;
	     int mid = lines/2;
	     int space = mid;
	     int star = 1;
	     
	     for(int i=0; i<lines ;i++) {
	    	 for(int j=0; j<space; j++) {
	    		 System.out.print("  ");
	    		 
	    	 }
	    	 for (int k=star; k>0; k--) {
	    		 int kvalue =star;
	    		 if(k==star|| k==1|| i==mid || k==(kvalue/2+1))
	    		 
	    			 System.out.print("*");
	    		 else
	    			 System.out.print("  ");
	    	 }
	    	 if(i<mid) {
	    		 space--;
	    		star = star+2;
	    	 }
	    	 else {
	    		 space++;
	    		 star = star-2;
	    	 }
	    	 
	    	 System.out.println();
	     }
		
	}

}
