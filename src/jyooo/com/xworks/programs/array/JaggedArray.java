package jyooo.com.xworks.programs.array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][] arr = new int [3][3];
      arr[0] = new int[4];
      arr[1]= new int[3];
      arr[2]= new int[2];
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the elements:");
      
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr[i].length;j++) {
    		  arr[i][j] =scan.nextInt();
    	  }
      }
      for(int i=0;i<arr.length;i++) {
    	  for(int j=0;j<arr[i].length;j++) {
    		  System.out.print(arr[i][j]+ " ");
    	  }
      }
System.out.println();      
    
scan.close();
	}
	

}
