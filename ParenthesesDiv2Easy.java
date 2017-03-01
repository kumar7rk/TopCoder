package topCoderV1dot1;

public class ParenthesesDiv2Easy {

	public static void main(String[] args) {
//		String s = "((())())(((())(()))())";
//		String s = "(((((()(()(((((((((()(()))))))))))))))))";
		String s = 	"(()()()()((())))()()((()))";
		int depth = getDepth(s);
		System.out.println(depth);
		
	}

	public static int getDepth1(String s) {
		int max = 0;
		int counter = 0;
		char c[] = s.toCharArray();
		for (int i = 0;i<s.length();i++) {
			if (c[i]!=')')
				counter++;
			if (max<counter) max = counter;
			if (c[i]==')') counter=0;
		}
		return max;
	}
	public static int getDepth(String s) {
		 
        if (s.length() == 0) return 0;
        int max = 0;
        int r = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                --r;
            } else ++r;
            max = Math.max(max, Math.abs(r));
        }
 
        return max;
    }
}