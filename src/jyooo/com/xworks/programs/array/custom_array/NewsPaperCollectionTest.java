package jyooo.com.xworks.programs.array.custom_array;

public class NewsPaperCollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    NewsPaper hindu = new NewsPaper("Hindu","english",12,5.00);
    NewsPaper prajavani = new NewsPaper("prajavani","kannada",8,4.00);
    NewsPaper deccan = new NewsPaper("deccan","english",10,6.00);
    
    NewsPaper[] newsPapers = {hindu,prajavani,deccan};
    
    System.out.println("names of newspapers:");
    
    for(int i=0;i<newsPapers.length;i++) {
    	System.out.println(newsPapers[i]);
    	
    }

}
}