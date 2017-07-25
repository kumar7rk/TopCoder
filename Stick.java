package TopCoder;

public class Stick {

	public static void main(String[] args) {
		int x = 23;
		int res = pieces(x);
		System.out.println(res);
	}


	public static int pieces(int x) {
		if(x==64) return 1;
		int res = 0;
		int s = 64;
		int s1 = 0;
		while (s1<x) {
			s/=2;
			while (s1+s<=x) {
				s1+=s;
				res++;
			}
		}
		return res;
	}
}
