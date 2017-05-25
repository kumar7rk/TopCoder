package TopCoder;

import java.util.Arrays;

public class SortMachine {

	public static void main(String[] args) {
		int []a = 	
			{269, 214, -460, -438, 488, 665, 854, 887, -255, -688, -766, -879, -518, 374, 17, -49, 642, -837, -555, 880, 267, 200, -117, -495, 635, -659, -37, -332, -945, -632, -968, -612, 18, 678, 146, -725, 866, -748, 276, -892, -970, 157, -215, -717, 260, -314}	;
		int res = countMoves(a);
		System.out.println(res);
	}

	public static int countMoves(int[] a) {
		int[]b = new int[a.length];
		b = a.clone();
		Arrays.sort(b);
		int res = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i]==b[res]) {
				res++;
			}
		}
		return a.length-res;
	}
}