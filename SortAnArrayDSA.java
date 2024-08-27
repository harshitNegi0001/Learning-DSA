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
		int [] arr={1,0,5,8,3,10,2,16,14};
		
		bubbleSort(arr);
		for(int item: arr){
			System.out.print(item+" ");
		}
	}
}