package jyooo.com.xworks.programs.inheritance.multipleinheritance.example1;

public class TaxCalculator implements StateTax,CentralTax{
	public void roadTax() {
		System.out.println("road tax of Central tax");
	}
	public void waterTax() {
		System.out.println("road tax of State tax");
	}
}
