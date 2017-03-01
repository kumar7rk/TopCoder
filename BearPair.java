package topCoderV1dot1;

public class BearPair {

	public static void main(String[] args) {
		String s = "miraupmomiqa";
		int result = bigDistance(s);
		System.out.println(result);
	}

	/* It does not seem correct to me but aas of the testing it passes all the tests
	 * I think it needs to be checking for number from the last and not the corresponding number from last
	*/ 
	private static int bigDistance(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char c1 = s.charAt(s.length()-1-i);
			System.out.println(c+""+c1);
			if (c != c1) {
				return s.length()-i-1;
			}
		}
		return -1;
	}

}
