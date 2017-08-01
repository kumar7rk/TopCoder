package TopCoder;

public class TriFibonacci{
	public static void main(String[] args){
		int[]A = {10, 20, 30, 60, -1, 200};
		int res = complete(A);
		System.out.println(res);
	}
	public static int complete(int[] A){
		int []B = A;
		int res = 0;
		int index = 0;
		for (int i = 0; i < A.length; i++) if (A[i] == -1) index = i;
		if (index > 2) {
			for (int i = 3; i < A.length; i++) {
				int value = 0;
				value = A[i-1] + A[i-2] + A[i-3];
				if (A[i] == -1) {
					res = A[index-1] + A[index-2] + A[index-3];
					break;
				}
				if (value != A[i] && A[i]!=-1){
					return -1;
				}
			}
		}
		else if (index == 0) res = A[3]-A[1]-A[2];
		else if (index == 1) res = A[3]-A[0]-A[2];
		else if (index == 2) res = A[3]-A[0]-A[1];
		if (res <= 0) res = -1;		
		for (int i = 0; i < B.length; i++) B[index] = res;
		for (int i = 3; i < A.length; i++) {
			if (i == index) B[i] = res;
			int value = B[i-1] + B[i-2] + B[i-3];
			if (value != B[i]) return -1;
		}
		return res;
	}
}