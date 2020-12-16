package jyooo.com.xworks.programs.has_a_realationship.Aggragationdemo;

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library library = new Library();
		//maintain m= new maintain();
		System.out.println("Library name :" + library.name);
		System.out.println("Library has a Student:" + library.s.name);
	}

}
