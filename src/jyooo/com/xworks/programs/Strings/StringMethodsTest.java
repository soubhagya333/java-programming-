package jyooo.com.xworks.programs.Strings;

public class StringMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "vishnu";
    System.out.println("char at the position 2:"+s.charAt(2));
    String concatString = s.concat("flower");
    System.out.println(s);
    System.out.println(concatString);
    System.out.println(s.contains("sh"));
    System.out.println(s.contentEquals("Vishnu"));
    System.out.println(s.endsWith("nu"));
    System.out.println(s.indexOf('h'));
    System.out.println(s.isEmpty());
    System.out.println(s.length());
    String replacedString = s.replace('v', 'V');
    System.out.println(replacedString);
String upperCaseString = s.toUpperCase();
System.out.println(upperCaseString);

String s1 = "Asha is a java trainer";
String stringTrim =s1.trim();
System.out.println(s1);
System.out.println(stringTrim);

String valueOfChar = s.valueOf('A');
String valueOfInt = s.valueOf(12);
System.out.println(valueOfInt);
	}

}
