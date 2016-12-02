public class recursion {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(150));
		
		
		
	}

	public static long fact(long n){
		if(n <= 1)
			return 1;
		else
			return n * fact(n-1);
		
	}
	
}
