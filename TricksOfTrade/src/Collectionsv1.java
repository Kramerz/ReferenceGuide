import java.util.*;

public class Collectionsv1 {
//This program is able to add / remove items in a specific list.
	// If there is a string value in one list it will remove it from the other list
	// Simple tool that may come in handy later on for NEO
	// Created by: Ryan William West (NCS)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] things ={"v-rywes","v-kamilah","V-madaws","v-iacoop"};
		List<String> list1 = new ArrayList<String>();
		
		//Add array items to list
		
		for(String x: things)
			list1.add(x);
		
		
		String[] additionalThings = {"v-rywes","v-iacoop"};
		List<String> list2 = new ArrayList<String>();
		for(String y: additionalThings)
			list2.add(y);
		
		for(int i =0; i<list1.size(); i++){
			System.out.printf("%s ", list1.get(i));
			
		}
		
		
		editlist(list1, list2);
		System.out.println();
		
		for(int i =0; i<list1.size(); i++){
			System.out.printf("%s ", list1.get(i));
			
		}
	}

	public static void editlist(Collection<String> l1, Collection<String> l2){
		
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){
			if(l2.contains(it.next()))
				it.remove();
			
			
		}
		
	}
	
	
}
