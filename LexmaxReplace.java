package TopCoder;

import java.util.Arrays;

public class LexmaxReplace {

	public static void main(String[] args) {
		String s = "top";
		String t = "coder";
		String res = get(s,t);
		System.out.println(res);

	}

	public static String get(String s, String t) {
		char[]ch = t.toCharArray();
		Arrays.sort(ch);
		t = "";
		for (char d : ch) t +=d;
		System.out.println(t);
		for (int i = t.length()-1; i >=0; i--) {
			char c = t.charAt(i);
			System.out.println("Current t char = "+ c);
			for (int j = 0; j < s.length(); j++) {
				char c1 = s.charAt(j);
				if (c>c1){
					s = s.replaceFirst(c1+"", c+"");
					break;
				}
			}
		}
		
		return s;
	}

}
