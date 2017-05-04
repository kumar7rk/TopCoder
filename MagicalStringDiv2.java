package TopCoder;

public class MagicalStringDiv2 {

	public static void main(String[] args) {
		String S = "<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><";
		int res = minimalMoves(S);
		System.out.println(res);

	}

	public static int minimalMoves(String S) {
		int n = S.length();
		int n_2 = n/2;
		int res = 0;
		for (int i = 0; i < n_2; i++) {
			char c = S.charAt(i);
			if (c=='<') res++;
		}
		for (int i = n_2; i < n; i++) {
			char c = S.charAt(i);
			if (c=='>') res++;
		}
		return res;
	}

}
