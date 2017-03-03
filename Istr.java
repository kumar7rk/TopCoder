package TopCoder;

import java.util.ArrayList;
import java.util.Collections;

import icsV1dot1.Time;

public class Istr {

	public static void main(String[] args) {
		Time.startTime();
//		String s = "wersrsresesrsesrawsdsw";
//		String s = 	"maoonescoqgalisojljkdookofjpelhmnhooqbodjio";
//		int k = 11;
		String s = "jeonkhmoibnkojlionoijlhdcgoooollnfomomlnojigjgmebo";
		int k = 21;
		int result = count(s,k);
		System.out.println(result);
		Time.endTime();
	}

	private static int count(String s, int k) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		int[] count = new int[26];
		int result = 0;
		int max = 0;
		frequency(s, count);
		max = getArrayList(arrayList, count, max);
		k = newArray(k, arrayList);
		return getSum(arrayList, result);
	}

	public static int getArrayList(ArrayList<Integer> arrayList, int[] count, int max) {
		for (int val : count) {
			max = max < val ? val : max ;
			if (val>0){
				arrayList.add(val);
			}
		}
		return max;
	}

	public static void frequency(String s, int[] count) {
		char c;
		for (char i = 'a'; i < 'z'; i++) {
			for (int j = 0; j < s.length(); j++) {
				c = s.charAt(j);
				if (c==i) 
					count[i-'a']++;
			}
		}
	}

	public static int newArray(int k, ArrayList<Integer> arrayList) {
		while (k>0) {
			Collections.sort(arrayList);
			Collections.reverse(arrayList);
//			System.out.println(arrayList);
			int a1 = arrayList.get(0);
			int a2 = arrayList.get(1);
			int diff = a1-a2+1;
//			System.out.println("diff:"+diff);
			if (diff>k){
				k-=(diff-1);
				arrayList.set(0, a2);
			}
			if (k>0){				
				k -= diff;
				arrayList.set(0, a2-1);
			}
//			System.out.println("k:"+k);
		}
		return k;
	}

	public static int getSum(ArrayList<Integer> arrayList, int result) {
		for (Integer integer : arrayList) {
//			System.out.print(integer+" ");
			result+=integer*integer;
		}
		return result;
	}
}