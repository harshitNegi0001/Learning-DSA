
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
		if(this.isEmpty()){
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
	public void deleteFirst(){
		if(this.isEmpty()){
			System.out.println("Linked list is already empty");
			return;
		}
		head=head.next;
	}
	public void deleteLast(){
		if(this.isEmpty()){
			System.out.println("Linked list is already empty");
			return;
		}
		Node tempNode=head;
		while(tempNode.next.next!=null){
			tempNode=tempNode.next;
		}
		tempNode.next=null;
	}
	
	public int size(){
		Node tempNode=head;
		int length=0;
		while(tempNode!=null){
			length++;
			tempNode=tempNode.next;
		}
		return length;
	}
	public boolean isEmpty(){
		return head==null;
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
	public void printReverse(){
		Node current=head;
		Node next=null;
		Node previous=null;
		
		while(current!=null){
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
			
			
		}
		head=previous;

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
	
	public void sortList(){//using BubbleSort
		
		int length=this.size();
		for(int x=0;x<length-1;x++){
			
			if(this.isSorted()){
				break;
			}
			Node current=head;
			for(int y=0;y<length-1-x;y++){
				if(current.data>current.next.data){
					int temp= current.data;
					current.data=current.next.data;
					current.next.data=temp;
				}
				current=current.next;
				
			}
		}
		
		
	}
	public void deleteDuplicate(){//work on  only sorted linked list
		Node current=head;
		Node next=current.next;
		while(next.next!=null){
			if(current.data==next.data){
				current.next=next.next;
				next.next=null;
				next=current.next;
			}
			else{
				current=current.next;
				next=next.next;
			}
		}
		
			
	}
	public void insert(int item){//insert element on sorted list
		Node tempNode=new Node(item);
		if(head.data>item){
			tempNode.next=head;
			head=tempNode;
			
			return;
		}
		Node current=head;
		while(current!=null){
			if(current.next==null||current.next.data>item){
				tempNode.next=current.next;
				current.next=tempNode;
				
				return;
			}
			current=current.next;
			
		}
	}
	public boolean isSorted(){
		Node current=head;
		boolean flag=true;
		while(current.next!=null){
			if(current.data>current.next.data){
				flag=false;
			}
			current=current.next;
		}
		return flag;
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
	//	System.out.println(list.isSorted());
	//	list.printList();
		//System.out.println("size of linkedlist is = "+list.size());
	//	System.out.println("after delete");
		//list.deleteFirst();//delete first node
	//	list.deleteLast();//delete last node
	//	list.printList();
	//	System.out.println("size of linkedlist is = "+list.size());
	//	System.out.println(list.search(10));
	//	list.printReverse();
	//	System.out.println(list.get(1));
	
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(10);
		list.add(20);
		list.add(12);
		list.add(43);
		list.add(32);
		list.add(30);
		list.add(18);
		list.add(22);
		list.add(18);
		
		list.sortList();
		list.deleteDuplicate();
		
	
		list.insert(0);
		list.insert(11);
		list.insert(102);
		
		list.printList();
		//System.out.println(list.isSorted());
	}
}
