import java.util.*;
public class Collections_AdAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Take elements from one collection and add to another collection
		
		String[] list1 = {"Wow","World","Question","Guess","Stuff","Babies"};
		List<String> list2 = Arrays.asList(list1);
		
		ArrayList<String> group = new ArrayList<String>();
		group.add("Youtube");
		group.add("gooogle.com");
		group.add("Facebook.com");
		
		for(String x: group)
			System.out.printf("%s " , x);
			
			Collections.addAll(group, list1);
			System.out.println();
			for(String y: list1)
				System.out.printf("%s ", y);
	//Frequency checks one list against another term or element and show's you how many times it's presented		
		
		System.out.println();
		
			System.out.println(Collections.frequency(group, "Youtube"));
			
			boolean tof = Collections.disjoint(group, list2);
			
			System.out.println(tof);
			
	if(tof)
		System.out.println("These lists do not having anything in common");
	
	else
		System.out.println("these lists must have something in commoon!");
			
	}

}
