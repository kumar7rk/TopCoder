package TopCoder;

import java.util.ArrayList;

public class TaroJiroDividing {
	public static void main(String[] args) {
		int A = 12;
		int B = 2;
		int result = getNumber(A,B);
		System.out.println(result);
	}
	public static int getNumber(int a, int b) {
		ArrayList<Integer> arrayListA = new ArrayList<>();
		ArrayList<Integer> arrayListB = new ArrayList<>();
		
		arrayListA.add(a);
		arrayListB.add(b);
		while (a%2==0) arrayListA.add(a/=2);
		while (b%2==0) arrayListB.add(b/=2);
		int count = 0;
		if (arrayListA.size()<arrayListB.size()){
			for (Integer integer : arrayListA) if (arrayListB.contains(integer)) count++;
		}
		else if (arrayListB.size()<=arrayListA.size()){
			for (Integer integer : arrayListB) if (arrayListA.contains(integer)) count++;
		}
		return count;
	}
}
