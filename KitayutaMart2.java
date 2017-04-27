package TopCoder;

public class KitayutaMart2 {

	public static void main(String[] args) {

		int K = 160;
		int T = 163680;
		int res = numBought(K, T);
		System.out.println(res);
	}

	public static int numBought(int K, int T) {
		int res = K;
		int temp = 1;
		for (int i = 1; ; i++) {
			temp = (int)Math.pow(2, i);
			temp*=K;
			res+=temp;
			if (res==T) return i+1;
		}
	}

}
