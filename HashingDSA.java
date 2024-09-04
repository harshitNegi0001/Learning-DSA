class HashTable {
	HashNode[] buckets;
	int noOfBuckets;
	int size;
	public HashTable() {
		this.buckets = new HashNode[10];
		this.noOfBuckets = 10;
		this.size = 0;
	}
	public HashTable(int capacity) {
		this.buckets = new HashNode[capacity];
		this.noOfBuckets = capacity;
		this.size = 0;
	}
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void put(Integer key, String value) {
		int index = getIndex(key);
		HashNode current = buckets[index];
		HashNode newNode = new HashNode(key, value);
		while (current != null) {
			if (current.key.equals(key)) {
				current.value = value;
				return;
			}
			current = current.next;
		}
		newNode.next = buckets[index];
		buckets[index] = newNode;
		size++;
	}
	public String get(Integer key) {
		int index = getIndex(key);
		HashNode current = buckets[index];
		while(current!=null){
			if(current.key.equals(key)){
				return current.value;
			}
			current= current.next;
		}		
		return null;
	}
	public String remove(Integer key){
		int index = getIndex(key);
		HashNode previous = null;
		HashNode current = buckets[index];
		while(current!=null){
			if(current.key.equals(key)){
				if(previous!=null){
					previous.next=current.next;
				}else{
					buckets[index]=current.next;
				}
				current.next=null;
				size--;
				return current.value;
			}
			previous= current;
			current=current.next;
		}
		return null;
	}
	public int getIndex(Integer key) {
		return key % noOfBuckets;
	}
}
class HashNode {
	Integer key;
	String value;
	HashNode next;

	public HashNode(Integer k, String v) {
		this.key = k;
		this.value = v;
		this.next = null;
	}
}

public class Hashing {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put(10, "harshit");
		ht.put(10, "rohit");// update key 10 value
		ht.put(100, "harshit");
		ht.put(51, "suresh");
		ht.put(23, "ayush");
		ht.put(105, "piyush");
		ht.put(98, "gaurav");
		System.out.println("Removed key 10 : "+ht.remove(10));
		System.out.println("Value for key 10 = "+ht.get(10));
		System.out.println("Value for key 100 = "+ht.get(100));
		System.out.println("Value for key 51 = "+ht.get(51));
		System.out.println("Value for key 23 = "+ht.get(23));
		System.out.println("Value for key 105 = "+ ht.get(105));
		System.out.println("Value for key 98 = "+ ht.get(98));
		//System.out.println(ht.get(97));
	}
}