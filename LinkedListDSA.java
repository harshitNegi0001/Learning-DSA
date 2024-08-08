
class Node{
	int data;
	Node next;
	public Node(int d){
		this.data=d;
		this.next=null;
	}
}
class MyLinkedList{
	private Node head;
	public MyLinkedList(){
		this.head=null;
	}
	
	public void add(int num){
		Node newNode= new Node(num);
		if(this.head==null){
			this.head=new Node(num);
		}
		else{
			newNode.next=head;
			head=newNode;
		}
	}
	public void addLast(int num){
		Node tempNode= head;
		while(tempNode.next!=null){
			
			tempNode=tempNode.next;
		}
		Node newNode= new Node(num);
		tempNode.next=newNode;
	}
	public void printList(){
		if(head==null){
			System.out.println("Linked list is empty");
			return ;
		}
		Node tempNode= head;
		while(tempNode!=null){
			System.out.println(tempNode.data);
			tempNode=tempNode.next;
		}
	}
	public void deleteFirst(){
		if(head==null){
			System.out.println("Linked list is already empty");
			return;
		}
		head=head.next;
	}
	public void deleteLast(){
		if(head==null){
			System.out.println("Linked list is already empty");
			return;
		}
		Node tempNode=head;
		while(tempNode.next.next!=null){
			tempNode=tempNode.next;
		}
		tempNode.next=null;
	}
}

public class Main {
	public static void main(String[] args) {
		MyLinkedList list= new MyLinkedList();
		list.add(10);//add element at head or first
		list.add(20);
		list.add(12);
		list.addLast(1);//add element at last
		list.addLast(28);
		
		list.printList();
		System.out.println("after delete");
		list.deleteFirst();//delete first node
		list.deleteLast();//delete last node
		list.printList();
	}
}