import java.util.Scanner;

class BFS {
	queue q[] = new queue[1000];
	static int graph[][] = new int[1000][1000];
	int MAX = (int) 1e9;
	static int V;
	static int E;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		V = sc.nextInt();
		E= sc.nextInt();
		int x ,y;
		
		for(int i= 0;i<= E;i++) {
		x = sc. nextInt();
		y = sc.nextInt();
		
		
		graph[x][y] = 1;
		graph[y][x] = 1;
		
		}
		
		for(int i = 1;i<=V;i++) {
			for(int j = 1;j<=V;j++) {
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		int distance[] = new int[V+1];
		int isVisited[] = new int[V+1];
		
		
		for(int  i =0 ;i<= V;i++) {
			distance[i] = (int)1e9;
			isVisited[i] = 0;
			
		}
		
	}

}
