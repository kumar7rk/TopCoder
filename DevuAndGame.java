package topCoderV1dot1;

public class DevuAndGame {

	public static void main(String[] args) {
		int[] nextLevel = {44, 47, 16, 40, 18, 9, 33, 37, 41, 29, 36, 19, 32, 17, 24, 4, 3, 25, 10, 35, 5, 22, 14, 42, 38, 28, 31, 26, 2, 8, 11, 39, 30, 7, 32, 2, 20, 1, 12, 46, 27, 43, 45, 6, 21, 15, 23, 13}	;
		String result = canWin(nextLevel);
		System.out.println(result);
	}

	private static String canWin(int[] nextLevel) {
		int s = 0;
		for (int i = 0; i < nextLevel.length; i++) {
			s = nextLevel[s];
			if (s == -1) return "Win";
		}
		return "Lose";
	}

}
