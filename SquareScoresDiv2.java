package TopCoder;

public class SquareScoresDiv2 {

	public static void main(String[] args) {
		String s = "fqzzzrdetrrosnyfujbpdaxcjffxxoubbyyyomroddqoeqybqyeeidwiifooouppffzxpaeezhu";
		int result = getScore(s);
		System.out.println(result);
	}
	public static int getScore(String s) {
		int result = s.length();
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) result++;
				else break;
			}
		}
		return result;
	}
}