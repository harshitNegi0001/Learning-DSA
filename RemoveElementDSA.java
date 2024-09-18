public class RemoveElement {
	public static int removeElement(int[] arr, int val) {
		int i = 0, j = 0;

		while (j < arr.length) {
			if (arr[j] != val) {
				arr[i] = arr[j];
				i++;
			}
			j++;
		}
		return i;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 0, 5, 4, 2, 8, 2};
		System.out.print(removeElement(arr, 2));
	}
}