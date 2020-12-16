package jyooo.com.xworks.programs.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int[5];
	   	int i;
		Scanner s = new Scanner(System.in);
	       	System.out.println("enter elements of the array");
		for(i=0; i<5 ; i++) {
			arr[i]= s.nextInt();
			}
		
		    System.out.println("\n content of the array");
		for(i=0 ; i<5 ; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n content of the reverse array");
		
		for(i =4;i>=01;i--) {
   System.out.println(arr[i]); 
   
	}
}
}