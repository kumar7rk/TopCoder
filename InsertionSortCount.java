// arena testing
package TopCoder;

public class InsertionSortCount {

	public static void main(String[] args) {
		int[] A = {20,40,30,10};
		int res = countMoves(A);
		System.out.println(res);
	}

	public static int countMoves(int[] A) {
		int count = 0;
		
		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i-1;
			while (j>=0 && A[j]>key) {
				count++;
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = key;
		}
		return count;
	}
}
