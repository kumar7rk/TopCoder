package TopCoder;

public class KitayutaMart2 {

	public static void main(String[] args) {

		int K = 155;
		int T = 79205	;
		int res = numBought(K, T);
		System.out.println(res);
	}

	public static int numBought(int K, int T) {
		int res = 0;
		int temp = 1;
		for (int i = 0; ; i++) {
			temp = (int)Math.pow(2, i);
			temp*=K;
			res+=temp;
			if (res==T) return i+1;
		}
	}

}
