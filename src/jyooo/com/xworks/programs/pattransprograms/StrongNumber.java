package jyooo.com.xworks.programs.pattransprograms;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 133;
    int copy = num;
    int sum = 0;
    while(num>0) {
    	int rem = num%10;
    	num/=10;
    	int fact = 1;
    	for (int i = rem;i>1;i--) {
    		fact*=i;
    		
    	}
    	sum+=fact;
    }
    	if (sum==copy)
    		System.out.println(copy +  " is strong number");
    	else
    		System.out.println(copy + "  is not strong number");
    }
	}

