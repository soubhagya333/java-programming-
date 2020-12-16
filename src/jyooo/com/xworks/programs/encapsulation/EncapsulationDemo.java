package jyooo.com.xworks.programs.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waterbottle waterBottle = new Waterbottle();
		waterBottle.setColor("blue");
				waterBottle.setPrice(50.00);
				
				System.out.println(waterBottle.getColor());
				System.out.println(waterBottle.getPrice());

	}

}
