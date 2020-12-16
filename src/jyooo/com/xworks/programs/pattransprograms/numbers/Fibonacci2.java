package jyooo.com.xworks.programs.pattransprograms.numbers;

public class Fibonacci2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=6;
   int a= 0;
   int b=1;
   int c= a+b;
   for (int i =2; i<n ;++i) {
	   for (int j=0; j<=n-i ; j++) {
		   System.out.print("  ");
	   }
	   for(int k= 2 ; k<=i; k++) {
		  
	     c=a+b;
	   a=b;
	   b=c;
	   System.out.print(c  + " ");
	   
   }
   System.out.println();
   }

}
}