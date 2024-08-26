class MinPQ{
	
	Integer [] heap;
	int n;
	
	public MinPQ(int capacity){
		heap= new Integer[capacity+1];
		n=0;
	}
	public boolean isEmpty(){
		return n==0;
	}
	public void printPQ(){
		for (int i=1;i<=n;i++){
			System.out.print(heap[i]+" ");
		}
		System.out.println("");
	}
	public void insert(int d){
		if(n==heap.length-1){
			resize(2*heap.length);
		}
		n++;
		heap[n]=d;
		swim(n);
	}
	public void swim(int k){
		while(k!=1&&heap[k]<heap[k/2]){
			swap(k,k/2);
			k=k/2;
		}
	}
	public void swap(int i, int j){
    	int temp=heap[i];
		heap[i]=heap[j];
		heap[j]=temp;
    }
	public void resize(int capacity){
		Integer[] temp = new Integer[capacity];
		for(int i=1;i<=n;i++){
			temp[i]=heap[i];
		}
		heap=temp;
	}
	public int deleteMin(){
		if(isEmpty()){
			return Integer.MIN_VALUE;
		}
		int min= heap[1];
		swap(1,n);
		heap[n]=null;
		n--;
		sink(1);
		
		if(n==(heap.length-1)/4){
			resize(heap.length/2);
		}
		return min;
	}
	public void sink(int k){
    	while(2*k<=n) {
        	int j=2*k;
      	  if (j<n && heap[j]>heap[j+1]){  
         	  j++;
      	  }
       	 if(heap[k]<=heap[j]){
            break; 
       	 }
       	 swap(k,j);
        	k=j;
   	 }
	}
	
}

public class MinPQImplementation {
	public static void main(String[] args) {
		MinPQ pq= new MinPQ(7);
		pq.insert(3);
		pq.insert(5);
		pq.insert(2);
		pq.insert(1);
		pq.insert(9);
		pq.insert(6);
		pq.insert(10);
		pq.insert(30);
		pq.insert(42);
		pq.insert(21);
		pq.insert(22);
		pq.printPQ();
		System.out.println(pq.deleteMin()+" deleted ");
		System.out.println(pq.deleteMin()+" deleted ");
		
		
		pq.printPQ();
	}
}