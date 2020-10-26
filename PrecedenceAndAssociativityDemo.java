class PrecedenceAndAssociativityDemo{

public static void main(String args[]){

int p = 100 , q = 600 , r = 300;

System.out.println(" p+q/r = "+ (p+q/r));//102

System.out.println("p+q-r ="+ (p+q-r));//400

System.out.println("p+q/r+q-r ="+ (p+q/r+q-r ));//402

System.out.println("p+++r =" + (p+++r));//400

}
}