package jyooo.com.xworks.programs.inheritance.multipleinheritance.example3;

public class Son implements Father,Mother{
	public void work() {
		System.out.println("Father is former");
	}
	public void cook() {
		System.out.println("Mother is cooking");
	}
}
