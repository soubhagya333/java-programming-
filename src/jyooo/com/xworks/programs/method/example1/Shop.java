package jyooo.com.xworks.programs.method.example1;



public class Shop {
	Book giveBook(String name, int pages){
		Book book = new Book();
		book.name = name;
		book.pages= pages;
		return book;
	}

}
