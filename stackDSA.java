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
        
	}
}