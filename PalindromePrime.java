package TopCoder;

import projectEulerV1dot1.Library;

public class PalindromePrime {

	public static void main(String[] args) {
		int L = 23;
		int R = 928;
		int result = count(L,R);
		System.out.println(result);
	}

	private static int count(int l, int r) {
		int count = 0;
		for (int i = l; i <= r; i++) {
			if(Library.palindrome(i)&&Library.isPrime(i)){
				count++;				
			}
		}
		return count;
	}

}
