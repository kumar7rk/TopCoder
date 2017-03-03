package TopCoder;

import icsV1dot1.Time;

public class SquareScoresDiv2 {

	public static void main(String[] args) {
		Time.startTime();
		String s = "fqzzzrdetrrosnyfujbpdaxcjffxxoubbyyyomroddqoeqybqyeeidwiifooouppffzxpaeezhu";
		int result = getScore(s);
		System.out.println(result);
		Time.endTime();
	}
	private static int getScore(String s) {
		int result = s.length();
		for (int i = 0; i < s.length()-1; i++) {
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) result++;
				else break;
			}
		}
		return result;
	}
	public static int getScore1(String s) {
	        int ret = 0;
	        int n = s.length();
	        for (int i = 0; i < n; ++i) {
	            for (int j = i+1; j <= n; ++j) {
	                boolean ok=true;
	                String ss=s.substring(i, j);
	                char c=ss.charAt(0);
	                for (int k = 1; k < ss.length(); k++) {
	                    char c2 = ss.charAt(k);
	                    if (c!=c2) {
	                        ok=false;
	                        break;
	                    }
	                }
	                if (ok) {
	                    ret++;
	                }
	            }
	        }
	        return ret;
	    }
}