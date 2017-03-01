package topCoderV1dot1;

public class DivFreed2 {

	public static void main(String[] args) {
		int n = 2;
		int k = 2;
		int result = count(n,k);
		System.out.println(result);

	}

	private static int count(int n, int k) {
		int counter = 0;
		
//		ArrayList<Integer> arrayList = new ArrayList<>();
		if (n==0||k==0) return 1;
		
		for (int i = 0; i < n; i++) {
			int[] herosArray = new int[k*k];
			for (int j = 0; j < k; j++) {
				herosArray[i] = j;
			}
		}
		return counter;
	}

}
