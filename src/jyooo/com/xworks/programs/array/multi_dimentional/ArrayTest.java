package jyooo.com.xworks.programs.array.multi_dimentional;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [][] arr = new int [3][3];
		  
		  int num =100;
		   for(int i=0;i<arr.length;i++) {
			   for(int j=0;j<arr.length;j++) {
				   arr[i][j]= num;
				   num++;
				   
			   }
		   }
		   System.out.println("the elements of the array is");
		   for(int i=0;i<arr.length;i++) {
			   for(int j=0;j<arr.length;j++) {
				   System.out.print(arr[i][j]+ " ");
			   }
			   System.out.println();
	}

	
}
}