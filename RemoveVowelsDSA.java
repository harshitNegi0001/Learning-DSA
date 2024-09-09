import java.util.*;
public class RemoveVowelsProblem {
	public static String removeVowels(String str) {
		char[] chars = str.toCharArray();
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
		String result = "";
		for (char ch : chars) {
			if (!vowels.contains(ch)) {
				result += ch;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "how are you ?";
		System.out.println("after removed vowels string = " + removeVowels(str));
	}
}