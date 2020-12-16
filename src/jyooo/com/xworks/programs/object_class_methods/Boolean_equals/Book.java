package jyooo.com.xworks.programs.object_class_methods.Boolean_equals;
public class Book {
   String brand;
   int noOfPages;
   double price;
    public Book(String brand,int noOfPages,double price) {
	   this.brand = brand;
	   this.noOfPages = noOfPages;
	   this.price = price;  	   
   }
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(obj instanceof Book) {
		Book bobj =((Book) obj);
	if(this.brand.equals(bobj.brand)) {
	if(this.noOfPages == bobj.noOfPages) {
	if(this.price == bobj.price) {
		return true;
	}  
}
else {
	return false;
}
}
else {
	return false;
}
}
else {
	return false;
}
return false;
}
}