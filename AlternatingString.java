package TopCoder;

public class AlternatingString {

	public static void main(String[] args) {
		String s = "01010101010101010101010101010101010101010101010101";
		int result = maxLength(s);
		System.out.println(result);
	}
	public static int maxLength(String s) {
		int counter = 1;
		int max = 1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length();) {
				if (s.charAt(i)!=s.charAt(j)) {
					counter++;
					max = max<counter?counter:max;
					break;
				}
				else {
					counter = 1;
					break;
				}
			}
		}
		return max;
	}
}