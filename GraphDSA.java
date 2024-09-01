/*class Graph{
	int vertices;
	int edges;
	int [][] adjMatrix;
	
	public Graph(int nodes){
		this.adjMatrix= new int [nodes][nodes];
		vertices=nodes;
		edges=0;
	}
	
	public void addEdge(int x, int y){
		adjMatrix[x][y] = 1;
		adjMatrix[y][x] = 1;
		edges++;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("there are "+vertices+" vertices and "+edges+" edges in this graph\n");
		for(int i=0;i<vertices;i++){
			sb.append(i+" : ");
			for(int item: adjMatrix[i]){
				sb.append(item+" ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
*/
import java.util.*;
class Graph{//undirected graph
//using adjancency list
	LinkedList <Integer>[] adj;
	int vertices;
	int edges;
	public Graph(int nodes){
		this.adj= new LinkedList[nodes];
		for(int i=0; i<nodes; i++){
			adj[i]= new LinkedList<>();
		}
		this.vertices=nodes;
		this.edges=0;
	}
	public void addEdge(int x, int y){
		adj[x].add(y);
		adj[y].add(x);
		edges++;
	}
	public String toString(){
		String result =vertices+" vertices and "+edges+" edges graph\n";
		for(int i=0;i<vertices;i++){
			result+=i+" : ";
			for(int n: adj[i]){
				result+=n+" ";
			}
			result+="\n";
		}
		return result;
	}
	
	public void bfs(int n){//Breadth firsr search or Level order search
		boolean[] visited= new boolean[vertices];
		visited[n]=true;		
		Queue<Integer> queue= new LinkedList<>();
		queue.add(n);
		System.out.print("BFS : ");
		while(!queue.isEmpty()){
			int v = queue.poll();
			System.out.print(v+" ");
			for(int node: adj[v]){
				if(!visited[node]){
					visited[node]=true;
					queue.add(node);
				}
			}
		}
		System.out.println("");
	}
	public void dfs(int n){//depth first search
	
		boolean[] visited= new boolean[vertices];
		Stack<Integer> s = new Stack<>();
		s.push(n);
		System.out.print("DFS : ");
		while(!s.isEmpty()){
			int node=s.pop();
			
			if(!visited[node]){
				System.out.print(node+" ");
				visited[node]=true;
				for(int v: adj[node]){
					if(!visited[v]){
						s.push(v);
					}
				}
			}
			
		}
		System.out.println("(Using stack)");
	}
	public void dfs(){//Recursive DFS
		boolean [] visited = new boolean[vertices];
		System.out.print("DFS : ");
		for(int v=0; v<vertices; v++){
			if(!visited[v]){
				dfs(v,visited);
			}
		}
		System.out.println("(Using recursion)");
		
	}
	public void dfs(int v, boolean[] visited){//Recurive function
		visited[v]=true;
		System.out.print(v+" ");
		for(int node: adj[v]){
			if(!visited[node]){
				dfs(node,visited);
			}
		}
	}
}


public class GraphDataStructure {
	public static void main(String[] args) {
		Graph g = new Graph(8);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.addEdge(1,4);
		g.addEdge(2,5);
		g.addEdge(2,6);
		
		System.out.println(g);
		g.bfs(6);
		g.dfs(0);
		g.dfs();
	}
}