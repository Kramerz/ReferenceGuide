import java.util.*;

public class Methods4List {

	public static void main(String[] args) {
		//create an Array and convert to list
		
		Character[] ray = {'N','O','O','B','S'};
		List<Character> l = Arrays.asList(ray);
		
		System.out.println("List is : ");
		outPut(l);
		
		
		//Reverse and print out the list
		
		Collections.reverse(l);
		System.out.println("After Reverse");
		outPut(l);
		
		
		// create a new Array and a new list
		
		Character[] newray = new Character[5];
		List<Character> listCopy = Arrays.asList(newray);
		
		//Copy contents of list into list copy
		Collections.copy(listCopy, l);
		System.out.println("Copy of list: ");
		outPut(listCopy);
		
		//fill collection with crap
		Collections.fill(l, 'X');
		System.out.println("After filling the list: ");
		outPut(l);
		
	}
	
	//Output method
	private static void outPut(List<Character> thelist){
		
		for(Character thing: thelist)
			System.out.printf("%s\n", thing);
		System.out.println();

	}
	

}
