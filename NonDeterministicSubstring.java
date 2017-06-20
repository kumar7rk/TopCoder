package TopCoder;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonDeterministicSubstring {

	public static void main(String[] args) {

		String A = "1101010101111010101011111111110001010101";
		String B = "???????????????????????????????????";
		long result = ways(A,B);
		System.out.println(result);
	}

	private static long ways(String A, String B) {
		HashSet<String> seen = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < B.length(); i++) {
			if(B.charAt(i) == '?')
		        sb.append("[01]");
		    else
		    	sb.append(B.charAt(i));
		    }
		Pattern p = Pattern.compile(sb.toString());
		Matcher m = p.matcher(A);
		int last = 0;
		while (m.find(last)) {
			seen.add(m.group());
			last = m.start()+1;
		}
		 for (String string : seen) {
				System.out.println(string);
		}
		return seen.size();
	}
}
