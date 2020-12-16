package jyooo.com.xworks.programs.pattransprograms.charecter;

//  a
//  ab
//  abc
//  abcd

public class Pattrancharecter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int lines = 5;
     
     for (int i=0; i<lines; i++) {
    	 char c ='a';
    	 for(int j=0;j<=i;j++) {
    		 System.out.print(c);

    	 c++;
    	 }
    	 System.out.println();
     }
	}

}
