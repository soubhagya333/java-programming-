package jyooo.com.xworks.programs.constructer.constructer_overloading;



public class ConstructerOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Amb amb = new Amb();
		    System.out.println(amb.name);
		System.out.println(amb.noOfParticipents);

		Amb amb1= new Amb("amb");
		System.out.println(amb1.name);
		System.out.println(amb1.noOfParticipents);
		
		Amb amb2 = new Amb("Amb",17);
		System.out.println(amb2.name);
		System.out.println(amb2.noOfParticipents);

	}

}
