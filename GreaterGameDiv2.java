package TopCoder;

public class GreaterGameDiv2 {

	public static void main(String[] args) {
	
		int[] snuke = {1,3};
		int[] sothe = {4,2};
		int res = calc(snuke,sothe);
		System.out.println(res);
	}

	public static int calc(int[] snuke, int[] sothe) {
		
		int res = 0;
		
		for (int i = 0; i < sothe.length; i++) {
			if (snuke[i]>sothe[i]) res++;
		}
		return res;
	}
}
