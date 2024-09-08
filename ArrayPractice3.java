import java.util.*;
public class LeetCode_TwoSum {
	public static int[] twoSum(int[] arr, int target){
		int[] result= new int[2];
		
		Map<Integer,Integer> m= new HashMap<>();
		for(int i=0; i<arr.length; i++){
			if(!m.containsKey(target-arr[i])){
			m.put(arr[i],i);
			}
			else{
				result[1]=i;
				result[0]=m.get(target-arr[i]);
				return result;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr={1,2,5,7,8,3,6,9};
		
		int[] indexSum = twoSum(arr,10);
		
		for(int item: indexSum){
			System.out.println(item);
		}
	}
}