package TopCoder;

import java.util.ArrayList;

public class MinProduct {

	public static void main(String[] args) {
		int[] amount = 
			{0,1,1,2,1,1,0,0,0,0}
		;
		int blank1 = 2;
		int blank2 = 3;
		long res = findMin(amount,blank1,blank2);
		System.out.println(res);
	}

	public static long findMin(int[] amount, int blank1, int blank2) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < amount.length; i++) 
			for (int j = 0; j < amount[i]; j++) arrayList.add(i);
		
		for (int i = 0; i < blank1+blank2; i++) System.out.print(arrayList.get(i)+ ", ");
		System.out.println();
		long mul = 1;
		
		int [] taken = new int[blank1+blank2];
		for (int i = 0; i < blank1+blank2-1; i++) {
			String A = "";
			String B = "";
			A += arrayList.get(i);
			for (int j = i+1; j < blank1+blank2; j++) {
				if (i==j) continue;
				A += arrayList.get(j);
				B += arrayList.get(j);
			}
			System.out.println(A + " " + B);
			mul = Long.parseLong(A)*Long.parseLong(B);
			System.out.println(mul);
		}
		return 0;
	}

}
