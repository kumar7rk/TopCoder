package TopCoder;

public class FauxPalindromes {

	public static void main(String[] args) {

		String word = "TTAAXAAT";
		String res = classifyIt(word);
		System.out.println(res);
	}

	public static String classifyIt(String word) {
		boolean pali = palindrome(word);
		if (pali) return "PALINDROME";
		String fau = faux(word);
		if (palindrome(fau)) return "FAUX";
		return "NOT EVEN FAUX";
	}

	private static String faux(String word) {
		String ret = "";
		ret+=word.charAt(0);
		for (int i = 1; i < word.length();i++) {
			char c = word.charAt(i);
			char c1 = word.charAt(i-1);
			if (c!=c1) ret +=c+"";
		}
		return ret;
	}

	private static boolean palindrome(String word) {
		StringBuffer buffer = new StringBuffer(word);
		buffer.reverse();
		if (word.equals(new String(buffer))) return true;
		return false;
	}

}
