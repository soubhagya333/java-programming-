package jyooo.com.xworks.programs.constructer.constructer_overloading;

public class Amb {
 String name;
 int noOfParticipents;
 
 Amb(){
	 System.out.println("default constructer");
 }
 
 Amb(String name1){
	 System.out.println("a parameterized constructer");
 name = name1;
 }
 
 Amb(String name2 ,int noOfParticipents1){
	 System.out.println("2 paramiterized constructer");
	 name = name2;
	 noOfParticipents = noOfParticipents1;
 }
}
