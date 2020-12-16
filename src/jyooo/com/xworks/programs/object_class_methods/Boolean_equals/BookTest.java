package jyooo.com.xworks.programs.object_class_methods.Boolean_equals;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Book b = new Book("vidya",100,30.00);
    Book b1 = new Book("vidya",100,30.00);
    boolean isEqual = b.equals(b1);
    System.out.println(isEqual);
	}

}
