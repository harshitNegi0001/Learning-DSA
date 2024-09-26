import java.util.*;
public class SolutionsOfGFGPractice {
	/*public boolean isPalindrome(Node head) {
		Node fast = head.next;
		Node slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		Node head2 = slow.next;
		slow.next = null;
		//reverse head2 linked list
		Node current = head2;
		Node next = null;
		Node previous = null;
		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		head2 = previous;
		//check for palindrome
		Node c1 = head;
		Node c2 = head2;
		while (c1 != null && c2 != null) {
			if (c1.data != c2.data) {

				return false;
			}
			c1 = c1.next;
			c2 = c2.next;
		}

		return true;


	}*/
	/*	public int getSecondLargest(int[] arr) {
			int max = arr[0];
			int secMax = -1;
			for (int e : arr) {
				if (max < e) {
					secMax = max;
					max = e;
				} else if (secMax < e && e < max) {
					secMax = e;
				}
			}
			return secMax;

		/*static int majorityElement(int arr[]) {
			int m = arr[0];//most time repeated element
			int f = 1;
			for (int i = 1; i < arr.length; i++) {
				if (m == arr[i]) {
					f++;
				} else {
					f--;
					if (f < 1) {
						m = arr[i];
						f = 1;
					}
				}
			}
			//frequency of m
			f = 0;
			for (int e : arr) {
				if (e == m) {
					f++;
				}
			}

			return (f > arr.length / 2) ? m : -1;
		}*/
	/*	public int maxStep(int arr[]) {
	        int result=0;
	        int steps=0;
	        for(int i=1;i<arr.length-1;i++){
	        	if(arr[i-1]<arr[i]){
	        		steps++;
	        	}
	        	else{
	        		steps=0;
	        	}
	        	result=Math.max(result,steps);
	        }
	        return result;
	    }*/

	/*  boolean isBST(Node root) {
	      return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	  }
	  boolean isBST(Node root,int minVal,int maxVal){
	  	if(root==null) return true;
	  	if(root.data<=minVal||root.data>=maxVal) return false;
	  	return (isBST(root.left,minVal,root.data)&& isBST(root.right,root.data,maxVal));
	  	//checks left and right bt for bst
	  }*/
	ArrayList<Integer> leftView(Node root) {
		ArrayList<Integer> result = new ArrayList<>();
		if (root == null) return result;
		leftView(root, 0, result);
		return result;
	}
	void leftView(Node root, int level, ArrayList result) {
		if (result.size() == level) result.add(root.data);
		if (root.left != null) leftView(root.left, level + 1, result);
		if (root.right != null) leftView(root.right, level + 1, result);
	}


	public static void main(String[] args) {

	}
}