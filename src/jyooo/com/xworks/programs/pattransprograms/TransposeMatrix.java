package jyooo.com.xworks.programs.pattransprograms;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    		   int[][] arr = new int[3][3];
    
    Scanner s = new Scanner(System.in);
System.out.println("enter the elements of matrix:");
    
    for (int i= 0; i< arr.length;i++) {
    	for(int j=0;j<arr.length;j++) {
    		arr[i][j]= s.nextInt();
    		}
    }
 	
 	   
    System.out.println("transpose  matrix:");
    for (int i= 0; i< arr.length;i++) {
    	for(int j=0;j<arr.length;j++) {
 	   System.out.print(arr[j][i]+ " ");
    	}
    	System.out.println();
    }
    s.close();
	}
}