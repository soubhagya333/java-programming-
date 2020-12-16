package jyooo.com.xworks.programs.pattransprograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 121;
    int OriginalN = num;
    int MirrorN = 0;
    while(num>0) {
    	int rem = num % 10;
    	MirrorN= MirrorN * 10 + rem;
    	num = num/10;
    }
    System.out.println("MirrorN is: " + MirrorN);
    if (OriginalN == MirrorN) {
    	System.out.println(OriginalN + " is a palindrome");
    }
    else {
    	System.out.println("not palindrome");
    }
	}

}
