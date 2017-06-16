package TopCoder;

import java.util.Arrays;

public class MinDifference {

	public static void main(String[] args) {
		int A0 =  3;
		int X = 7;
		int Y = 1;
		int M = 101;
		int n = 5;
		int res = closestElements(A0,X,Y,M,n);
		System.out.println(res);
	}

	public static int closestElements(int A0, int X, int Y, int M, int n) {
		int[] A = new int[n];
		int min = Integer.MAX_VALUE;
		A[0] = A0;
		for (int i = 1; i < n; i++) A[i] = (A[i-1]*X+Y)%M; 
		Arrays.sort(A);
		for (int i = 0; i < A.length-1; i++) {
			int diff = A[i+1]-A[i]; 
			if (diff<min) min = diff;
		}
		return min;
	}

}
