package jyooo.com.xworks.programs.pattransprograms.charecter;

//    a
//  aba
//abcba
//  aba
//    a
//




public class Alpha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  noOfLines = 5;
        int mid =noOfLines/2;
        int space = mid;
        int letters = 1;
        for (int i= 0;i<noOfLines ;i++) {
        	for(int j=0;j<space;j++) {
        		System.out.print("   ");
        	}
        	 char kvalue = 'a';
        	 for (int k=0;k<letters;k++) {
        		 System.out.print(kvalue + " ");
        		 if(k<letters/2)
        			 kvalue++;
        		 else
        		 kvalue--;
        	 }
        	 if(i<mid) {
        		 space--;
        		 letters = letters +2;
        	 }
        	 else {
        		 space++;
        	 letters = letters - 2;
        }
    System.out.println();	
	}
	
	}
}