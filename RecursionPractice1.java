public class Recursion_Practice01 {
	public static int fibonacci(int n){
		return (n<=1)?n:fibonacci(n-1)+fibonacci(n-2);
	}
	
	
	
	public static int digitSum(int n){
		return (n/10<=0)?n:n%10+digitSum(n/10);
	}
	
	public static int factorial(int n){
		return (n==1||n==0)?1:n*factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(10));
		System.out.println(fibonacci(10));
		System.out.println(digitSum(123456));
		
	}
}