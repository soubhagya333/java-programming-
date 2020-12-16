package jyooo.com.xworks.programs.pattransprograms.numbers;

//0
//10
//101
//0101
//01010
//101010
//1010101


public class Pattran2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int N= 7;
     int a=0;
     for(int i=0;i<=N-1;i++) {
    	 for(int j=0;j<=i;j++) {
    		 
    		 if(a%2 == 0) {
    			 System.out.print(0);
    		 }
    		 else {
    			 System.out.print(1);
    		 }
    		 a++;
    	 }
    	 System.out.println();
     }
	}

}
