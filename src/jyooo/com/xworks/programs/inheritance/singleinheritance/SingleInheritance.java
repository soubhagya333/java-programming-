package jyooo.com.xworks.programs.inheritance.singleinheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Machine m = new Machine();
			Computer c = new Computer();
			System.out.println("properties of Machine");
			m.storage();
			m.generation();
			m.speed();
			System.out.println("properties of Computer");
			c.generation();
			c.grapics();
			c.speed();
			c.storage();
			c.operatingSystem();
	}

}

