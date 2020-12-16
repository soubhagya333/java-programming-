package jyooo.com.xworks.programs.pattransprograms;

import java.util.Scanner;

public class FactNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int num = s.nextInt();
		System.out.println("factorial of a number"+num+" is");

	System.out.println(fact(num));
	}
	static int fact(int n) {
		if(n == 1 ||  n == 0)
			return 1;
		return n*fact(n-1);
	}

}
