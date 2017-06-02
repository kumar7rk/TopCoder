package TopCoder;

public class MaximumRangeDiv2 {

	public static void main(String[] args) {
		String s = 
				"+--+--+"
				;
		int res = findMax(s);
		System.out.println("\n"+res);
	}

	public static int findMax(String s) {
		int countI = 0;
		int countD = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='+') countI++;
			if (s.charAt(i)=='-') countD++;
		}
		return Math.max(countI, countD);
	}
}
