
public class Stack {

	 static int stack[] = new int[1000];
	 static int top = 0;
	
	public static  void push(int r) {
		stack[top++] = r;

	}
	
	public static  int pop() {
		if(Stack.isEmpty())
			return -1;
		
		
			top--;
			return stack[top];
	
		}
	
	public static  boolean isEmpty() {
		if(top < 0) 
			return true;
	
		
			return false;
	}
	public static  int peek() {
		if(Stack.isEmpty())
			return -1;
		
			return stack[top - 1];
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Stack.push(1);
Stack.push(2);
Stack.push(3);
Stack.push(4);
Stack.push(5);

	System.out.println(""+Stack.pop());
	System.out.println(""+ Stack.pop());
	System.out.println(""+ Stack.peek());
	}

}
