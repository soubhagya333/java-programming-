package jyooo.com.xworks.programs.method.instanceoff;

public class Person {
	void mouth(Sweet s) {
		if(s instanceof Cake) {
			System.out.println("wow.... i got cake");
		}
		else {
			System.out.println("wow... i got chocolate");
		}
	}

}
