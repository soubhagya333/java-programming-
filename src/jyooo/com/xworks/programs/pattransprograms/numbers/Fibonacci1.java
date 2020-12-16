package jyooo.com.xworks.programs.pattransprograms.numbers;

public class Fibonacci1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		int N1 =0;
		int N2 =1;
		int r = N1+ N2;
		
    for(int i=1;i<=N;++i) {
    	for(int j=1;j<=N-i;j++) {
    		System.out.print("  ");
    	}
    	  for(int k= 0; k<=N-i; k++) {
    		
    	  }
    		N1=N2;
    		N2=r;
    		r= N1+N2;
    		
    		System.out.print(r  + "  ");
    		
    	}
    	System.out.println();
    }


}
