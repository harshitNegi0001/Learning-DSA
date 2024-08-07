public class Array_Practice_01 {
	public static int[] reverseArray(int[] arr){
		int temp;
		for(int i=0;i<arr.length/2;i++){
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
			
		}
		return arr;
	}
	public static int min(int[] arr)
	{
		int min=arr[0];
		for(int item: arr){
			if(item<min){
				min=item;
			}
		}
		return min;
	}
	public static int max(int[] arr)
	{
		
		int max=arr[0];
		for(int item: arr){
			if(item>max){
				max=item;
			}
		}
		return max;
	}
	public static int secondMax(int[] arr){
		int max=max(arr);
		int sMax=(arr[0]<max)?arr[0]:arr[1];
		for(int item:arr){
			if(item>sMax && item<max){
				sMax=item;
			}
		}
		return sMax;
		
	}
	
	
	public static int[] removeOdd(int[] arr){
		int i=0;
		
		for(int item:arr){
			if(item%2==0)
				i++;
		}
		int result[]= new int[i];
		i=0;
		for(int item:arr){
			if(item%2==0){
				result[i++]=item;
			}
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5,6};
		arr1=reverseArray(arr1);
		/*for(int item:arr1){
			System.out.println(item);
		}*/
		arr1=removeOdd(arr1);
		/*for(int item:arr1){
			System.out.println(item);
		}*/
		int[] arr2={80,20,30,44,12,89,50,98,43,29};
		//System.out.println("min = "+min(arr2));
		//System.out.println("max = "+max(arr2));
		//System.out.println("second max = "+secondMax(arr2));
	
	}
}