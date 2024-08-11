class Node{
	public Node previous;
	public int data;
	public Node next;
	
	public Node(int d){
		this.data=d;
		this.previous=null;
		this.next=null;
	}
	
}

class MyDoublyLinkedList{
	private Node head;
	private Node tail;
	private int length;
	
	public MyDoublyLinkedList(){
		this.head=this.tail=null;
		length=0;		
	}
	public boolean isEmpty(){
		return length==0;
		
	}
	public int size(){
		return length;
	}
	
	public void addFirst(int d){
		Node newNode=new Node(d);
		if(this.isEmpty()){
			tail=newNode;
			head=tail;
		}
		else{
			newNode.next=head;
			head.previous=newNode;
			head=newNode;
				
		}
		this.length++;
	}
	public void addLast(int d){
		Node newNode= new Node(d);
		if(this.isEmpty()){
			tail=newNode;
			head=newNode;
			
		}
		else{
			newNode.previous=tail;
			tail.next=newNode;
			tail=newNode;
			
		}
		length++;
	}
	public void deleteFirst(){
		if(this.isEmpty()){
			System.out.println("Linked list is already empty");
			return;
		}
		if(this.length==1){
			head=tail=null;
			return;
		}
		head=head.next;
		head.previous=null;
		length--;
	}
	public void deleteLast(){
		if(this.isEmpty()){
			System.out.println("Linked list is already empty");
			return;
		}
		if(head==tail){
			head=tail=null;
			return;
		}
		tail=tail.previous;
		tail.next=null;
		length--;
	}
	
	public void printList(){
		if(this.isEmpty()){
			System.out.println("Linked list is empty");
			return ;
		}
		Node tempNode= head;
		while(tempNode!=null){
			System.out.println(tempNode.data);
			tempNode=tempNode.next;
		}
	}
	public boolean search(int keyValue){
		Node tempNode=head;
		while(tempNode!=null){
			if(tempNode.data==keyValue){
				return true;
			}
			tempNode=tempNode.next;
			
		}
		return false;
	}
	
	public void reverseList(){
		Node stPoint=head;
		Node lPoint=tail;
		for(int i=0;i<this.size()/2;i++){
			int temp=stPoint.data;
			stPoint.data=lPoint.data;
			lPoint.data=temp;
			lPoint=lPoint.previous;
			stPoint=stPoint.next;
		}
	}
	
	public int get(int n){
		int count=0;
		Node tempNode=head;
		
		if(n<0||n>=this.size()){
			throw new IndexOutOfBoundsException("given index is out of bound");
		}
		while(count<n){
			tempNode=tempNode.next;
			count++;
		}
		return tempNode.data;
	}
	
}

public class DoublyLinkedListPractice {
	public static void main(String[] args) {
		MyDoublyLinkedList list= new MyDoublyLinkedList();
		list.addFirst(2);
		list.addFirst(4);
		list.addFirst(6);
		list.addFirst(8);
		list.addFirst(10);
		list.addFirst(12);
		list.addFirst(14);
		list.addFirst(16);
		//list.addLast(2);
	//	list.addLast(4);
	//	list.addLast(6);
	//	list.addLast(8);
		list.deleteFirst();
		list.deleteLast();
		list.printList();
		System.out.println("after reverse data");
		list.reverseList();
		list.printList();
		System.out.println("element in index  4: "+list.get(4));
	}
}