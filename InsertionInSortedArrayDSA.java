public class InsertionInSortedArr {
	public static int[] searchAndInsert(int[] arr, int target){
		int low=0,high=arr.length-1,mid;
		
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]==target){
				return insert(arr,target,mid);
			}
			else if(arr[mid]<target){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return insert(arr,target,low);
	}
	public static int[] insert(int[] arr, int element, int index){
		int[] result = new int[arr.length+1];
		int i=0,j=0;
		while(i<result.length){
			if(i==index){
				result[i]=element;
				i++;
			}
			else{
				result[i]= arr[j];
				i++;
				j++;
			}
		}
		return result;
		
	}
	public static void printArr(int[] arr){
		for(int item: arr){
			System.out.print(item+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int[] arr={1,3,5,7,10,14,19,21,22,23,30,42,51,66};
		printArr(arr);
		arr=searchAndInsert(arr,0);
		System.out.println("inserted 0");
		printArr(arr);
		arr=searchAndInsert(arr,12);
		System.out.println("inserted 12");
		printArr(arr);
		arr=searchAndInsert(arr,14);
		System.out.println("inserted 14");
		printArr(arr);
		arr=searchAndInsert(arr,74);
		System.out.println("inserted 74");
		printArr(arr);
		
	}
}