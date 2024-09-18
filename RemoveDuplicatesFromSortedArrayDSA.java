public class RemoveDuplicatesInSortedArr {

	public static int removeDup(int [] arr) {
		int i = 1;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j - 1] != arr[j]) {
				arr[i] = arr[j];
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 1, 2, 3, 3, 3, 4, 4, 5, 6, 8};
		System.out.print(removeDup(arr));
	}
}