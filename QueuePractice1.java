import java.util.*;

public class QueuePractice1 {
	public static String[] binaryNumber(int n){
		Queue <String> queue= new LinkedList<>();
		queue.add("1");
		
		String[] result = new String[n+1];
		result[0]="0";
		
		for(int i=1;i<=n;i++){			
			result[i]=queue.poll();
			
			queue.add(result[i]+"0");
			queue.add(result[i]+"1");
		}
		return result;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of n : ");
		int n= sc.nextInt();
		
		String[] str = binaryNumber(n);
		System.out.println("1 to "+n+" binary numbers : ");
		for(String item: str){
			System.out.println(item);
		}
	}
}