package TopCoder;

public class ParenthesesDiv2Easy {

	public static void main(String[] args) {
		String s = 	"(()()()()((())))()()((()))";
		int depth = getDepth(s);
		System.out.println(depth);
	}
	public static int getDepth(String s) {
		int max = 0;
		int counter = 0;
		char c[] = s.toCharArray();
		for (int i = 0;i<s.length();i++) {
			if (c[i]!=')') counter++;
			if (max<counter) max = counter;
			if (c[i]==')') counter=0;
		}
		return max;
	}
}