public class ReverseInt {
	public static long reverseInt(int num) {
		long result = 0;
		boolean isNegative = false;
		if (num < 0) {
			num = num * (-1);
			isNegative = true;
		}

		while (num > 0) {
			result = result * 10 + num % 10;
			num = num / 10;

		}

		return (isNegative) ? result * (-1) : result;
	}
	public static void main(String[] args) {
		System.out.println(reverseInt(-1234));
	}
}