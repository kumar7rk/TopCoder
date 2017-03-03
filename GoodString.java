package TopCoder;

public class GoodString {

	public static void main(String[] args) {

		String s = "aaaaaaaabbbaaabaaabbabababababaabbbbaabbabbbbbbabb";
		String result = isGood(s);
		System.out.println(result);
	}

	private static String isGood(String s) {
		while (s.contains("ab"))
			s = s.replaceAll("ab", "");
		return s.equals("")?"Good":"Bad";
	}
}
