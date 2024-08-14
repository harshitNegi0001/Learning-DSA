class Node{
	int data;
	Node next;
	public Node(int d){
		this.data=d;
		this.next=null;
	}		
}

class CircularLinkedList{
	Node head;
	Node tail;
	int length;
	public CircularLinkedList(){
		this.head=this.tail=null;
		this.length=0;
	}
	
	public void addInFront(int d){
		Node current= new Node(d);
		if(this.head==null){
			this.tail=current;
			this.head=tail;
			tail.next=head;
			length++;
			return;
		}
		
		
		current.next=head;
		head=current;
		tail.next=head;
		length++;
	}
	public void addInEnd(int d){
		Node current= new Node(d);
		if(this.head==null){
			this.tail=current;
			this.head=tail;
			tail.next=head;
			length++;
			return;
		}
		current.next=head;
		tail.next=current;
		tail=current;
		
		
		length++;
	}
	
	public void printList(){
		if(head==null){
			System.out.println("list is empty");
			return;
		}
		if(head==tail){
			System.out.println(head.data);
			return;
		}
		
		Node current=head;
		while(current!=tail){
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(tail.data);
		
	}
	
	public void removeFromFront(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		if(this.length==1){
			head=null;
			tail=null;
			length--;
			return;
		}
		
		head=head.next;
		
		tail.next=head;
		length--;
	}
	public int size(){
		return this.length;
	}
	
	public void removeFromEnd(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		if(this.length==1){
			head=null;
			tail=null;
			length--;
			return;
		}
		Node current=head;
		while(current.next!=tail){
			current=current.next;
		}
		tail=current;
		tail.next=head;
		length--;
		
	}
}

public class CircularListPractice {
	public static void main(String[] args) {
		CircularLinkedList list= new CircularLinkedList();
		
		list.addInFront(2);
		list.addInFront(1);
		list.addInEnd(3);
		list.addInEnd(4);
		list.printList();
		list.removeFromFront();
		list.removeFromEnd();
		System.out.println("after delete");
		list.printList();
	}
}