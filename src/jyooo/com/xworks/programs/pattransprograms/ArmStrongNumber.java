package jyooo.com.xworks.programs.pattransprograms;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
      int num = s.nextInt();
      int result = 0;
      int numCopy = num;
      while(num>0) {
    	  int rem = num%10;
    	  num/=10;
    	  result +=(rem*rem*rem);
      }
	if(result == numCopy)
		System.out.println(numCopy+ " is a arm strong number:");
	else
		System.out.println(numCopy+" is not a arm strong number");
	s.close();
	}
	

}
