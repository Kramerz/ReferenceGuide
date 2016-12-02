import java.util.Arrays;

public class ConvertingListsToArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] stuff = {"baby","csgo","watermelon","melons","group","sync"};
		java.util.LinkedList<String> thelist = new java.util.LinkedList<String>(Arrays.asList(stuff));
		
		thelist.add("pumpikinf");
		thelist.addFirst("firsthing");
		
		//Convert back to an array
		stuff = thelist.toArray(new String[thelist.size()]);
		
		for(String x : stuff)
			System.out.printf("%s ", x);
		
		
	}

}
