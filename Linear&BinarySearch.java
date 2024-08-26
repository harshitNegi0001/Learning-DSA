public class Searching {
	public static int linearSearch(int [] arr,int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(int arr[], int key){
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if (key<arr[mid]){
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		}
		
		
		return -1;
	}
	public static void main(String[] args) {
		int arr1[] = {1,2,9,3,10,14,8,6};
		int index=linearSearch(arr1,14);
		if(index!=-1){
		 System.out.println("Index of 14 = "+index);
		}
		else{
			System.out.println("key not found! ");
		}
		
		int arr2[]={0,1,3,6,7,9,14,15,20};
		index=binarySearch(arr2,14);
		if(index!=-1){
		 System.out.println("Index of 14 = "+index);
		}
		else{
			System.out.println("key not found! ");
		}
	}
}