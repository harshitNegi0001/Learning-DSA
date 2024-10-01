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
	/*	ArrayList<Integer> leftView(Node root) {
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
	*/
	/*public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
		ArrayList<Integer> result = new ArrayList<>();
		Deque<Integer> deque = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			if (!deque.isEmpty() && deque.getFirst() == i - k) deque.removeFirst();
			while (!deque.isEmpty() && arr[deque.getLast()] <= arr[i])deque.removeLast();
			deque.add(i);
			if (i >= k - 1)result.add(arr[deque.getFirst()]);
		}
		return result;
	}*/
	/*int maxSubarraySum(int[] arr) {
		int currentSum=0;
		int maxSum= Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
		      if(currentSum<=0) currentSum=arr[i];
		      else currentSum+=arr[i];
		      maxSum=Math.max(maxSum,currentSum);
		}
	    return maxSum;
	}*/
	/*	public void sort012(ArrayList<Integer> arr) {
			int i = 0, j = 0, k = arr.size() - 1;
			while (j < k) {
				if (arr.get(j) == 0) swap(arr, j++, i++);
				else if (arr.get(j) == 1) j++;
				else swap(arr, j, k--);
			}
		}
		public void swap(ArrayList<Integer> arr, int i1, int i2) {
			int temp = arr.get(i1);
			arr.set(i1, arr.get(i2));
			arr.set(i2, temp);
		}*/
	//public int help(int i,int k, int[] arr,int[] dp){
//		if(i==arr.length-1) return 0;
//		if(dp[i]!=-1) return dp[i];
//		int ans = Integer.MAX_VALUE;
//		for(int j= i+1; j<=i+k&&j<arr.length;j++){
//			int cost = Math.abs(arr[i]-arr[j])+help(j,k,arr,dp);
//			ans=Math.min(ans,cost);
//		}
//
//		return dp[i]=ans;
//	}
//	public int minimizeCost(int k, int arr[]) {
//        int [] dp= new int[arr.length-1];
//        Arrays.fill(dp,-1);
//        return help(0,k,arr,dp);
//    }


	// arr[]: Input Array
	// N : Size of the Array arr[]
	// Function to count inversions in the array.
	//static long inv;
//    static void mergeSort(long [] arr,int l,int r){
//        if(l>=r)return;
//        int mid = l+(r-l)/2;
//        mergeSort(arr,l,mid);
//        mergeSort(arr,mid+1,r);
//        merge(arr,l,mid,r);
//    }
//    static void merge(long [] arr,int l, int mid, int r){
//        long[] c= new long[r-l+1];
//        int i=l,j=mid+1;
//        int k=0;
//        while(i<=mid&&j<=r){
//            if(arr[i]>arr[j]) {
//                inv+=mid-i+1;
//                c[k++]=arr[j++];
//            }
//            else c[k++]=arr[i++];
//        }
//        while(i<=mid) c[k++]=arr[i++];
//        while(j<=r) c[k++]=arr[j++];
//        int t=0;
//        for(int t1=l;t1<=r;t1++) arr[t1]=c[t++];
//    }
//    static long inversionCount(long arr[]) {
//        // Your Code Here
//        inv=0;
//        mergeSort(arr,0,arr.length-1);
//        return inv;
//    }
	//public long multiplyTwoLists(Node first, Node second) {
//		return (getValue(first) * getValue(second)) % 1000000007;
//	}
//	public long getValue(Node head) {
//		long value = 0;
//		Node current = head;
//		while (current != null) {
//			value = (value * 10 + current.data) % 1000000007;
//			current = current.next;
//		}
//		return value;
//	}
	int getKthFromLast(Node head, int k) {
        head=reverse(head);
        Node current = head;
        for(int i=1;i<k;i++){
        	if(current!=null) current=current.next;
        	else return -1;
        }
        return (current!=null)?current.data:-1;       
    }
    Node reverse(Node head){
    	Node pre = null;
    	Node next =null;
    	while(head!=null){
    		next=head.next;
    		head.next=pre;
    		pre=head;
    		head=next;
    	}
    	return pre;
    }
	public static void main(String[] args) {

	}
}