package TopCoder;

public class ChristmasTreeDecorationDiv2 {

	public static void main(String[] args) {
		int[] col = 	{32, 32, 32, 14, 14, 32, 14, 32, 32, 14, 32, 32, 14, 32, 14, 14, 32, 32, 14, 14, 14, 14, 32, 14, 32, 14, 14, 14, 32, 14, 14, 32, 14, 14, 32, 32, 32, 32, 32, 14};
		int[] x =  {26, 39, 15, 30, 25, 17, 38, 39, 15, 9, 9, 1, 17, 28, 22, 6, 5, 15, 4, 33, 2, 33, 35, 5, 11, 3, 40, 32, 8, 18, 37, 14, 37, 31, 19, 39, 29, 13, 14};
		int[] y =  {11, 1, 25, 10, 2, 21, 6, 20, 36, 16, 39, 30, 36, 24, 5, 16, 13, 7, 20, 9, 38, 27, 38, 34, 27, 25, 38, 21, 12, 33, 34, 17, 10, 5, 30, 8, 7, 24, 23};
		int result = solve(col,x,y);
		System.out.println(result);
	}

	private static int solve(int[] col, int[] x, int[] y) {
		int counter = 0;
		for (int i = 0; i < y.length; i++) {
			if (col[x[i]-1]!=col[y[i]-1]) {
				counter++;
			}
		}
		return counter;
	}

}



