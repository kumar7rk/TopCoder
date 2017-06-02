package TopCoder;

import java.util.Arrays;

public class TriangleMaking {

	public static void main(String[] args) {
		int a = 21;
		int b = 22;
		int c = 24;
		int res = maxPerimeter(a,b,c);
		System.out.println(res);
	}

	public static int maxPerimeter(int a, int b, int c) {
		int res[] = new int[3];
		res[0] = a;
		res[1] = b;
		res[2] = c;
		Arrays.sort(res);
		if (res[0]+res[1]>res[2])
			return a+b+c;
		else
			return 2*(res[0]+res[1])-1;
	}
	

}
