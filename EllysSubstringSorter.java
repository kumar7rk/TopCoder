package TopCoder;

import java.util.Arrays;
import java.util.Comparator;

public class EllysSubstringSorter {

	public static void main(String[] args) {
		String S = 
				"TOPCODER"
//				"MZJSVLKIGNBLNFKUYBMXKRIXGTIIRSFKY"
				;
		int L = 4;
		String res = getMin(S,L);
		System.out.println("RES: "+res);
	}

	public static String getMin(String S, int L) {
		String temp = "";
		String best = S;
		for (int i = 0; i < S.length()-L+1; i++) {
			String S1 = S.substring(i,i+L);
			String str = sortString(S1);
			temp = S.replaceFirst(S1, str);
			if (best.compareTo(temp)>0) best = temp;
		}
		return best;
	}
	public static String sortString(String str){
		Character[] chars = new Character[str.length()];
		for (int i = 0; i < chars.length; i++)
		    chars[i] = str.charAt(i);

		Arrays.sort(chars, new Comparator<Character>() {
		    public int compare(Character c1, Character c2) {
		        int cmp = Character.compare(
		            Character.toLowerCase(c1.charValue()),
		            Character.toLowerCase(c2.charValue())
		        );
		        if (cmp != 0) return cmp;
		        return Character.compare(c1.charValue(), c2.charValue());
		    }
		});
		StringBuilder sb = new StringBuilder(chars.length);
		for (char c : chars) sb.append(c);
		str = sb.toString();
		return str;
	}
}