package TopCoder;

public class DecipherabilityEasy {

	public static void main(String[] args) {
		String s = "sunuke";
		String t = "snuke";
		String result = check(s,t);
		System.out.println(result);
	}
	public static String check(String s, String t) {
		if (s.length()-1!=t.length()) return "Impossible";
		for (int i = 0; i < s.length(); i++) {
			String s1 = "";
			s1 += s.substring(0,i);
			s1 += s.substring(i+1);
			if (s1.equals(t)) return "Possible";
		}
		return "Impossible";
	}
}