package jyooo.com.xworks.programs.has_a_realationship.compositiondemo;

public class Composition {
	public static void main(String[] args) {
		Human h =new Human();
		Heart b =new Heart();
		System.out.println(h.name  +" "+ b.heartbeats());
	}
}