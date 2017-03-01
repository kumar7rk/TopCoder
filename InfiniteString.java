package topCoderV1dot1;

public class InfiniteString {

	public static void main(String[] args) {
		String s = "abcabcabcabcabcabcabcabcabcabcabcabcabcabcabc";
		String t = "abcabcabcabcabcabcabcabcabc";
		String result = equal(s,t);
		System.out.println(result);
	}

	private static String equal(String s, String t) {
		String a = "",b="";
		int tl = t.length();
		int sl = s.length();
		for (int i = 0; i < tl; i++) a+=s;
		for (int i = 0; i < sl; i++) b+=t;
		if (a.equals(b)) return "Equal";
		return "Not Equal";
	}

}
