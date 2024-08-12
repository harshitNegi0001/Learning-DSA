
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
			this.head=newNode;
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
		if(head.next==null){
			head=null;
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
	public void reverseList(){
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
		while(current!=null&& current.next!=null){
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
		if(head==null){
			head=tempNode;
			return;
		}
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
		
		while(current.next!=null){
			if(current.data>current.next.data){
				return false;
			}
			current=current.next;
		}
		return true;
	}
	
	//11_aug_2024
	public boolean containsLoop(){
		Node fast = head;
		Node slow = head;
		while(fast!=null&& fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				return true;
			}
			
		}
		return false;
		
	}
	public void createLoop(){
		
		Node current=head;
		for(int i=0;i<this.size()-1;i++){
			current=current.next;
		}
		current.next=head.next.next.next;
		return;
	}
	
	public Node findLoopStart(){
		Node fast = head;
		Node slow = head;
		while(fast!=null&& fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				return getStartNode(slow);
			}
			
		}
		return null;
	}
	public Node getStartNode(Node slow){
		Node current=head;
		while(slow!=current){
			slow=slow.next;
			current=current.next;
			
		}
		return current;
	}
	public void removeLoop(){
		
		Node fast = head;
		Node slow = head;
		while(fast!=null&& fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow){
				this.deleteLoop(slow);
			}
			
		}
		
	}
	
	public void deleteLoop(Node slow){
		Node current= head;
		while(slow.next!=current.next){
			slow=slow.next;
			current=current.next;
			
		}
		slow.next=null;
		System.out.println("Loop has been removed");
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
	//	list.reverseList();
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
		list.add(43);
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
		
		
		list.createLoop();
		System.out.println(list.containsLoop());
		System.out.println(list.findLoopStart().data);
		list.removeLoop();
		list.printList();
		System.out.println(list.containsLoop());
	
	
		
	}
}