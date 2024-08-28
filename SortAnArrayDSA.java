public class SortingAlgo {
	public static void bubbleSort(int[] arr){
		int temp;
		for(int i=0; i<arr.length-1;i++){
			for(int j=0; j<arr.length-1-i;j++){
				if(isSorted(arr)){
					System.out.println("Sorted ");
					return;
				}
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		System.out.println("Sorted ");
	}
	public static void insertionSort(int [] arr){
		if(isSorted(arr)){
					System.out.println("Already Sorted ");
					return;
				}
		int j,current;
		for(int i=1; i<arr.length; i++){
			j=i-1;
			current=arr[i];
			while(j>=0 && current<arr[j]){
				
				arr[j+1]=arr[j];			
				j--;
			}			
			arr[j+1]=current;
			
		}
		
	}
	public static void selectionSort(int [] arr){
		int min;
		for(int i=0;i<arr.length-1;i++){
			min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			
			swap(arr,i,min);
		}
	}
	public static void swap(int [] arr,int i1,int i2){
		int temp= arr[i1];
		arr[i1]= arr[i2];
		arr[i2]=temp;
	}
	public static void print(int[] arr){
		for(int item: arr){
			System.out.print(item+" ");
		}
		System.out.println("");
	}
	public static boolean isSorted(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int [] arr={1,0,5,8,3,10,2,14,16};
		
		selectionSort(arr);
		for(int item: arr){
			System.out.print(item+" ");
		}
	}
}