package TopCoder;

public class ParenthesesDiv2Easy {

	public static void main(String[] args) {
		String s = 	"(((()((((()))))())))"	;
		int depth = getDepth(s);
		System.out.println(depth);
	}
	public static int getDepth(String s) {
		int r = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='(') {
				r--;
			}
			else
				r++;
			max = Math.max(max, Math.abs(r));
		}
		return max;
	}
}