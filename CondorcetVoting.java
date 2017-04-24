package TopCoder;

public class CondorcetVoting {

	public static void main(String[] args) {
		
		String [] votes = 	
//		{"acbd","bacd","bdca"}
//		{"abc", "bca", "cab"}	
			 	
			{"abcd", "abcd", "abcd", "abcd", "abcd", "abcd",
			 "cbad", "cbad", "cbad", "cbad", "cbad",
			 "dbca", "cbda", "cbda"}
		;
		int res = winner(votes);
		System.out.println(res);
	}

	public static int winner(String[] votes) {
		
		// voter row
		// candidate column
		// IDEA- compare 0 and 1 candidate first, 0 and 2 and then 0 and 3 candidate
		// see if he wins on all
		// if yes then return 0;
		int length = votes[0].length();
		for (int i = 0; i < length; i++) {
			int total = 0;
			for (int j = 0; j < length; j++) {
				if (i==j) continue;
				int c1 = 0;
				int c2 = 0;
				// k for each voter,
				for (int k = 0; k < votes.length; k++) {
					if (votes[k].charAt(i)<votes[k].charAt(j)) c1++;
					if (votes[k].charAt(i)>votes[k].charAt(j)) c2++;
				}
				if (c1>c2) total++;
			}
			if (total == length-1) return i;
		}
		return -1;
	}
}
