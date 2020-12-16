package jyooo.com.xworks.programs.pattransprograms;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num = 10;
  int sum= 0;
  for (int i =1; i<=num/2;i++) {
	  if(num %i == 0) {
		  sum+=i;
	  }
  }
  if(num == sum) {
	  System.out.println( num+" " + "is a perfect number");
	}
	else {
		System.out.println(num +" " + "is not perfect number");
	}

}
}
