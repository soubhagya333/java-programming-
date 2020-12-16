package jyooo.com.xworks.programs.object_class_methods.clone_methods.deepcopy;

public class DeepcopyDemo{
	public static void main(String[] args) throws CloneNotSupportedException {
		Xworkz xworkz = new Xworkz();
		xworkz.name = "xworkz";
		xworkz.founder = "omkar";
		xworkz.location = "Rajajinagar";
		xworkz.asha.name ="asha";
		xworkz.asha.Dob = "29- 12- 1992";
		Xworkz duplicateXworkz  =  xworkz.clone();
		
		duplicateXworkz.founder = "Prajwal";
		duplicateXworkz.asha.Dob = "29- 9 1993";
		duplicateXworkz.asha.name ="asha";    
		System.out.println(xworkz);
		System.out.println(duplicateXworkz);
	
	}

	@Override
	public String toString() {
		return "DeepcopyDemo []";
	}
	

}
