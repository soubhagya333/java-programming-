package jyooo.com.xworks.programs.object_class_methods.get_class;

public class getclassMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bulb bulb = new Bulb();
		
//		 bulb.getClass();
//		System.out.println(bulb);
		//this above code gives fully collified class name with #hexadecimal number
		 
		System.out.println("class name of bulb object : " + bulb.getClass().getSimpleName());
	}
	

}
