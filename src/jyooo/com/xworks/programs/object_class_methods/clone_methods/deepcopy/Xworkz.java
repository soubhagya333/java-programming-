package jyooo.com.xworks.programs.object_class_methods.clone_methods.deepcopy;

public class Xworkz implements Cloneable {

	 String name;
	 String founder;
	 String location;
	 Asha asha = new Asha();
	@Override
	public  Xworkz clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Xworkz xworkz = (Xworkz) super.clone();
		xworkz.asha = new Asha();
		return xworkz;
	
	
	}
	@Override
	public String toString() {
		return "Xworkz [name=" + name + ", founder=" + founder + ", location=" + location + ", asha=" + asha + "]";
	}
	
	
  
	 
}
