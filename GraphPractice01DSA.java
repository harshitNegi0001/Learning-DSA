public class CountIsland {
	public static int countIslands(int[][] grid){
		int m= grid.length;
		int n= grid[0].length;
		int noOfIsland=0;//count islands
		boolean[][] visited= new boolean[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				if(!visited[i][j] && grid[i][j]==1){
					dfs(grid,i,j,visited);
					noOfIsland++;
				}
			}
				
		}
		return noOfIsland;				
	}

	public static void dfs(int[][] grid, int row, int col, boolean[][] visited){
		if(row<0|| col<0|| row>=grid.length|| col>=grid[0].length|| grid[row][col]==0|| visited[row][col] ){
			return;
		}
		visited[row][col]= true;
		dfs(grid,row,col-1,visited);//check left
		dfs(grid,row,col+1,visited);//check right
		dfs(grid,row-1,col,visited);//check up
		dfs(grid,row+1,col,visited);//check down
	}	
	
	public static void main(String[] args) {
		int[][] grid1= new int[4][4];
		grid1[0][0]=1;
		grid1[0][1]=1;
		grid1[1][0]=1;
		grid1[2][2]=1;
		grid1[3][3]=1;
		
		System.out.println("No of island in grid1 = "+countIslands(grid1));
		
		int[][] grid2= new int[4][4];
		grid2[0][1]=1;
		grid2[1][0]=1;
		grid2[1][1]=1;
		grid2[2][1]=1;
		grid2[2][3]=1;
		grid2[3][2]=1;
		grid2[3][3]=1;
		
		System.out.println("No of island in grid2 = "+countIslands(grid2));
	}
}