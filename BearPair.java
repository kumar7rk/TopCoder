package TopCoder;

public class BearPair {

	public static void main(String[] args) {
		String s = "xxyyxyxyyyyyyxxxyxyxxxyxyxyyyyyxxxxxxyyyyyyyyxxxxx";
		int result = bigDistance(s);
		System.out.println(result);
	}

	/* It does not seem correct to me but aas of the testing it passes all the tests
	 * I think it needs to be checking for number from the last and not the corresponding number from last
	*/ 
	public static int bigDistance(String s) {
		int max = -1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length()-1; j >=0 ; j--) {
				char c = s.charAt(i);
				char c1 = s.charAt(j);
				System.out.println(c+""+c1);
				if (c != c1) {
					if ((j-i)>max) {
						max = (j-i);
					}
				}
			}
		}
		return max;
	}
}