package TopCoder;

public class HighScore {

	public static void main(String[] args) {
		int scores[] = {2000000000, 19539, 19466, 19146, 17441, 17002, 16348, 16343, 15981, 15346, 14748, 14594, 13752, 13684, 13336, 13290, 12939, 12208, 12163, 12133, 11621, 11119, 10872, 10710, 10390, 9934, 9296, 8844, 8662, 8653, 8168, 7914, 7529, 7354, 6016, 5428, 5302, 5158, 4853, 4538, 4328, 3443, 3222, 2107, 2107, 1337, 951, 586, 424, 31};
		int newscore = 1337	;
		int places = 50;
		int res = getRank(scores, newscore, places);
		System.out.println(res);
	}
	public static int getRank(int[] scores, int newscore, int places){
		int res = -1;
		if (newscore<scores[scores.length-1]) return scores.length+1;
		if (newscore==scores[scores.length-1] && scores.length==places) return -1;
		for (int i = 0; i < scores.length-1; i++) {
			if (newscore <= scores[i] && newscore >=scores[i+1]) {
				if (newscore==scores[i]) return i+1;
				if (newscore==scores[i+1] && i+1 < scores.length-1) return i+2;
				else if (newscore==scores[i+1] && i+1 == scores.length-1) return -1;
				else return i+2;
			}
		}
		return res;
	}
}