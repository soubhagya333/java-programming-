package jyooo.com.xworks.programs.array.multi_dimentional;

public class ArrayLiteralTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	System.out.println("The elements of the array is:");
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

}
