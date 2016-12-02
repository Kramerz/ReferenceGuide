import java.util.PriorityQueue;

public class PriorityQueueV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Using the queue system.
		
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("First");
		q.offer("Second");
		q.offer("Last");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		q.poll();
		System.out.printf("%s ", q);
	
		
	}

}
