import java.util.*;
public class FirstNonRepeatingCharacter {

	public static int firstNonRepChar(String str) {
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char item : chars) {
			if (map.containsKey(item)) {
				map.put(item, map.get(item) + 1);
			} else {
				map.put(item, 1);
			}
		}

		for (int i = 0 ; i < chars.length; i++) {
			if (map.get(chars[i]) == 1) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String str = "harshit";

		System.out.println("first non-repeating character in string \"" + str + "\" is in index " + firstNonRepChar(str));
	}
}