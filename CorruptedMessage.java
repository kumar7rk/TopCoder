package TopCoder;

public class CorruptedMessage {

	public static void main(String[] args) {
		String s = "abc";
		int k = 3;
		String result = reconstructMessage(s,k);
		System.out.println(result);
	}

	public static String reconstructMessage(String s, int k) {
		String result = "";
		int[] used = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			used[c]++;
		}
		for (int i = 'a'; i <='z'; i++) {
			if (used[i]+k==s.length()) {
				for (int j = 0; j < s.length(); j++) {
					result+=(char)i+"";
				}
				return result;
			}
		}
		return result;
	}
}