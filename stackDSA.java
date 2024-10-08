import java.util.EmptyStackException;

class Node{
	int data;
	Node next;
	public Node(int d){
		this.data=d;
		this.next=null;
	}
}

class Stack{
	Node top;
	int length;
	public Stack(){
		this.top=null;
		length=0;
	}
	public int size(){
		return length;
	}
	public boolean isEmpty(){
		return top==null;
	}
	public void push(int d){
		Node current= new Node(d);
		
		current.next=top;
		top=current;
		length++;
		
	}
	public int pop(){
		if(top==null){
			throw new EmptyStackException();
		}
		int result = top.data;
		top=top.next;
		length--;
		return result;
	}
	public int peek(){
		if(top==null){
			throw new EmptyStackException();
		}
		return top.data;
	}
}

public class StackDSA {
	public static int[] nextGreaterElement(int[] arr){
	int[] result=new int[arr.length];
	Stack obj=new Stack();
	for(int i=arr.length-1;i>=0;i--){
		if(!obj.isEmpty()) {
			while(!obj.isEmpty()&&obj.peek()<=arr[i]){
				obj.pop();
			}

		}
		if(obj.isEmpty()){ 
			result[i]=-1;
		} 
		else {
			result[ i ] = obj.peek();
		}
		obj.push(arr[ i ]);
	}

return result;
	}
	public static int[] reverseArray(int[] arr){
		//this method use stack to reverse a Array...
		Stack array = new Stack();
		for(int i=0;i<arr.length;i++){
			array.push(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++){
			arr[i]= array.pop();
		}
		return arr;
	}
	public static void main(String[] args) {
		Stack stack = new Stack();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Current stack size: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Current stack size: " + stack.size());
        System.out.println("top element in stack: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        
        int[] arr={1,2,3,4,5};
        arr=reverseArray(arr);
        for(int item:arr){
        	System.out.println(item);
        }
        int[] arr2={4,7,3,4,8,1};
        arr2=nextGreaterElement(arr2);
        System.out.print("("+arr2[0]);
        for(int i=1;i<arr2.length;i++){
        	System.out.print(","+arr2[i]);
        }
        System.out.println(")");
	}
}