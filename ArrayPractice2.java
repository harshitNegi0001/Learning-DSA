public class MaxSumSubarray {
	
	public static int maxSumSubarray(int[] arr){
		//Kadane's Algorithm for Maximum Sum Subarray
		int bestSum=Integer.MIN_VALUE;
		int currentSum=Integer.MIN_VALUE;
		
		for(int i=0 ;i<arr.length; i++){	
			if(currentSum+arr[i]<=arr[i]){
				//arr[i] can start a new subarray
				currentSum=arr[i];
			}
			else{
				
				currentSum+=arr[i];
			}
			if(currentSum>bestSum){
				//arr[i] can be part of subarray
				bestSum=currentSum;
			}
		}
		
		return bestSum;
	}
	public static void main(String[] args) {
		int[] arr={3,4,-2,6,-12,7,-1,6};
		
		int maxSumSubArr= maxSumSubarray(arr);
		
		System.out.println("Max sum of sub array is = "+maxSumSubArr);
	}
}