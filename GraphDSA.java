class Graph{
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

public class GraphDataStructure {
	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(1,2);
		g.addEdge(1,3);
		g.addEdge(2,3);
		System.out.println(g);
	}
}