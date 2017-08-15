package TopCoder;

public class LongLiveZhangzj {

	public static void main(String[] args) {
		String[] speech = 
			{"make", "topcoder", "great", "again"}
		;
		String[] words = 
			{"make", "america", "great", "again"}
		;
		int res = donate(speech,words);
		System.out.println(res);

	}
	public static int donate(String[] speech, String[] words) {
		int count = 0;
		for (String word : words) {
			for (int i = 0; i < speech.length; i++) {
				if (word.equals(speech[i])) count++;
			}
		}
		return count;
	}

}