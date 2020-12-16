package jyooo.com.xworks.programs.array.custom_array;

public class NewsPaper {

	
		String name;
		String language;
		int noOfPages;
		double price;
		
		public NewsPaper(String name,String language,int noOfPages,double price) {
			this.name = name;
			this.language =language;
			this.noOfPages =noOfPages;
			this .price =price;
			
		}

		@Override
		public String toString() {
			return "NewsPaper [name=" + name + ", language=" + language + ", noOfPages=" + noOfPages + ", price="
					+ price + "]";
		}

	}

