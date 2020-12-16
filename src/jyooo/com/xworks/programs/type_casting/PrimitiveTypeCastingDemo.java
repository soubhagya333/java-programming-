package jyooo.com.xworks.programs.type_casting;

public class PrimitiveTypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// implicit type casting
		int i =10;
		long j= i;
		System.out.println("i:" +i);
		System.out.println("j:" +j);
		
		//explicit type casting 
		long x= 1000000000L;
		int y = (int)x;
		System.out.println("x:" +x);
		System.out.println("y:" +y);
		
	}

}
