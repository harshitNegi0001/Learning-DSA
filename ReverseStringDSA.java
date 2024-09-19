import java.util.*;
public class Main {
	public static String reverse(String str) {
		String result = "";
		String word = "";
		Stack <String> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != '·') {
				word += str.charAt(i);
			} else {
				stack.push(word);
				word = "";
			}
		}
		stack.push(word);
		result += stack.pop();
		while (!stack.isEmpty()) {
			result += "·" + stack.pop();
		}
		return result;

	}
	public static void main(String[] args) {
		String str = "h·el·l·o";
		System.out.println(reverse(str));
	}
}