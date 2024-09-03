class HashTable{
	HashNode[] buckets;
	int noOfBuckets;
	int size;
	public HashTable(){
		this.buckets= new HashNode[10];
		this.noOfBuckets= 10;
	}
	public HashTable(int capacity){
		this.buckets= new HashNode[capacity];
		this.noOfBuckets= capacity;
	}
}
class HashNode{
	Integer key;
	String value;
	HashNode next;
	
	public HashNode(Integer k, String v){
		this.key = k;
		this.value = v;
		this.next = null;
	}
}

public class Hashing {
	public static void main(String[] args) {
		
	}
}