package TopCoder;

import java.util.Arrays;

public class Cryptography {

	public static void main(String[] args) {
		int num[] = {1,3,2,1,1,3}
;
		long res = encrypt(num);
		System.out.println(res);
	}

	public static long encrypt(int[] num) {
		Arrays.sort(num);
		long sum = num[0]+1;
		for (int i = 1; i < num.length; i++) {
			sum*=num[i];
		}
		return sum;
	}
}