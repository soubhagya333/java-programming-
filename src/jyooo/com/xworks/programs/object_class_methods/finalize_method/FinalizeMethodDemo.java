package jyooo.com.xworks.programs.object_class_methods.finalize_method;

public class FinalizeMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("main started");
  Radio radio = new Radio();
  radio.brand = "abc";
  radio.price = 100.00;
  radio = null;
  System.gc();
  System.out.println("main ended");
	}

}
