package TopCoder;

import java.util.Arrays;

public class RoyalTreasurer {

	public static void main(String[] args) {
		int[] A = {1,1,1,6,0};
		int[] B = {2,7,8,3,1};
		int res = minimalArrangement(A,B);
		System.out.println(res);
	}

	public static int minimalArrangement(int[] A, int[] B) {
		int S = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		int j = 0;
		for (int i = A.length-1; i >=0; i--) S+= A[i]*B[j++];
		return S;
	}

}
