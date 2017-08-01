package TopCoder;

public class ValueOfString {

	public static void main(String[] args) {
		String s = "acdgknz" ;
		int result = findValue(s);
		System.out.println("result: "+result);
	}
	public static int findValue(String s) {
		int result = 0;
		int[]val = getVal();
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			int k = 0;
			for (int j = 0; j < s.length(); j++) {
				char c2 = s.charAt(j);
				if (c1>=c2)k++;
			}
			result +=k*(s.charAt(i)-'a'+1);
		}
		return result;
	}
	public static int[] getVal() {
		int[] val = new int[26];
		for (int i = 'a'; i <= 'z'; i++) {
			val[i-'a'] = i-'a'+1; ;
		}
		return val;
	}
}
