public class SolutionsOfGFGPractice {
	public boolean isPalindrome(Node head) {
		Node fast = head.next;
		Node slow = head;
		
		while(fast!=null&&fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		Node head2= slow.next;
		slow.next=null;
		//reverse head2 linked list
		Node current=head2;
		Node next = null;
		Node previous= null;
		while(current!=null){
			next= current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		head2=previous;
		//check for palindrome
		Node c1 = head;
		Node c2 = head2;
		while(c1!=null&&c2!=null){
			if(c1.data!=c2.data){
				
				return false;
			}
			c1=c1.next;
			c2=c2.next;
		}
		
		return true;
		
		
	}
	public static void main(String[] args) {
		
	}
}