package TopCoder;

public class HighScore {

	public static void main(String[] args) {
		int scores[] = 
			{90, 80, 70, 60, 50, 40, 40, 30, 20, 10, 0}
		;
		int newscore = 35;
		int places = 12;
		int res = getRank(scores, newscore, places);
		System.out.println(res);
	}
	public static int getRank(int[] scores, int newscore, int places){
		int lesser = 0, same = 0;
		for (int i = 0; i < scores.length; i++) {
			if (newscore==scores[i]) same++;
			if (newscore<scores[i]) lesser++;
		}
		if ((lesser+same>=places)) return -1;
		return lesser+1;
	}
}