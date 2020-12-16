package jyooo.com.xworks.programs.pattransprograms.prime;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n= 5;
    int count = 0;
    for (int i =2; i<n/2; i++) {
    	if (n %i == 0) {
    		count ++;
    	}
    }
    if (count == 0) {
    	System.out.println("given number is a prime number");
    }
    else
	{
    System.out.println("not");
}
	}
}