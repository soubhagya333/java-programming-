package jyooo.com.xworks.programs.method.example1;

public class Anusha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop shop = new Shop();
		Book book =  shop.giveBook("madhu", 100);
		book.open();
		book.turnpage();
		book.closebook();

	}

}
