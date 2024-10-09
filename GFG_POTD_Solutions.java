import java.util.*;
public class SolutionOfPOTD {
	
	/*
	//8_oct_24
	//Largest pair sum
	public static int pairsum(int[] arr) {
        int num1=Integer.MIN_VALUE;
        int num2=num1;
        for(int num : arr){
            if(num>=num1){
                num2=num1;
                num1=num;
            }
            else if(num>num2) num2=num;
        }
        return num1+num2;
    }
    */
    
  /*  //9_oct_24
    static Node construct(int arr[][]) {
        int n=arr.length,m=arr[0].length;
        ArrayList<Node> arrlist= new ArrayList<>();
        for(int i=0;i<n;i++){
        	Node f = new Node(arr[i][0]);
        	Node curr=f;
        	for(int j=1;j<m;j++)curr=curr.right=new Node(arr[i][j]);
        	curr.right=null;
        	arrlist.add(f);
        }
        for(int i=0;i<n-1;i++){
        	Node curr1=arrlist.get(i);
        	Node curr2=arrlist.get(i+1);
        	while(curr1!=null){
        		curr1.down=curr2;
        		curr1=curr1.right;
        		curr2=curr2.right;
        	}
        }
        Node curr = arrlist.get(n-1);
        while(curr!=null){
        	curr.down=null;
        	curr=curr.right;
        }
        return arrlist.get(0);
        
    }*/
	public static void main(String[] args) {
		
	}
}