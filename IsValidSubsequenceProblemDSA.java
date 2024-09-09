public class IsValidSubsequence {

	public static boolean isSubseq(String str, String seq) {
		int i = 0;
		int j = 0;
		while (i < str.length() && j < seq.length()) {
			if (str.charAt(i) == seq.charAt(j)) {
				j++;
			}
			i++;
		}
		return j == seq.length();

	}
	public static void main(String[] args) {

		String str = "abcde";
		String seq = "aec";
		System.out.println(isSubseq(str, seq));
		seq = "hrit";
		str = "harshit";
		System.out.println(isSubseq(str, seq));
	}
}