public class FibonacciNumber {
/*	public static int fib(int n){//bottom up approach
		int [] table= new int[n+1];
		table[0]=0;
		table[1]=1;
		for(int i = 2; i<=n; i++){
			table[i]= table[i-1]+ table[i-2];
		}
		return table[n];
	}*/
	
	public static int fib(int n){
		return fib(new int[n+1], n);
	}
	public static int fib(int[] table, int n){//top down approach
		
		if(table[n]==0){
			if(n<2){
				table[n]=n;
			}
			else{
				table[n]=fib(table,n-1)+fib(table,n-2);
			}
		}				
		return table[n];
	}
	public static void main(String[] args) {
		
		
		System.out.println("4th term of fibonnaci numbers = "+fib(4));
	}
}