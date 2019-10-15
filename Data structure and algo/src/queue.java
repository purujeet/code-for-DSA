
public class queue {
	static int queue[] = new int[1000];
	static int front = 0;
	static int rear = 0;
	
	public static void  push (int r) {
		queue[rear++] = r;
		
	}
	public static int pop() {
		if(front != rear) {
			return queue[front++];
			
		}
		return -1;
		
	}
	public static boolean isEmpty() {
		if(front == rear) {
			return true;
			
		}
		else {
			return false;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(""+pop());
System.out.println(""+isEmpty());
push(1);
push(2);
System.out.println(""+pop());
	}

}
