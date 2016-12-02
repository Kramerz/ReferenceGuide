import java.awt.List;
import java.util.Arrays;
import java.util.Collections;

public class CollectionMethods {

	//how to sort Collections and convert into Arrays.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// this takes a list and converts it to an Array
		String[] crap = {"World","Apples","lemons","geese","group","bacon","youtube"};
		java.util.List<String> list1 = Arrays.asList(crap);
		
		
		// \n means new line
		Collections.sort(list1);
		System.out.printf("%s\n ", list1);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.printf("%s\n ", list1);
		
		
		
	}

}
