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
	/*	int getKthFromLast(Node head, int k) {
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
	    */
	/*    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
	        boolean[] visited= new boolean[adj.size()];
	        for(int i =0; i<adj.size();i++){
	        	if(!visited[i]){
	        		if(dfs(i,adj,visited,-1)) return true;
	        	}
	        }
	        return false;
	    }
	    public boolean dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean [] visited,int parent){
	    	for(int node : adj.get(v)){
	    		if(!visited[node]){
	    			if(dfs(node,adj,visited,v))return true;
	    		}
	    		else if (node!=parent) return true;
	    	}
	    	return false;
	    }*/

	/* public List<Integer> findMajority(List<Integer> nums) {
	     Collections.sort(nums);
	     int vote=1,pre=-1,len=nums.size(),curr;
	     List<Integer> result = new ArrayList<>(3);
	     for(int i=0;i<len;i++){
	     	curr = nums.get(i);
	     	if(curr==pre) vote++;
	     	else{
	     		vote=1;
	     		pre=curr;
	     	}
	     	if(vote>len/3.0 && !result.contains(curr))result.add(curr);
	     }
	     if(result.isEmpty()) result.add(-1);
	     return result;
	 }*/

	/*	public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
			ArrayList<ArrayList<Integer>> result = new ArrayList<>();

			int n = arr.length;
			Arrays.sort(arr);
			Map <Integer, Boolean> map = new HashMap<>();
			for (int e : arr) {
				if (e <= 0 && !map.containsKey(e)) map.put(e * -1, false);
				else if (e >= 0) {
					if (map.containsKey(e) && !map.get(e)) {
						ArrayList<Integer> helper = new ArrayList<>();
						helper.add(e * -1);
						helper.add(e);
						result.add(helper);
						map.put(e, true);
					}
				}
			}

			Collections.reverse(result);
			return result;
		}*/

	/*	static void rotateArr(int arr[], int d) {
			d = d % arr.length;
			int [] helper = new int [d];
			for (int i = 0; i < d; i++) helper[i] = arr[i];
			for (int i = d; i < arr.length; i++)arr[i - d] = arr[i];
			for (int i = arr.length - d, j = 0; i < arr.length && j < d; i++, j++) arr[i] = helper[j];
		}
	*/
/*	Node reverse(Node head) {
		if (head.next == head)return head; //when only one node present
		Node previous = null;
		Node next = head.next;
		while (next != null) {
			head.next = previous;
			previous = head;
			head = next;
			next = head.next;
		}
		head.next = previous;
		head = previous;
		return head;
	}
	Node deleteNode(Node head, int key) {
		Node previous = head;
		Node current = head.next;
		while (current != head) {
			if (current.data == key) {
				previous.next = current.next;
				current.next = null;
				current = previous.next;
				return reverse(head);
			}
			previous = previous.next;
			current = current.next;
		}
		if (current.data == key) { //in the case (head.data==key)
			head = current.next;
			previous.next = head;
			current.next = null;
		}
		return reverse(head);
	}*/
/*	public long findSmallest(int[] arr) {
        long num=1;
        for(int e: arr){
            if(e<=num)num+=e;
            else break;
        }
        return num;
        
    }
    int isPalindrome(String S) {
        char []arr = S.toCharArray();
        for(int i=0; i<S.length()/2;i++)if(arr[i]!=arr[arr.length-1-i])return 0;
        return 1;
    }*/
 /*   public int numIslands(char[][] grid) {
        int ans=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean [][] visited= new boolean [n][m];
        for(int i=0;i<n;i++){
        	for(int j=0;j<m;j++){
        		if(grid[i][j]=='1'&&!visited[i][j]){
        			ans++;
        			visit(grid,i,j,visited);
        		}
        	}
        }
        return ans;
    }
    void visit(char[][] grid, int i, int j, boolean[][] visited){
    	if(i<0||i>=grid.length||j<0||j>=grid[0].length||visited[i][j]) return;
    	visited[i][j]=true;
    	if(grid[i][j]=='1'){
    		visit(grid,i,j+1,visited);//for right check
    		visit(grid,i,j-1,visited);//for left check
    		visit(grid,i+1,j,visited);//for down check
    		visit(grid,i-1,j,visited);//for up check
    		visit(grid,i+1,j+1,visited);//for right down check
    		visit(grid,i-1,j+1,visited);//for right up check
    		visit(grid,i+1,j-1,visited);//for left down check
    		visit(grid,i-1,j-1,visited);//for left up check
    	}
    }*/
    
/*    public List<String> find_permutation(String S) {
        List<String> list= new LinkedList<>();
        permutation(S,0,S.length()-1,list);
        Set<String> set = new LinkedHashSet<>(list);
        
        list.clear();
        list.addAll(set);
        Collections.sort(list);
        return list;
    }
    public void permutation(String S,int l,int r,List<String> list){
   	 if(l==r)list.add(S);
   	 else for(int i=l;i<=r;i++){
   	 	S=swap(S,l,i);
   	 	permutation(S,l+1,r,list);
   	 	S=swap(S,l,i);
   	 }
    }
    String swap(String S, int i,int j){
    	char[] ch = S.toCharArray();
    	char temp= ch[i];
    	ch[i]=ch[j];
    	ch[j]=temp;
    	
    	return S.valueOf(ch);
    }*/
    
/*    public static boolean areIsomorphic(String str1,String str2){
        if(str1.length()!=str2.length())return false;
        Map <Character,Character> m = new HashMap<>();
        char [] s1 = str1.toCharArray();
        char [] s2 = str2.toCharArray();
        for(int i=0;i<s1.length;i++){
        	if(m.containsKey(s1[i])){
        		if(m.get(s1[i])!=s2[i])return false;
        	}
        	else if(m.containsValue(s2[i]))return false;
        	else m.put(s1[i],s2[i]);
        }
        return true;
    }*/
    
   /* Node removeDuplicates(Node head) {
        Node curr=head.next;
        Node previous=head;
        while(curr!=null){
        	if(curr.data==previous.data){
        		Node next=curr.next;
        		curr.next=null;
        		curr=next;
        		previous.next=curr;
        	}
        	else{
        		previous=curr;
        		curr=curr.next;
        	}
        }
        return head;
    }*/
    /*
    public Node addOne(Node head) {
        head=reverse(head);
        Node curr= head;
        Node pre=head;
        while(curr!=null){
            if(curr.data==9){
                curr.data=0;
                pre=curr;
                curr=curr.next;
            }
            else{
                curr.data=curr.data+1;
                return reverse(head);
            }
        }
        pre.next=new Node(1);
        return reverse(head);
    }
    public Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }*/
    
    
    

 /*   public static Node reverse(Node node, int k) {
        if(k==1)return node;
        int count=1;
        Node pre= null;
        Node curr=node;
        Node next=node;
        while(next!=null){
        	if(count==k){
        		if(pre==null){
        			node=next;
        			reverse(curr,next.next);
        		}
        		else{
        		    pre.next=reverse(curr,next.next);
        		}
        		pre=curr;
        		curr=curr.next;
        		next=curr;
        		count=1;
        		
        	}
        	else{
        		count++;
        		next=next.next;
        	}
        }
        pre.next=reverse(curr,next);
        
        return node;
    }
    public static Node reverse(Node curr,Node next){
    	Node n=null;
    	Node p=next;
    	while(curr!=next){
    		n=curr.next;
    		curr.next=p;
    		p=curr;
    		curr=n;
    	}
    	return p;
    }
*/
/*
	int getMiddle(Node head) {
        Node slow=head;
        Node fast= head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
*/
	public static void main(String[] args) {
		
	}
}