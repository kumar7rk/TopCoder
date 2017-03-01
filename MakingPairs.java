package topCoderV1dot1;

public class MakingPairs {

	public static void main(String[] args) {
		int[]card = 	{40, 43, 50, 47, 38, 21, 5, 35, 27, 20, 29, 35, 11, 35, 27, 39, 27, 40, 22, 44, 38, 12, 22, 49, 12, 11, 17, 43, 22, 42, 30, 45, 41, 11, 44, 40, 18, 1, 24, 17, 50, 45, 40, 12}	;
		int pairs = get(card);
		System.out.println(pairs);

	}
	private static int get(int[] card) {
		int pair = 0;
		for (int i = 0; i < card.length; i++) {
			pair+= card[i]/2;
		}
		return pair;
	}

}
