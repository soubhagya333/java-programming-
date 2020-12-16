package jyooo.com.xworks.programs.array;

import java.util.Arrays;

import static java.util.Arrays.*;

public class ArrayClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] array = {2,3,4,4,5};
     sort(array);
     System.out.println(Arrays.toString(array));
     
     int[] copy = Arrays.copyOf(array, 3);
     System.out.println(Arrays.toString(copy));
     
     int [] copyRange = Arrays.copyOfRange(array, 2, 4);
     System.out.println(Arrays.toString(copyRange));
     
     Arrays.fill(copyRange, 2);
     System.out.println(Arrays.toString(copyRange));
     
     System.out.println(Arrays.binarySearch(array, 4));
 }

}
