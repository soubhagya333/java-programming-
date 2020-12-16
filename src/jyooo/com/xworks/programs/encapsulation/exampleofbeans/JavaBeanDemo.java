package jyooo.com.xworks.programs.encapsulation.exampleofbeans;

public class JavaBeanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table table = new Table();
		table.setMaterial("wood");
		table.setShape("round");
		table.setPrice(5000.00);
		table.setHeight(5.0);
		
		System.out.println(table.getMaterial());
		System.out.println(table.getShape());
		System.out.println(table.getPrice());
		System.out.println(table.getHeight());
	}

}