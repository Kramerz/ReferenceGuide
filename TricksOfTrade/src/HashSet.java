import java.awt.List;
import java.util.Arrays;
import java.awt.*;




public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//a set is a collection that cannot contain any duplicates
		// this removes the list
		
		
		String[] jump = {"apple","eggs","bob","ham","bob","eggs","bacon"};
		java.util.List<String> list = Arrays.asList(jump);
		
		
		System.out.printf("%s ", list);
		System.out.println();
		
		java.util.Set<String> set = new java.util.HashSet<String>(list);
		System.out.printf("%s ", set);

	}

}
