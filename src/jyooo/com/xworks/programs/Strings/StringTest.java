package jyooo.com.xworks.programs.Strings;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "java";
    String s2 = new String("java");
    System.out.println(s==s2);
    
    String s1 ="java";
    System.out.println(s==s1);
    s = "programming";
    System.out.println(s==s1);
    String str = new String ("Devil");
    String str1 = new String ("Devil");
    String str2 = "devil";
    String str3 = "devil";
    
    System.out.println(str == str1);
    System.out.println(str1== str2);
    System.out.println(str2 == str3);
	}

}
