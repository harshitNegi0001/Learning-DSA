public class DutchFlagProblem {
	public static void solutionOfDutchFlagProblemSorting(int[] arr){
		int i=0,j=0,k=arr.length-1;
		
		while(i<=k){
			if(arr[i]==0){
				swap(arr,i,j);
				i++;
				j++;
			}
			else if(arr[i]==1){
				i++;
			}
			else if(arr[i]==2){
				swap(arr,i,k);
				k--;
			}
			
		}
		
	}
	public static void swap(int [] arr, int i1, int i2){
		arr[i1]+=arr[i2];
		arr[i2]=arr[i1]-arr[i2];
		arr[i1]=arr[i1]-arr[i2];
	}
	public static void main(String[] args) {
		int[] arr={2,1,2,2,2,1,0,2,1,0,0,2};
		solutionOfDutchFlagProblemSorting(arr);
		for(int item: arr){
			System.out.print(item+" ");
		}
	}
}