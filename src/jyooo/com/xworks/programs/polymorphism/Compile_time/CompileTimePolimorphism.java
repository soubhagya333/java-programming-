package jyooo.com.xworks.programs.polymorphism.Compile_time;

public class CompileTimePolimorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short i = 10;
		short j= 20;
		int result = sum(i,j);
		  System.out.println(result);
			}
		 static int sum(int a , int b) {
			 return a+b;


	}
		 static int sum(int a, int b,int c) {
		 return a+b+c;
}
		 static int sum(short a, short b) {
			 return a+b;
		 }

}
