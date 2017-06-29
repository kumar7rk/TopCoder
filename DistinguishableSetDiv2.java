package TopCoder;

import java.util.HashSet;
import java.util.Set;

public class DistinguishableSetDiv2 {

	public static void main(String[] args) {
		String[] answer = {"HGHHGUHUHI", "BQHJWOSZMM", "NDKSKCNXND", "QOEOEIWIDS", "IIQIWUNNZM"};
		int res = count(answer);
		System.out.println(res);
	}
	public static int count(String[] answer) {
		int N= answer.length;
		int M= answer[0].length();
		int counter = 0;
		for (int i = 0; i < (1<<M); i++) {
			Set<String> set = new HashSet<>();
			boolean valid = true;
			for (int j = 0; j < N&&valid; j++) {
				StringBuilder builder = new StringBuilder();
				for (int k = 0; k < M; k++) 
					if (((i>>k)&1)==1) builder.append(answer[j].charAt(k));
				valid = set.add(builder.toString());
			}
			if (valid) counter++;
		}
		return counter;
	}
}