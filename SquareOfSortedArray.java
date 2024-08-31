public class SortedSquareProblem {
	
	public static int[] sortedSquare(int[] arr){
		int i=0;
		int j=arr.length-1;
		int n= arr.length;
		int [] result = new int[n];
		for(int k=n-1;k>=0;k--){
			if(Math.abs(arr[i])<Math.abs(arr[j])){
				result[k]= arr[j]*arr[j];
				j--;
			}
			else{
				result[k]= arr[i]*arr[i];
				i++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr1= {-5,-3,-2,0,1,3,6,7};
		
		int [] arr2= sortedSquare(arr1);
		
		for(int item: arr2){
			System.out.print(item+" ");
		}
	}
}