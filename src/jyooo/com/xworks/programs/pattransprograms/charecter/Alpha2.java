package jyooo.com.xworks.programs.pattransprograms.charecter;

public class Alpha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADHU";
		for (int i=0; i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(i == 2) {
					System.out.print(str.charAt(j));
				}
				else if(j ==2) {
					System.out.print(str.charAt(i));
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
