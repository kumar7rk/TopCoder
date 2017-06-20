package TopCoder;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplicationTable2Easy {

	public static void main(String[] args) {
	 	
		int[] table =	{2,2,2,2,2,2,
		 2,2,2,2,2,2,
		 2,2,2,2,2,2,
		 2,2,2,2,2,2,
		 2,2,2,2,2,2,
		 2,2,2,2,2,2};
		int[] t = {0,1,3,4,5};
		String s = isGoodSet(table,t);
		System.out.println(s);

	}

	private static String isGoodSet(int[] table, int[] t) {
		int n = (int) Math.sqrt(table.length);
		int k1 = 0,k2 = 0,k3 = 0,k4 = 0;
		String s = "Good";		
		for (int i = 0; i < t.length-1; i++) {
			for (int j = 1; j < t.length; j++) {
				k1 = table[t[i]*n+t[i]];//(1,1)
				k2 = table[t[i]*n+t[j]];//(1,0)
				k3 = table[t[j]*n+t[i]];//(0,1)
				k4 = table[t[j]*n+t[j]];//(0,0)
			}
		}
		System.out.println(k1+" "+k2+" "+k3+" "+k4);
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i : t) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
		if(arrayList.contains(k1)&&arrayList.contains(k2)&&arrayList.contains(k3)&&arrayList.contains(k4)){
		}
		else {
			s = "Not Good";
		}
		return s;
	}

}
