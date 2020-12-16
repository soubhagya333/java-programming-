package jyooo.com.xworks.programs.object_class_methods.finalize_method;

public class Radio {
  String brand;
  double price;
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("finalize() method overriden");

	
  
}
}
