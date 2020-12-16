package jyooo.com.xworks.programs.type_casting;

public class ReferenceTypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//up casting
		Vegitable vegitable = new Vegitable();
		vegitable.wash();
		vegitable.chop();
		
		//down casting
		Vegitable vegitable1 = new Carrot();
Carrot carrot = (Carrot)vegitable1;

carrot.halwa();
	}

}
