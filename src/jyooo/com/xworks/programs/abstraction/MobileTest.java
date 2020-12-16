package jyooo.com.xworks.programs.abstraction;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceProvider airtel= new Airtel();
		ServiceProvider idea = new Idea();
		MiMobile mobile = new MiMobile();
		mobile.simSlot(idea);
		mobile.simSlot(airtel);

	}

}
