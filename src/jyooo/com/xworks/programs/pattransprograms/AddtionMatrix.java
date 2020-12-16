package jyooo.com.xworks.programs.pattransprograms;

import java.util.Scanner;

public class AddtionMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.println("enter thre row length :");
     int rowLength  =s.nextInt();
     System.out.println("enter the col length:");
     int colLength = s.nextInt();
     int [][] arr = new int [rowLength][colLength];
     int [][] arr1 = new int [rowLength][colLength];
     
     System.out.println("enter the elements for matrix 1:");
     
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr.length;j++) {
    		  arr[i][j] = s.nextInt();
    	  }
      }
      System.out.println("enter the elements for matrix 2:");
      
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr.length;j++) {
    		  arr1[i][j] = s.nextInt();
	}
      }
      
	

System.out.println("the addition of matrix 1 and matrix 2 is:");

System.out.println("matrix are:");
int[][] result = new  int [3][3];
for (int i=0; i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		result[i][j] = arr[i][j]+arr1[i][j];
	
	System.out.print(result [i][j]);
	
	}
	System.out.println();
	s.close();

	
}
	}
}
      