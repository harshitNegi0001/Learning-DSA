import java.util.*;
public class SolutionOfPOTD {
	
	/*
	//8_oct_24
	//Largest pair sum
	public static int pairsum(int[] arr) {
        int num1=Integer.MIN_VALUE;
        int num2=num1;
        for(int num : arr){
            if(num>=num1){
                num2=num1;
                num1=num;
            }
            else if(num>num2) num2=num;
        }
        return num1+num2;
    }
    */
    
  /*  //9_oct_24
    static Node construct(int arr[][]) {
        int n=arr.length,m=arr[0].length;
        ArrayList<Node> arrlist= new ArrayList<>();
        for(int i=0;i<n;i++){
        	Node f = new Node(arr[i][0]);
        	Node curr=f;
        	for(int j=1;j<m;j++)curr=curr.right=new Node(arr[i][j]);
        	curr.right=null;
        	arrlist.add(f);
        }
        for(int i=0;i<n-1;i++){
        	Node curr1=arrlist.get(i);
        	Node curr2=arrlist.get(i+1);
        	while(curr1!=null){
        		curr1.down=curr2;
        		curr1=curr1.right;
        		curr2=curr2.right;
        	}
        }
        Node curr = arrlist.get(n-1);
        while(curr!=null){
        	curr.down=null;
        	curr=curr.right;
        }
        return arrlist.get(0);
        
    }*/
    /* //10_oct_24
    public int maxDistance(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        int max=0;
        for(int i =0; i<arr.length;i++){
        	if(!m.containsKey(arr[i]))m.put(arr[i],i);
        	else{
        		max=Math.max(max,i-m.get(arr[i]));
        	}
        }
        return max;
    }
    */
    
/*    //11_oct_24
    public List<Integer> rearrange(List<Integer> arr) {
        int i=0;
        while(i<arr.size()){
        	int e=arr.get(i);
        	if(e!=i){
        		if(e<0||e>=arr.size()||arr.get(e)==e) arr.set(i++,-1);
        		else{		
        			arr.set(i,arr.get(e));
        			arr.set(e,e);
        		}
        	}
        	else i++;
        }        
        return arr;
    }*/
    /*
    //12_oct_24
    public int pairWithMaxSum(int[] arr) {
        int maxSum=-1;
        for(int i=1;i<arr.length;i++)maxSum=Math.max(maxSum,arr[i-1]+arr[i]);
        return maxSum;
    }*/
    /* //13_oct_24
    public void deleteAlt(Node head) {
        Node pre=head;
        Node curr=head.next;
        while(curr!=null&& curr.next!=null){
        	pre.next=curr.next;
        	curr.next=null;
        	pre=pre.next;
        	curr=pre.next;
        }
        if(curr!=null)pre.next=null;
    }
    */
    /* //14_oct_24
    public int getCount(Node head) {
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    */
    /* //15_oct_24
    static int subArraySum(int arr[], int tar) {
        int ans=0;
        int sum=0;
        Map<Integer,Integer> map=new  HashMap<>();
        
        for(int e: arr){
            sum+=e;
            if(sum==tar)ans++;
            map.put(sum,map.getOrDefault(sum,0)+1);
            if(map.containsKey(sum-tar))ans+=map.get(sum-tar);
        }
        return ans;
	}
	*/
	/*
	//16_oct_24
	public boolean checkSorted(List<Integer> arr) {
        int count=0;
        int i=0;
        while(i<arr.size()){
            if(arr.get(i)==i+1)i++;
            else {
                swap(arr,i,arr.get(i)-1);
                count++;
            }
            if(count>2)return false;
        }
        return (count==2||count==0)?true:false;
    }
    public void swap(List<Integer> arr,int i,int j ){
        arr.set(i,arr.get(j));
        arr.set(j,j+1);
    }*/
    /*
    //17_oct_24
    Node[] alternatingSplitList(Node head) {
        Node curr1=head;
        Node curr2=head.next;
        Node [] result={ curr1, curr2};
        while(curr1!=null&&curr1.next!=null){
            curr1.next=curr1.next.next;
            curr1=curr1.next;
            if(curr1!=null){
                curr2.next=curr2.next.next;
                curr2=curr2.next;
            }
        }
        return result;
    }*/
    /*
    //18_oct_24
    int getSingle(int arr[]) {
        int numx=0;
        for(int num:arr)numx=numx^num;
        return numx;
    }
    */
    /* //19_oct_24
    String roundToNearest(String str) {
        char[] temp=str.toCharArray();
        int n=temp.length-1;
        if(temp[n]<='5'){
            temp[n]='0';
            return String.valueOf(temp);
        }
        temp[n--]='0';
        while(n>=0&&temp[n]=='9'){
            temp[n]='0';
            n--;
        }
        if(n==-1)return '1'+String.valueOf(temp);
        temp[n]+=1;
        return String.valueOf(temp);
    }
    */
	public static void main(String[] args) {
		
	}
}