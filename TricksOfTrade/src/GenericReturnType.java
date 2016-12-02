
public class GenericReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(max(23,42,1));
		System.out.println(max("Apples","Tots","Chicken"));
		
		
	}

	
	//Generic Method
	public static <T extends Comparable<T>> T max(T a, T b, T c){
		T m = a;
		
		if(b.compareTo(a) > 0)
			m = b;
		if(c.compareTo(m) > 0)
			m = c;
			return m;
			
	}
	
	
}
