import java.util.*;

public class LinkedList {
	
	/*You'll be able to reverse lists with this
	 * if you delete the original list and or even range it for example 1 - 2
	 * you'll be able to delete the group
	 * and the re-create it
	 * 
	 * 
	 */

	public static void main(String[] args){
		
		String[] thing = {"Duck","Apples","oranges","noobs","rookies","CSGO","Group"};
		List<String> list1 = new java.util.LinkedList<String>();
		for(String x : thing)
			list1.add(x);
		
		String[] things2 = {"sausage", "bacon","eggs","goats","noobs"};
		List<String> list2 = new java.util.LinkedList<String>();
		for(String y: list2)
			list2.add(y);
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2,5);
		printMe(list1);
		reverseMe(list1);
		
	}
	
	private static void printMe(List<String> l){
		for(String b : l)
			System.out.printf("%s ", b);
		System.out.println();
			
	}
	//removeStuff method
	//take a portion of it (2,5) and remove it
	private static void removeStuff(List<String> l, int from, int to){
		l.subList(from, to).clear();
		
	}
	//reverseMe 
	private static void reverseMe(List<String> l){
		ListIterator<String> list = l.listIterator(l.size());
		while(list.hasPrevious())
			System.out.printf("%s ", list.previous());
		
	}
	
	
}

