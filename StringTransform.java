package TopCoder;

public class StringTransform {

	public static void main(String[] args) {

		String s = "rdmcxnnbbe";
		String t = "rdrrxrnxbe";
		String res = isPossible(s,t);
		System.out.println(res);
	}

	public static String isPossible(String s, String t) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=t.charAt(i)) {
				String temp = s.substring(0,i);
				if (!temp.contains(t.charAt(i)+"")) {
					return "Impossible";
				}
			}
		}
		return "Possible";
	}

}
