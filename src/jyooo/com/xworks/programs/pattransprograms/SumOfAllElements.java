package jyooo.com.xworks.programs.pattransprograms;

import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = new int[5];
       int sum = 0;
       Scanner s = new Scanner(System.in);
System.out.println("enter the elements :");
       
       for (int i= 0; i< arr.length;i++) {
    	   arr [i] = s.nextInt();
;
    	   }
       System.out.println("sum of all array");
       
       for (int i = 0; i<arr.length;i++) {
    	   sum=sum+arr[i];
       }
       System.out.println(sum);
   	s.close();
}
	

}
