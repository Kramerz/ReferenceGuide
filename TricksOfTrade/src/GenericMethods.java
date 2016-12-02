import java.util.*;

public class GenericMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Generic Method
		// A way to eliminate overloaded method
		
		Integer[] iray = {1,2,3,4,5};
		Character[] cray = {'b','c','d','r','f'};
		
		printMe(iray);
		printMe(cray);
		
		
		
		
	}

	//Generic method
	public static <T> void printMe(T[] X){
		for(T b: X)
			System.out.printf("%s ",b);
		System.out.println();
	
	}

	}
	

