import java.util.NoSuchElementException;
class Node{
	int data;
	Node next;
	public Node(int d){
		this.data=d;
		this.next=null;
	}
}
class MyQueue{
	Node front;
	Node rear;
	int length;
	
	public MyQueue(){
		front=null;
		rear=null;
		length=0;
	}
	public void enqueue(int d){
		Node temp= new Node(d);
		if(this.isEmpty()){
			rear=temp;
			front=rear;
		}
		else{
			rear.next=temp;
			rear=temp;
		}
		length++;
		
	}
	public int dequeue(){
		if(this.isEmpty()){
			throw new NullPointerException("Queue is empty!");
		}
		int result= front.data;
		front=front.next;
		if(this.length==1){
			rear=null;
		}
		length--;
		return result;
		
	}
	public boolean isEmpty(){
		return front==null;
	}
	public int size(){
		return length;
	}
	@Override
	public String toString(){
		
		if(this.isEmpty()){
			throw new NoSuchElementException("The Queue is empty!");
		}
		String result="["+front.data;
		Node current= front.next;
		while(current!=null){
			result+=","+current.data;
			current=current.next;
		}
		
		
		return result+"]";
	}
}

public class Queue_practice {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		queue.enqueue(1);
		queue.enqueue(5);
		queue.enqueue(2);
		queue.enqueue(7);
		queue.enqueue(10);
		queue.enqueue(23);
		queue.enqueue(11);
		queue.enqueue(41);
		System.out.println("Queue : "+queue);		
		System.out.println("Size : "+queue.size());
		System.out.println("Dequeued(Removed) : "+queue.dequeue());
		System.out.println("Dequeued(Removed) : "+queue.dequeue());
		System.out.println("Updated Queue : "+queue);
		System.out.println("Size : "+queue.size());
		
		
	}
}