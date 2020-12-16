package jyooo.com.xworks.programs.method.example2;

public class Arpita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("arpita going to postoffice to get letter ");
       PostOffice postoffice = new PostOffice();
       
	Letter letter = postoffice.giveLetter();
	
	
	System.out.println("arpita got letter");
	
	System.out.println("arpita reading msg");
	letter.readMsg();
	}
	

}
