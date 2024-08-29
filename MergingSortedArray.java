public class MergingArrays {
	public static int[] merge(int [] arr1, int[] arr2){
		int a1=0,a2=0;
		int length= arr1.length+arr2.length;
		int[] result= new int[length];
		for(int i=0;i<length;i++){
			if(a2==arr2.length || (a1!=arr1.length && arr1[a1]<arr2[a2])){
				result[i]=arr1[a1++];
			}
			else{
				result[i]=arr2[a2++];
			}
		}
		return result;
		
	}
	public static void print(int[] arr){
		System.out.print("[ ");
		for(int item: arr){
			System.out.print(item+" ");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		int[] arr1 ={1,3,4,7,9,11};
		int[] arr2 ={2,3,5,6,10,20,21,22};
		int [] mergedArr= merge(arr1,arr2);
		System.out.print("Array 1 : ");
		print(arr1);
		System.out.print("Array 2 : ");
		print(arr2);
		System.out.print("Merged array  : ");
		print(mergedArr);
	}
}