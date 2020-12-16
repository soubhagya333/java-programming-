package jyooo.com.xworks.programs.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuffer sbr = new StringBuffer("machine");
   StringBuffer sbr1 = sbr.append("learning");
   System.out.println(sbr == sbr1);
   
   StringBuffer sbr2 =new StringBuffer();
   System.out.println("capacity:"+sbr2.capacity());
   sbr2.append("StringBuffer demo");
   System.out.println(sbr2);
   
	}

}
