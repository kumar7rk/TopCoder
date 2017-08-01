package TopCoder;

import java.util.ArrayList;
import java.util.TreeSet;

public class TaroJiroDividing {
	public static void main(String[] args) {
		int A = 9900032;
		int B = 39600128;
		int result = getNumber(A,B);
		System.out.println(result);
	}
	public static int getNumber(int a, int b) {
		int result = 0;
		ArrayList<Integer> arrayListA = new ArrayList<>();
		ArrayList<Integer> arrayListB = new ArrayList<>();
		arrayListA.add(a);
		arrayListB.add(b);
		if (a%2!=0 || b%2!=0 || (a%b!=0 && a>b )|| (b%a!=0 && a<b)) return 0;
		while (a%2==0) arrayListA.add(a/=2);
		while (b%2==0) arrayListB.add(b/=2);
		if (arrayListA.size()<arrayListB.size()) result = arrayListA.size();
		else result = arrayListB.size();
		return result;
	}
}
