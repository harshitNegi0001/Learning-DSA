public class SolutionsOfGFGPractice {
	public boolean isPalindrome(Node head) {
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


	}
	public int getSecondLargest(int[] arr) {
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
	}
	static int majorityElement(int arr[]) {
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
	}
	public static void main(String[] args) {

	}
}