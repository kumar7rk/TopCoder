package TopCoder;

import java.util.HashSet;

public class SuperUserDo {

	public static void main(String[] args) {
		int[] A = {1,1};
		int[] B = {1,1};
		
		int res = install(A,B);
		System.out.println(res);
	}
	public static int install(int[] A, int[] B) {

		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < B.length; i++)
			for (int j = A[i]; j <= B[i]; j++)
				hashSet.add(j);
		return hashSet.size();
	}

}
