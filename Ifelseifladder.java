class Ifelseifladder{

public static void main(String args[]){

System.out.println("main started...");

int num =1001;

if(num >=0  && num <= 9){
    System.out.println("The number is 1 digit number");
}
else if(num >=10 && num <= 99){
    System.out.println("The number is 2 digit number");
}
else if(num >=100  && num <=999){
    System.out.println("The number is 3 digit number");
}
else if(num >=1000  && num <= 9999){
    System.out.println("The number is 4 digit number");
}
else if(num >=10000  && num <= 99999){
    System.out.println("The number is 5 digit number");
}
System.out.println("please provide valid number");

System.out.println("main ended");
}
}