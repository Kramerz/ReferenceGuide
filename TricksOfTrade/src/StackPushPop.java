import java.util.*;
public class StackPushPop {
	public static void main(String[] args){
		
		
		Stack<String> stack = new Stack<String>();
		stack.push("bottom");
		printStack(stack);
		
		stack.push("Second");
		printStack(stack);
		
		stack.push("last");
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
		stack.pop();
		printStack(stack);
		
	}
	
	//Print stack method
	private static void printStack(Stack<String> s ){
		if(s.isEmpty())
			System.out.println("You have nothing in your stack");
		else
			System.out.printf("%s TOP\n", s);
		
	}
	
	
}
