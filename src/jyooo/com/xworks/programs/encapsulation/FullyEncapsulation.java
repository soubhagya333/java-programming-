package jyooo.com.xworks.programs.encapsulation;

public class FullyEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag bag = new Bag();
		bag.setBrand("wild craft");
		bag.setColor("black");
		bag.setPrice(1000.00);
		
		System.out.println(bag.getBrand());
		System.out.println(bag.getColor());
		System.out.println(bag.getPrice());

	}

}
